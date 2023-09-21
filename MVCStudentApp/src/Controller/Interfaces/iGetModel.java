package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    /**
     * Возвращает список всех студентов.
     *
     * @return список студентов
     */
    List<Student> getStudents();

    /**
     * Удаляет из списка студента с заданным id.
     *
     * @param id id студента
     * @return true если студент удален из списка, false если id студента не найден
     */
    boolean deleteStudent(int id);
}
