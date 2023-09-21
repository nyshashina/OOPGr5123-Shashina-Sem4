package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassFile implements iGetModel {
    private String fileName;

    /**
     * Создает и открывает для записи файл для списка студентов.
     *
     * @param fileName путь до файла со списком студентов
     */
    public ModelClassFile(String fileName) {
        this.fileName = fileName;

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                // В файле атрибуты студента разделены пробельными символами.
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    /**
     * Записывает список студентов в файл.
     *
     * @param students список студентов
     */
    public void saveAllStudentToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student pers : students) {
                // В файле атрибуты студента разделены пробельными символами.
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public boolean deleteStudent(int id) {
        return false;
    }
}
