public class Point extends Shape {
    private Coords coords;

    public Point(Coords coords) { // точка координат с цветом
        this.coords = coords;
    }

    public int getX() {
        return coords.getX();
    }

    public void setX(int y) {
        coords.setX(y);
    }

    public int getY() {
        return coords.getY();
    }

    public void setY(int y) {
        coords.setY(y);
    }

    public void draw() {
        System.out.printf("Point (%d, %d) Color: %s\n",
                getX(), getY(), getColor());
    }



}
