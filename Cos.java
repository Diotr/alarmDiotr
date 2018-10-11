
package cos;
import java.util.Date;
import java.lang.Thread;
import java.util.Calendar;
import java.util.Scanner;


public class Cos {


    
    public static void main(String[] args) throws InterruptedException {
        
       Scanner sc = new Scanner(System.in); 
        
       int godzina;
       int minuty;
       int sekundy;
       
    
       
      //CheckMethods test = new CheckMethods();
       CheckMethods.setAlarm();
       
      
        
        for(;;){
        Date data = new Date();
        godzina = data.getHours();
        minuty = data.getMinutes();
        sekundy = data.getSeconds();
        System.out.println("Godzina: "+godzina+"Minut: "+minuty+"Sekund: "+sekundy);
        CheckMethods.check(godzina,minuty,sekundy);
        Thread.sleep(1000);}
       
        
        }
   }
       
    
    

