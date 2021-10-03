package Assignment_Basic;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        soNguyento();
    }

    public static void soNguyento(){
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }
        while (a > b);
    }

}
