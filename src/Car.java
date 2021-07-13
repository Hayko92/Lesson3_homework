import java.util.Objects;

public final class Car {
    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        Engine engineClone = new Engine();
        engineClone.setHorsePower(engine.getHorsePower());
        engineClone.setWeight(engine.getWeight());
        engineClone.setMileage(engine.getMileage());
        this.engine = engineClone;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        Engine engineClone = new Engine();
        engineClone.setMileage(this.engine.getMileage());
        engineClone.setHorsePower(this.engine.getHorsePower());
        engineClone.setWeight(this.engine.getWeight());
        return engineClone;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }
}
