package ba.unsa.etf.rpr.t1z2;

import java.util.Scanner;

public class Main {

    public static void sumaCifara(int n) {
        int i = 0;
        for(i = 1;i <= n;i++) {
            int broj = i, suma_cifara = 0;
            while(broj != 0) {
                suma_cifara += broj % 10;
                broj /= 10;
            }
            if(i % suma_cifara == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = ulaz.nextInt();
        sumaCifara(n);
	// write your code here
    }
}
