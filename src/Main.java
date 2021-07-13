public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(100, 50, 200);
        Car car = new Car(2008, "Nissan", "Maxima", engine);
        System.out.println(car);
        Engine engine1 = car.getEngine();
        engine1.setHorsePower(2000);
        System.out.println(car);
    }
}
