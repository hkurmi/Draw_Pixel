package harshit;

public class Case {
    private final String model;
    private final String manufacturer;
    private final String powerSupply;
    private final Dimensions directions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions directions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.directions = directions;
    }
    public void pressPowerButton(){
        System.out.println("power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDirections() {
        return directions;
    }
}
