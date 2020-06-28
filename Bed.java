public class Bed {
    private String color;
    private int size;

    public Bed(String color, int size) {
        this.color = color;
        this.size = size;
    }
    public  void makeBed(){
        System.out.println("Constructing bed of size " + size + " inches and color is " + color);
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
