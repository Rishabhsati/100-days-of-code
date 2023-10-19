import java.util.ArrayList;
import java.util.Scanner;

class Crust{
    static int wheatCrust(){
        return 30;
    }
    static int freshPan(){
        return 50;
    }
    static int cheeseBurst(){
        return 100;
    }
}

// One modification 
class Toppings{
    static int Onion(){
        return 50;
    }

    static int Tomato(){
        return  60;
    }

    static int Olives(){
        return 40;
    }

    static int sweetCorn(){
        return 40;
    }

    static int extraCheese(){
        return 70;
    }
}

public class pizza{
    public static int CrustHandling(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Crusts = new ArrayList<>();
        Crusts.add("Wheat");
        Crusts.add("FreshPan");
        Crusts.add("CheeseBurst");

        System.out.println("Please select the curst(Enter the valid Number)");

        for(int i=0; i<Crusts.size(); i++){
            System.out.println((i+1) + ". " + Crusts.get(i));
        }

        int curstnum = sc.nextInt();
        //validation check
        if(curstnum<=0 || curstnum>Crusts.size()){
            System.out.println("The entered crust number is invalid ");
            return CrustHandling();
        }

        if(curstnum == 1){
            return Crust.wheatCrust();
        }
        if(curstnum == 2){
            return Crust.freshPan();
        }
        if(curstnum == 3){
            return Crust.cheeseBurst();
        }

        return 0;
    }

    public static int ToppingsHandling(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("Tomato");
        toppings.add("Onion");
        toppings.add("Sweet Corn");
        toppings.add("Olives");
        toppings.add("Extra Cheese");


        System.out.println("Please select the toppings");

        for(int i=0; i<toppings.size(); i++){
            System.out.println((i+1) + ". " + toppings.get(i));
        }

        int toppingsnum = sc.nextInt();
        //validation check
        if(toppingsnum<=0 || toppingsnum>toppings.size()){
            System.out.println("The entered toppings number is invalid ");
            return CrustHandling();
        }

        if(toppingsnum == 1){
            return Toppings.Tomato();
        }
        if(toppingsnum == 2){
            return Toppings.Onion();
        }
        if(toppingsnum == 3){
            return Toppings.sweetCorn();
        }
        if(toppingsnum == 4){
            return Toppings.Olives();
        }
        if(toppingsnum == 5){
            return Toppings.extraCheese();
        }

        return 0;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int price = 0;

        price += CrustHandling();
        price += ToppingsHandling();
        System.out.println("The Price of your pizza is " + price);
    }
}