package by.it.baranovskaya.jd02_04;

abstract class Var implements Operation {
    static Var createVar(String operand) {
        operand = operand.trim().replace("\\s+","");
        if(operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if(operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        if(operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        return null;
    }
    @Override
    public String toString() { //наследуется от object
        return "Это класс Var";
    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения "+this+ "+" + other +" невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания "+this+ "+" + other +" невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения "+this+ "+" + other +" невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления "+this+ "+" + other +" невозможна");
        return null;
    }
}
