package chapter15;

public class EnumExample {
    // define enum
    enum Season {
        SPRING, SUMMER, FALL, WINTER;
    }

    public static void main(String[] args) {
        for(Season s : Season.values()){
            System.out.println(s);
        }
    }
}
