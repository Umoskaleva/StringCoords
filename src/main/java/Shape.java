public abstract class Shape { // класс для рисования графических фигур
    public static final String DEFAULT_COLOR = "black";

    private String color;

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();


}
