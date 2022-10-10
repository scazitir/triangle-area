package entities;

public class Triangle {

    //Class attributes
    public double a;
    public double b;
    public double c;

    //Class methods
    public double area(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
