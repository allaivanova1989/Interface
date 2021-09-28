package homework2109;

public abstract class Employee extends Person {
    protected int experience;

    public Employee(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;
    }

    public abstract Position getPosition();

    public abstract int calculationSalary();

    @Override
    public String toString() {
        return super.toString() + "experience=" + experience + "," + "Position -" + getPosition()
                + " Salary-" + calculationSalary() + "}";
    }
}
