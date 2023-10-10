public class Car {

    int speed;

    public void showSpeed() {
        System.out.println(this.speed);
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
        showSpeed();
        newSpeed = 8;
        speed = 3;
        setSetSpeed(newSpeed);
        showSpeed();
    }

    public void setSetSpeed(int speed) {
        showSpeed();
        speed = speed;
        this.speed = speed;
        showSpeed();
    }

    public static void main(String... args) {
        Car car = new Car();
        car.setSpeed(12);
    }
}
