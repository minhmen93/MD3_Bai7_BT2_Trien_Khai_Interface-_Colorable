public class Circle implements Colorable {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI* radius*radius;
    }

    @Override
    public int howToColor() {
        return 0;
    }
}
