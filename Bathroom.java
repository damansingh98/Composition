public class Bathroom {
    private String ToiletSeat;
    private boolean door;
    private String color;

    public Bathroom(String toiletSeat, boolean door, String color) {
        ToiletSeat = toiletSeat;
        this.door = door;
        this.color = color;
    }
    public  void buildingBathroom(){
        if(door == true){
        System.out.println("A door is present.");
    }
        if(door == false){
            System.out.println("A door is absent.");
        }
        System.out.printf("The bathroom is  %s style and color of bathroom is %s.", ToiletSeat, color);
    }

    public String getToiletSeat() {
        return ToiletSeat;
    }

    public boolean isDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }
}
