package DecoratorDesignPattern;
interface Shape{
    String shapeInfo();
}
class Circle implements Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String shapeInfo() {
        return "A circle with radius :: "+radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
class Rectangle implements Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    @Override
    public String shapeInfo() {
        return "A rectangle with length::"+length+" and breadth::"+breadth;
    }
}

class ColoredShape implements Shape{
    Shape shape;
    String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String shapeInfo()
    {
      return shape.shapeInfo()+ " color of shape is :: "+color;
    }
}
class Transparency implements Shape{
    Shape shape;
    int opacity;

    public Transparency(Shape shape, int opacity) {
        this.shape = shape;
        this.opacity = opacity;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    @Override
    public String shapeInfo() {
        return shape.shapeInfo()+" transparency percent is :: "+opacity;
    }
}

public class CircleDecoratorMain {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(10,30);
        System.out.println(rectangle.shapeInfo());
        ColoredShape coloredShape= new ColoredShape(rectangle,"red");
        System.out.println(coloredShape.shapeInfo());
        Transparency transparency= new Transparency((new ColoredShape(new Rectangle(10,80),"pink")), 90);
        System.out.println(transparency.shapeInfo());


    }
}
