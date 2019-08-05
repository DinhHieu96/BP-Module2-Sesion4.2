public class Circle {
    private String color="green";
    private double radius=1.0;
    public Circle(){
    }
    public Circle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double Area(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with color of "
                +getColor()
                +" and radius of "
                +getRadius();
    }
}
