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
public class CheeseCake extends Cake{
    
    public CheeseCake(String cFlavour, String cIcing){
        super(cFlavour, cIcing);
    }
    
     public String bake(){
        return("The base of cheese cake is baking.");
    }
    
    public String frozen(){
        return("Cheese cake is frozen for 1 hour.");
    }
    
     public String toString(){        
        return(bake() + "\n" + frozen());
    }
    
}
