package t5;

// A generic Box class
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        // String Box
        Box<String> nameBox = new Box<>();
        nameBox.setContent("Java Programming");
        System.out.println("String Box: " + nameBox.getContent());

        // Integer Box
        Box<Integer> numberBox = new Box<>();
        numberBox.setContent(2024);
        System.out.println("Integer Box: " + numberBox.getContent());
    }
}
