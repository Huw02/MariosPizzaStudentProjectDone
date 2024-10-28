package PizzaProgram;

import java.util.ArrayList;

public class ValuesOfPizza {
    public String navn;
    public String ingredienser;
    public int pris;
    public String valuta;
    public static ArrayList<ValuesOfPizza> menyPizza= new ArrayList<>();



    public ValuesOfPizza (String navn, String ingredienser, int pris){

        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
        valuta ="kr";
        menyPizza.add(this);

    }

    public String pizzaToString (){
        return this.navn + ": " + this.ingredienser + " ............ " + this.pris + " " + valuta;
    }

    public static void visAllePizzaer(){
        for(ValuesOfPizza pizza : menyPizza){
            System.out.println(pizza.pizzaToString());
        }
    }



}
