package ornek8;

import java.util.Scanner;

public class Ornek8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("1-7 Arasi Bir Sayiyi giriniz : ");
        int sayi = sc.nextInt();
        
        switch(sayi) {
            
            case 1 : System.out.println("Pazartesi Gunu");
                    break;
            case 2 : System.out.println("Sali Gunu");
                    break;
            case 3 : System.out.println("Carsamba Gunu");
                    break;
            case 4 : System.out.println("Persembe Gunu");
                    break;        
            case 5 : System.out.println("Cuma Gunu");
                    break;        
            case 6 : System.out.println("Cumartesi Gunu");
                    break;        
            case 7 : System.out.println("Pazar Gunu");
                    break;        
            default : System.out.println("Yanlis Bir Sayi Girdiniz !!!");
                    break;
        
        }
        
    }
    
}
