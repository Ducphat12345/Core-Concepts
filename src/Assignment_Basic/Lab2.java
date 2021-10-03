package Assignment_Basic;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        uocSo();
    }

    public static void uocSo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTong so uoc so la: " + count);
    }
}
