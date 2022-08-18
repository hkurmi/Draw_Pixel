package harshit;

public class Motherboard {
    private final String model;
    private final String manufactaror;

    public Motherboard(String model, String manufactaror, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactaror = manufactaror;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("program"+programName+"");
    }
    public String getModel() {
        return model;
    }

    public String getManufactaror() {
        return manufactaror;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    private final int ramSlots;
    private final int cardSlots;
    private final String bios;


}
