import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassFile;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Сергей", 21);
        Student s2 = new Student("Андрей", 25);
        Student s3 = new Student("Иван", 23);
        Student s4 = new Student("Дарья", 24);
        Student s5 = new Student("Света", 22);
        Student s6 = new Student("Игорь", 21);
        Student s7 = new Student("Мария", 21);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        ModelClassFile fModel = new ModelClassFile("StudentDB.csv");
        //fModel.saveAllStudentToFile(students);


        //ModelClassList modelList = new ModelClassList(students);
        //ViewClass view = new ViewClass();

        iGetModel modelList = fModel;//new ModelClassList(students);
        iGetView view = new ViewClass();

        ControllerClass controller = new ControllerClass(modelList, view);

       // controller.update();
       controller.run();


    }
}
