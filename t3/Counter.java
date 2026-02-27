package t3;


public class Counter {
    // Static variable shared across all instances
    private static int instanceCount = 0;
    
    // Instance variables with different access modifiers
    public String name;
    protected int id;
    private double value;

    public Counter(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
        instanceCount++;
    }

    // Static method to get the total count
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Method to display info
    public void display() {
        System.out.println("Counter: " + name + " | ID: " + id + " | Value: " + value);
    }
}
