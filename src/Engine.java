import java.util.Objects;

public class Engine {
    private int horsePower;
    private int weight;
    private int mileage;

    public Engine(int horsePower, int weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }

    public Engine() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", weight=" + weight +
                ", mileage=" + mileage +
                '}';
    }
    public Engine copy() {
        Engine engineClone = new Engine();
        engineClone.setMileage(this.getMileage());
        engineClone.setHorsePower(this.getHorsePower());
        engineClone.setWeight(this.getWeight());
        return engineClone;
    }
}
