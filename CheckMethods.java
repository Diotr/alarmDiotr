/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

/**
 *
 * @author Diotr
 */
public class CheckMethods {
    public static void check(int godzinyalarm, int minutyalarm, int sekundyalarm ){
       
       if((godzinyalarm==21)&&(minutyalarm==13)&&(sekundyalarm==23)){
           System.out.println("dzyn!");
           
       }
       else{
           System.out.println("czekaj");
       }
       }
    
}
