public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(2.5);
        System.out.println(cylinder);
        cylinder=new Cylinder(2.5,"blue",1.5);
        System.out.println(cylinder);
        double area=cylinder.Area();
        System.out.println(area);
        double volume=cylinder.getVolume();
        System.out.println(volume);
    }
}
