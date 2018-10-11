/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

/**
 *
 * @author Diotr
 */public class CheckMethods {
       int alhour=0;
       int alminute=0;
       int alsec=0;
       
       
       
     public static void setAlarm (){
       
    
        System.out.println("Podaj godzinę alarmu: ");
       
    
    }
    
     public static void check(int godzinyalarm, int minutyalarm, int sekundyalarm ){
        
   
       

       if((godzinyalarm==alhour)&&(minutyalarm==alminute)&&(sekundyalarm==alsec)){
           System.out.println("dzyn!");
           
       }
       else{
           System.out.println("czekaj");
       }
       }
   
}
