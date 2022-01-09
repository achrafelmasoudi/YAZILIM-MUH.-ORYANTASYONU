package ornek1;

import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bir Sayi Giriniz : ");
        
        int sayi = sc.nextInt();
        
        int toplam = 1 ;  
        while( sayi > 0 ) {
            
            toplam = toplam * sayi;
            sayi--;
            
        }

        System.out.println(toplam);



    }
    
}
