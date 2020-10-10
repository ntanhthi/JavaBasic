package chapter16;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {

        System.out.println("Nhap so nguyen to");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <2) System.out.println("n khong phai so nguyen to");
        else {
            int m = (int) Math.sqrt(n);
            for (int i = 2; i <=m;i++){
                if (n%i==0){
                    System.out.println("N kg phai so nguyen to");
                }
            }
            System.out.println(String.format("N %d là so nguyen to", n));
        }
    }
}
