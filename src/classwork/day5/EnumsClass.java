package classwork.day5;

public class EnumsClass {

    public void printColor(String color) {
        String aColor = color;
        switch (aColor) {
            case ConstantContainer.RED:
                System.out.println(ConstantContainer.RED);
                break;
            case ConstantContainer.BLUE:
                System.out.println(ConstantContainer.BLUE);
                break;
            case ConstantContainer.GREEN:
                System.out.println(ConstantContainer.GREEN);
                break;
            case ConstantContainer.YELLOW:
                System.out.println(ConstantContainer.YELLOW);
                break;
            case ConstantContainer.PURPLE:
                System.out.println(ConstantContainer.PURPLE);
                break;
        }
    }

    public static void main(String[] args) {
        EnumsClass enumsClass = new EnumsClass();
        enumsClass.printColor(ConstantContainer.BLUE);
    }

}
