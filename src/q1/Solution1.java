package q1;

class Worker {
    private String name;
    private double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Worker: Name = " + name + ", Wage = " + wage;
    }
}

class Supervisor extends Worker {
    private String division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }

    @Override
    public String toString() {
        return "Supervisor: Name = " + super.toString().split(":")[1] + ", Division = " + division;
    }
}

class Director extends Supervisor {
    public Director(String name, double wage, String division) {
        super(name, wage, division);
    }

    @Override
    public String toString() {
        return "Director: " + super.toString();
    }
}
