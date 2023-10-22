package classwork;

public class GenericContainer<T> {

    private T[] objects = (T[]) new Object[10];
    int a;

    public void add(T incoming) {
        if (a < objects.length) {
            objects[a++] = incoming;
        } else {
            System.out.println("массив заполнен");
        }
    }

    public T removeLast() {
        T objectToReturn = null;
        if (a > 0) {
            objectToReturn = objects[a-- - 1];
        }
        return objectToReturn;
    }

    public boolean isEmpty() {
        return a == 0;
    }

    public static void main(String[] args) {
        GenericContainer<String> container = new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            container.add(String.valueOf(i));
        }
        System.out.println(container + "-created!\n");
        while (!container.isEmpty()) {
            int integer = Integer.parseInt(container.removeLast());
            System.out.println("Number" + integer + "removed");
        }
    }
}
