public class Main {
    public static double area(double width, double height) {
    if (width < 0 || height < 0) {
        return -1;
    }
  return width * height;
}

public static double area(double radius) {
    if (radius < 0) {
        return -1;
    }
    
    return radius * radius * Math.PI;
}

 public static void main(String[] args) {
    System.out.println(area(5.0, 4.0));
    System.out.println(area(-1.0, 4.0));

    System.out.println(area(5.0));
    System.out.println(area(-1.0));
    
 }
}