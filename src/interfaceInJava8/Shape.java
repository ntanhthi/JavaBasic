package interfaceInJava8;

public interface Shape {
    void draw();

    default void setColor(String color) {
       // System.out.println("Draw shape with color " + color);
    }
}
