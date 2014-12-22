package lomako;

import lomako.IceCreamStore;
import lomako.Ice;

public class OrderIce {

    public static void main(String[] args) {
       IceCreamStore nyStore=new IceCreamStore();        
        Ice icecream = nyStore.orderIceCream("Belarus");
        System.out.println("name of the ice cream is "+icecream.getName());
        System.out.println("For sale in "+icecream.getCountry());
        System.out.println("Number of "+icecream.getNumber());
        System.out.println("------------------------------------------------ ");
        icecream = nyStore.orderIceCream("Russia");
        System.out.println("The name of the ice cream is "+icecream.getName());
        System.out.println("For sale in "+icecream.getCountry());
        System.out.println("Number of "+icecream.getNumber());
    }
    
}




