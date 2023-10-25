package classwork.day5;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        objectContainer.add(2);
        objectContainer.add(4);
        objectContainer.add(8);
        objectContainer.add(10);
        objectContainer.add(12);
        objectContainer.add(14);
        objectContainer.add(16);
        objectContainer.add(18);
        objectContainer.add(20);
        objectContainer.add(22);


        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());
        }

    }

}
