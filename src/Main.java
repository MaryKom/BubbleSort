public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int maxSize = 100;
        ArrayBub arr = new ArrayBub(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(22);
        arr.insert(88);

        arr.display();
        arr.bubbleSort();
        arr.display();
    }
}