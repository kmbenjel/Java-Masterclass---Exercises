public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Mitsubishi engine started";
    }

    public String accelerate() {
        return "Mitsubishi accelerating";
    }

    public String brake() {
        return "Mitsubishi braking";
    }
}
