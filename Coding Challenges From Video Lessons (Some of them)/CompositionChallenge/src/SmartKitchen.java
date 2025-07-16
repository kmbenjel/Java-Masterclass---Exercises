public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private  Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                       boolean dishwasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishwasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    @Override
    public String toString() {
        return "SmartKitchen{" +
                "brewMaster=" + brewMaster +
                ", dishWasher=" + dishWasher +
                ", iceBox=" + iceBox +
                '}';
    }
}

class DishWasher {
    protected boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishes done!");
            hasWorkToDo = false;
        }
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }
}

class Refrigerator {
    protected boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food ordered!");
            hasWorkToDo = false;
        }
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }
}

class CoffeeMaker {
    protected boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee brewed!");
            hasWorkToDo = false;
        }
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }
}


