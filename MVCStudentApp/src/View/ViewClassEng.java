package View;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс консольного интерфейса на английском языке.
 */
public class ViewClassEng implements iGetView {


    public void printAllStudent(List<Student> students) {
        System.out.println("----------- List of students -----------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    @Override
    public String promptEnterCommand() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the command (LIST / EXIT / DELETE)");
        return in.nextLine();
    }

    public void printStudentListEmpty() {
        System.out.println("List of students is empty.");
    }

    public void printExit() {
        System.out.println("Exiting the program");
    }

    public int promptEnterId() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student id");
        return in.nextInt();
    }

    public void printDeleteResult(boolean deleted) {
        if (deleted) {
            System.out.println("Student has been deleted.");
        } else {
            System.out.println("Student with such id not found.");
        }
    }

}