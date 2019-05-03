package hometask4.subTask1;

import hometask4.Shape;

public class Area {
    public static void main(String[] args) {
        Shape[] shape = {new Rectangle(8, 12),
                new Square(5),
                new Circle(10),};

        for(Shape shape1 : shape)
            System.out.println(shape1.getName() + ": area = " + shape1.getArea());
    }
}
