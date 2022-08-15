package labexercise1;

import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args){
    ArrayList<Cake> arrCake = new ArrayList<Cake>();
    
    Cake cake1 = new Cake("chocolate", "creme cheese");
    BirthdayCake cake2 = new BirthdayCake("butter", "butter creme", 6);
    CheeseCake cake3 = new CheeseCake("cheese", "no");
    Cake cake4 = new BirthdayCake("strawberry", "butter creme", 6);
    Cake cake5 = new CheeseCake("cheese", "raspberry");
    
    arrCake.add(cake1);
    arrCake.add(cake2);
    arrCake.add(cake3);
    arrCake.add(cake4);
    arrCake.add(cake5);
   
    System.out.println("Print all cakes.");
    System.out.println("****************");
    for(Cake cake : arrCake){
        System.out.println(cake);
        System.out.println();
    }    
    
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
    System.out.println("Print Birthday Cake only.");
    System.out.println("*************************");
     for(Cake cake : arrCake){
        if (cake instanceof BirthdayCake){
                System.out.println(cake);
                System.out.println();
        }
    } 
     
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
     
     
     System.out.println("Print Cheese Cake only.");
     System.out.println("***********************");
     for(Cake cake : arrCake){
        if (cake instanceof CheeseCake) {
                System.out.println(cake);
                System.out.println();
        }
    } 
    
    }
    
}
