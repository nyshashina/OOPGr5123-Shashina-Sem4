package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Command;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Класс консольного интерфейса на русском языке.
 */
public class ViewClass implements iGetView {
    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Список студентов -----------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }


    public void printStudentListEmpty() {
        System.out.println("Список студентов пуст.");
    }

    public void printExit() {
        System.out.println("Выход из программы");
    }

    @Override
    public String promptEnterCommand() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите команду (LIST / EXIT / DELETE)");
        return in.nextLine();
    }

    public int promptEnterId() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id студента");
        return in.nextInt();
    }

    public void printDeleteResult(boolean deleted) {
        if (deleted) {
            System.out.println("Студент удален.");
        } else {
            System.out.println("Студент с таким id не найден.");
        }
    }

}
