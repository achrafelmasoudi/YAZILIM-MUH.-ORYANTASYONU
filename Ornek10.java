package ornek10;

import java.util.Scanner;

public class Ornek10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz : "); // 5^2 = 5*5
        int sayi1 = sc.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        int sayi2 = sc.nextInt();
        
        int toplam = 1 ;
                      //i<3                          
        for(int i=0 ; i<sayi2 ; i++) {
            
            toplam = toplam*sayi1;
            
        }

        System.out.println(sayi1+"^"+sayi2+" = "+toplam);
    }
    
}
