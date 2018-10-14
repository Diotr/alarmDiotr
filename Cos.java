
package cos;
import java.util.Date;
import java.lang.Thread;
import java.util.Calendar;

public class Cos {

    
    public static void main(String[] args) throws InterruptedException {
        
      CheckMethods test = new CheckMethods();
       
       
      
        
        for(;;){
        Date data = new Date();
        int godzina = data.getHours();
        int minuty = data.getMinutes();
        int sekundy = data.getSeconds();
        System.out.println("Godzina: "+godzina+"Minut: "+minuty+"Sekund: "+sekundy);
        cos.CheckMethods.check(godzina,minuty,sekundy);
         Thread.sleep(1000);}
       
        
        }
   }
       
    
    

