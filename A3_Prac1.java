import java.util.Date;

abstract class GeometricObject
{
    String color;
    boolean filledOrNot;
    Date dateCreated=new Date();
    GeometricObject(){}
    GeometricObject(String color, boolean filledOrNot)
    {
        this.color=color;
        this.filledOrNot=filledOrNot;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public void setFilled(boolean filled)
    {
        filledOrNot=filled;
    }
    public boolean isFilled()
    {
        return filledOrNot;
    }
    public void getDateCreated()
    {
        System.out.println("Created on: "+dateCreated.toString());
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}
class Circle1 extends GeometricObject
{
    private double radius;
    Circle1(){}
    Circle1(double radius)
    {
        this.radius=radius;
    }
    Circle1(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getDiameter()
    {
        return radius*2;
    }
    public double getArea()
    {
        return (22*radius*radius)/7;
    }
    //creating method for perimeter
    public double getPerimeter()
    {
        return (2*22*radius)/7;
    }
}
class Rectangle extends GeometricObject
{private double width;
    private double height;
    Rectangle(){}
    Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    Rectangle(double width, double height, String color, boolean
            filled)
    {
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth()
    {
        return width;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return (2*(width+height));
    }
}
public class A3_Prac1
{
    public static void main(String[]args)
    {
        Circle1 obj1=new Circle1(2.1,"Red",true);
        Rectangle obj2=new Rectangle(4.58,2.27,"White",false);
        System.out.println("For Circle :-");
        System.out.println("Radius : "+obj1.getRadius());
        System.out.println("Diameter : "+obj1.getDiameter());
        System.out.println("Perimeter : "+obj1.getPerimeter());
        System.out.println("Area : "+obj1.getArea());
        System.out.println("\nFor Rectangle :-");
        System.out.println("Width : "+obj2.getWidth());
        System.out.println("Height : "+obj2.getHeight());
        System.out.println("Perimeter : "+obj2.getPerimeter());
        System.out.println("Area : "+obj2.getArea());
    }
}
