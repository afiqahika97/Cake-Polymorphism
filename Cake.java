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
public class Cake {
    
    private String flavour;
    private String icing;
    
    public Cake(String cFlavour, String cIcing){
        flavour = cFlavour;  
        icing = cIcing;
    }

    public String bake(){
        return("The " + flavour + " cake is baking.");
    }
    
    public String frosting(){
        return("The cake now has " + icing + " frosting.");
    }  
    
    public String toString(){
        return(bake() + "\n" + frosting());
    }
    
    
}
