
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricObject> geo = new ArrayList<>();

        geo.add(new GeometricObject());
        geo.add(new Circle(2.0, "red", true));
        geo.add(new Rectangle(1.0, 2.0, "blue", false));

        for (int i = 0; i < geo.size(); i++){
            System.out.println(geo.get(i));
        }
    }
}

class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreated;

    GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }
    GeometricObject(String color, boolean filled){
        this();
        this.color = color;
        this.filled = filled;
    }

    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }

    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }

    Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "GeometricObject " + color+ " " + filled + " " + dateCreated;
    }
}

class Circle extends GeometricObject{
    private double radius;

    Circle(){
//        this.radius = 1;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    double getDiameter(){
        return 2*radius;
    }

    @Override
    public String toString(){
        return super.toString() + " Circle: " + radius;
    }
}

class Rectangle extends GeometricObject{
    private double width;
    private double height;

    Rectangle(){

    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width = width;
    }
    double getHeight(){
        return height;
    }
    void setHeight(double height){
        this.height = height;
    }

    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return (width + height) * 2;
    }

    @Override
    public String toString(){
        return super.toString() + " Rectangle: " + width+ " " + height;
    }

}