package functionalInterface;

public class MyClass implements FirstInterface, SecondInterface {

    @Override
    public void secondMethod() {
    }

    @Override
    public void firstMethod(String string) {

    }

    @Override
    public void log(String string) {
        System.out.println("MyClass logging::" + string);
    }


}