package theexam;

import java.util.Scanner;
import java.util.Random;

public class Ornek5 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int bilgisayar = rn.nextInt(1, 4);
        
        System.out.println("Tas   : 1");
        System.out.println("Kagit : 2");
        System.out.println("Makas : 3");
        System.out.print("Bir Sayiyi Sec : ");
        int sayi = sc.nextInt();
        
        System.out.println("Bilgisayarin Sectigi sayiyi : "+bilgisayar);
        
        if( (sayi==1 && bilgisayar==3) || (sayi==2 && bilgisayar==1) || (sayi==3 && bilgisayar==2) ) {
            System.out.println("Tebrik Ederim , Sen Kazandin !!!!");
        }
        else if( (sayi==3 && bilgisayar==1) || (sayi==1 && bilgisayar==2) || (sayi==2 && bilgisayar==3) ) {
            System.out.println("Maalesef , Sen Yenildin ");
        }
        else if( sayi == bilgisayar ) {
            System.out.println("Berabere !!");
        }
        
    }
}