package Controllers;

import Domen.Person;
import Domen.Teacher;

public class AccountController {

    public <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

}
