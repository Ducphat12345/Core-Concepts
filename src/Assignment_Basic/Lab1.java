package Assignment_Basic;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        menu();
    }

    // Phan a
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu: " + i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
            else{
                sum1 += arr[i];
            }
        }
        System.out.println("Tong le: " + sum);
        System.out.println("Tong chan: " + sum1);
    }

    // Phan b
    public static void sum1(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }
        while (n <= 0);

        float tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 1.0/i;
        }
        System.out.println("Tong: " + tong);
    }

    public static void menu() {
        System.out.println("1. Phan a");
        System.out.println("2. Phan b");
        System.out.println("3. Thoat ");
        System.out.print("Moi ban chon: ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                sum();
                System.out.println("------------");
                menu();
                break;
            case 2:
                sum1();
                System.out.println("------------");
                menu();
                break;
            case 3:
                System.out.println("Da thoat chuong trinh!");
                System.exit(0);
                break;
            default:
                System.out.println("Khong co chuc nang ban chon! Chon lai");
                menu();
                break;
        }
    }
}
