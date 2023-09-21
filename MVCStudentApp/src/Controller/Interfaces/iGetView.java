package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetView {

    /**
     * Выводит список студентов.
     * @param students Список студентов
     */
    void printAllStudent(List<Student> students);

    /**
     * Выводит сообщение о завершении программы.
     */
    void printExit();


    /**
     * Запрос команды у пользователя.
     * @return команда, введенная пользователем
     */
    String promptEnterCommand();

    /**
     * Выводит сообщение о том, что список студентов пуст.
     */
    void printStudentListEmpty();

    /**
     * Запрос у пользователя id студента.
     * @return id студента, введенный пользователем
     */
    int promptEnterId();

    /**
     * Выводит сообщение о том, что студент удален из списка или его id не найден.
     * @param deleted true если студент удален из списка, false если id студента не найден
     */
    void printDeleteResult(boolean deleted);
}
