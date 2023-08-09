public class Cricle implements Shape {
    
    private double radius;

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
