public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine() {
        return "Holden engine started";
    }

    public String accelerate() {
        return "Holden accelerating";
    }

    public String brake() {
        return "Holden braking";
    }
}
