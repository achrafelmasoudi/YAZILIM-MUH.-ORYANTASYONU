package ornek2;

import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int sayi = sc.nextInt();

        if( sayi%2 == 0 ) {    //3
                        
            for(int i=0 ; i<sayi ; i++) {
                System.out.println("Merhaba Algoritma !!");
            }
            
        }
        
        else {
            
            for(int i=0 ; i<sayi ; i++) {
                System.out.println("Merhaba Java !!!");
            }
            
        }


    }
    
}
