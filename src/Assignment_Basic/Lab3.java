package Assignment_Basic;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("UCLN cua a va b: " + ucln(a,b));
        System.out.println("BCNN cua a va b: " + bcnn(a,b));
    }

    public static int ucln(int a, int b){
        while (a != b){
            if(a > b){
                a -= b;
            }
            else {
                b -= a;
            }
        }
        return a;
    }

    public static int bcnn(int a, int b){
        return (a * b) / ucln(a, b);
    }
}
