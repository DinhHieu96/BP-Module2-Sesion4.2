public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height,String color,double radius){
        super(color,radius);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return getRadius()*getRadius()*height*Math.PI;
    }
    @Override
    public String toString(){
        return "A Cylinder with color of "
                +getColor()
                +",radius of "
                +getRadius()
                +" and height of "
                +getHeight();
    }
}
