package homework2109;

public class Worker extends Employee {
    public Worker(String name, String surname, int experience) {
        super(name, surname, experience);
    }


    @Override
    public Position getPosition() {
        return Position.WORKER;
    }

    public int calculationSalary() {
        int salary = 27 * experience * getPosition().getCoefficient();
        return salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
