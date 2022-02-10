public class Rectangle {
    double width;
    double height;
    public Rectangle() {

    }
    public Rectangle (double wight, double height) {
        this.height = height;
        this.width = wight;
    }
    public double getArea() {
        return height*width;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
