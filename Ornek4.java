package ornek4;

public class Ornek4 {

    public static void main(String[] args) {
        
        int dizi[] = {100,20,144,55,666,0};
        
        int k;
        
        for(int i=0 ; i<dizi.length ; i++) { //
            
            for(int j=i ; j<dizi.length ; j++) {
                
                if( dizi[i] > dizi[j] ) {
                    k = dizi[i];  //k = 100
                    dizi[i] = dizi[j]; // dizi 0 = 
                    dizi[j] = k;
                }
            
            }
        
        }
        // {20, 55 , 100 144 666}
        
        for(int i=0 ; i<dizi.length ; i++) {
            System.out.println(dizi[i]);
        }

    }
    
}
