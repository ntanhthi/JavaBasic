package functionalInterface;

public interface FirstInterface {

    void firstMethod(String string);

    default void log(String tct){
        System.out.println("This method is default implementation" +tct );
    }
}