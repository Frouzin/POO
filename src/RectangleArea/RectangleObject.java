package RectangleArea;

public class RectangleObject {
    public double width;

    public double height;

    public double areaRectangule(){
        return width*height;
    }
    public double perimeterRectangule(){
        return (width*2)+(height*2);
    }
    public double diagonalRectangule(){
        return Math.sqrt((width*width)+(height*height));
    }
}
