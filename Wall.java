public class Wall {
    private  int height, width;
    private String direction;

    public Wall(int height, int width, String direction) {
        this.height = height;
        this.width = width;
        this.direction = direction;
    }
    public void loadWall(){
        System.out.println("Walls are being built as suggested with " + height + " ft x " + width + " ft and facing towards " + direction);

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
