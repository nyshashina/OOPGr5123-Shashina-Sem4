package Model;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

import java.util.HashMap;
import java.util.List;

/**
 * Класс модели списка студентов на базе хешмэпа,
 * содержащий id студента в качестве ключа и экземпляр класса студент в качестве значения.
 */
public class ModelClassHash implements iGetModel {
    private final HashMap<Long, Student> students;

    public ModelClassHash(List<Student> studentsList) {
        this.students = new HashMap<>();
        for (Student st : studentsList) {
            addStudent(st);
        }
    }

    public ModelClassHash() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put((long) student.getId(), student);
    }

    public boolean deleteStudent(int id) {
        if (students.containsKey((long) id)) {
            students.remove((long) id);
            return true;
        } else {
            return false;
        }
    }

    public List<Student> getStudents() {
        return students.values().stream().toList();
    }
}
