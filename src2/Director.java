package homework2109;

import java.util.Arrays;

public class Director extends Employee {

    public Director(String name, String surname, int experience, Employee[] employees) {
        super(name, surname, experience);
        this.employees = employees;
    }



    @Override
    public Position getPosition() {
        return Position.DIRECTOR;
    }

    Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public int calculationSalary() {
        int salary = 27 * experience * getPosition().getCoefficient() * employees.length;
        return salary;
    }

    @Override
    public String toString() {
        return "\nDirector " + getName() + " " + getSurname() + ", Experience: " + experience
                + "," + " position -" + getPosition() + ", Salary- " + calculationSalary() +"\n" + Arrays.toString(employees);
    }


}







