public class Bedroom {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bathroom bathroom;
    private Lamp lamp;
    private Bed bed;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Bed bed) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public static void main(String[] args) {
        Wall wall1 = new Wall(12, 13, "West");
        Wall wall2 = new Wall(12,13,"East");
        Wall wall3 = new Wall(12,13,"North");
        Wall wall4 = new Wall(12,13,"South");
        Lamp lamp1 = new Lamp("Blue", true);
        Bed bed = new Bed("White", 22);
        Bathroom bathroom = new Bathroom("English", false, "Red");
        wall1.loadWall();
        wall2.loadWall();
        wall3.loadWall();
        wall4.loadWall();
        lamp1.TurnOnLamp();
        bed.makeBed();
        bathroom.buildingBathroom();


    }
}
