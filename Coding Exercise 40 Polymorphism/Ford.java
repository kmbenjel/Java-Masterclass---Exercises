public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine() {
        return "Ford engine started";
    }

    public String accelerate() {
        return "Ford accelerating";
    }

    public String brake() {
        return "Ford braking";
    }
}
