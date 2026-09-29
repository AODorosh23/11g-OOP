package Task6_Rectangle;

public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double calculateArea(){
        return width * height;
    }
    double calculatePerimeter(){
        return 2*(width + height);
    }

}
