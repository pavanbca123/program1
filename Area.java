
class RectangleArea {
    double length;
    double breadth;

    
    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    double area_of_rectangle() {
        return length * breadth;
    }
}

class RectanglePerimeter {
    double length;
    double breadth;

    
    RectanglePerimeter(double l, double b) {
        length = l;
        breadth = b;
    }

    double display() {
        return 2 * (length + breadth);
    }
}

public class Area {
    public static void main(String[] args) {

    
        RectangleArea areaRect = new RectangleArea(10,20);
        System.out.println("Area of Rectangle: " + areaRect.area_of_rectangle());

        
        RectanglePerimeter perimeterRect = new RectanglePerimeter(20,30);
        System.out.println("Perimeter of Rectangle: " + perimeterRect.display());
    }
}

