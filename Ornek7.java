package oryansinav;

import java.util.Scanner;

public class Ornek7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Basit Hesap Makinesi\n");
        System.out.println("Toplama  : +");
        System.out.println("Cikarma : -");
        System.out.println("Carpma  : *");
        System.out.println("Bolme   : / \n");
        
        System.out.print("Islemi Secmek Icin Onun Isaretini Giriniz : ");
        String islemisareti = sc.next();
        
        System.out.print("1. Sayiyi Giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        int sayi2 = sc.nextInt();
        
        if(islemisareti.equals("+")) {
            System.out.println("Toplam : "+(sayi1+sayi2));
        }
        else if(islemisareti.equals("-")) {
            System.out.println("Toplam : "+(sayi1-sayi2));
        }
        else if(islemisareti.equals("*")) {
            System.out.println("Toplam : "+(sayi1*sayi2));
        }
        else if(islemisareti.equals("/")) {
            if(sayi2==0) {
                System.out.println("HATA . Payda Sifir Olamaz !!!");
            }
            else {
                System.out.println("Toplam : "+(sayi1/sayi2));
            }
        }
        
        
    }
    
}
