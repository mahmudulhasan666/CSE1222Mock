package q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker worker = new Worker("Alice", 5000);
        Supervisor supervisor = new Supervisor("Bob", 7000, "Sales");
        Director director = new Director("Charlie", 10000, "Operations");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
