package homework2109;

public enum Position {

    DIRECTOR(3),
    WORKER(2);
    private int coefficient;

    Position(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}
