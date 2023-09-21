package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;


    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Метод с основным циклом взаимодействия с пользователем.
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.promptEnterCommand();
            // Если пользователь ввел неверную команду, работа программы не прервется.
            try {
                com = Command.valueOf(command.toUpperCase());
            } catch (IllegalArgumentException ex) {
                continue;
            }
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    view.printExit();
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                case DELETE:
                    view.printDeleteResult(model.deleteStudent(view.promptEnterId()));
                    break;
            }
        }
    }
}
