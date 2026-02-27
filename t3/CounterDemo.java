package t3;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter("Alpha", 101, 50.5);
        Counter c2 = new Counter("Beta", 102, 75.0);
        Counter c3 = new Counter("Gamma", 103, 100.2);

        c1.display();
        c2.display();
        c3.display();

        // Accessing static variable via static method
        System.out.println("Total instances created: " + Counter.getInstanceCount());
    }
}
