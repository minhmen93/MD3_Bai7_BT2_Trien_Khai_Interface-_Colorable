public class Square implements Colorable {
    private double side;
    public Square(){}

    public Square(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }

    @Override
    public int howToColor() {
        System.out.println("Color all four sides ");
        return 0;
    }
}
