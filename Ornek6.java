package ornek6;

import java.util.Scanner;

public class Ornek6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Toplamak istediginiz kac sayi giriniz : "); //sayi = 3
        int sayi = sc.nextInt();
        
        int nm = 0;
        int toplam = 0;
        
        for(int i=1 ; i<=sayi ; i++) { //10 20 10
            System.out.print(i+". Sayi : ");
                nm = sc.nextInt();
            }
        
        while(sayi>0) { 
            toplam = toplam+nm;
            sayi--;
        }
        
        System.out.println("Toplam : "+toplam);



    }
    
}
