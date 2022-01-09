package ornek3;

public class Ornek3 {

    public static void main(String[] args) {

        int dizi[] = {100,20,144,5,-1};
        
        int enKucuk = dizi[0];
        
        for(int i=0 ; i<dizi.length ; i++) {
            
            if( enKucuk > dizi[i] ) {
                enKucuk = dizi[i];
            }
            
        }
        System.out.println("En Kucuk : "+enKucuk);


    }
    
}
