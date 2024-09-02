package classes_basic;

public class Box {
    private double width = 0;
    private double height = 0;
    private double depth = 0;

    public Box() {
    }

    public Box(double width, double height, double depth) {
        setDepth(depth);
        setHeight(height);
        setWidth(width);
    }

    public Box(Box b) {
        setWidth(b.getWidth());
        setDepth(b.getDepth());
        setHeight(b.getHeight());
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getVolume() {
        return depth * height * width;
    }


}
