package Task6_Rectangle;

public class main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,4);
        System.out.println( "The area of the rectangle is: " + rect.calculateArea()
                + " | And the perimeter is: "+ rect.calculatePerimeter() );
    }
}
