public class Lamp {
    private String colorType;
    private boolean hasBattery;

    public Lamp(String colorType, boolean hasBattery) {
        this.colorType = colorType;
        this.hasBattery = hasBattery;
    }
    public void TurnOnLamp(){
        System.out.println("Turning on the lamp with the following customizations --> " + colorType + ", " + hasBattery);
    }
    public void TurnOffLamp(){
        System.out.println("Turning off lamp in 3, 2, 1 .... OFF!");

    }
    public String getColorType() {
        return colorType;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }
}
