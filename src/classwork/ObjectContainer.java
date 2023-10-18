package classwork;

public class ObjectContainer {

    private Object[] objects = new Object[10];
    int a;

    public void add(Object incoming) {
        if (a < objects.length) {
            objects[a++] = incoming;
        } else {
            System.out.println("массив заполнен");
        }
    }

    public Object removeLast() {
        Object objectToReturn = null;
        if (a > 0) {
            objectToReturn = objects[a-- - 1];
        }
        return objectToReturn;
    }

    public boolean isEmpty() {
        return a == 0;
    }

}
