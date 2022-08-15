/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

/**
 *
 * @author kl
 */
public class BirthdayCake extends Cake { 
    
    private int noOfCandle;
    
    public BirthdayCake(String cFlavour, String cIcing, int cCandle) {
        super(cFlavour, cIcing);   
        noOfCandle = cCandle;
    }
    
    public String putCandleOnBirtdayCake(){
        return("Put " + noOfCandle + " candle on the birthday cake.");
    }
    
    public String toString(){        
        return(bake() + "\n" + frosting() + "\n" + putCandleOnBirtdayCake());
    }
    
    
}
