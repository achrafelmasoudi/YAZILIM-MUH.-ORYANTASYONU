package ornekler;

import java.util.Scanner;

public class Ornek9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayi Giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.print("2. Sayi Giriniz : ");
        int sayi2 = sc.nextInt();
        
        if( sayi1 > sayi2 ) {
            System.out.println(sayi1+" > "+sayi2+" Demek Ki Buyuk Sayi : "+sayi1);
        }
        else if( sayi1 < sayi2 ) {
            System.out.println(sayi2+" > "+sayi1+" Demek Ki Buyuk Sayi : "+sayi2);
        }
        else {
            System.out.println(sayi1+" = "+sayi2+" Demek Ki Sayılar Eşittir .");
        }

    }
    
}
