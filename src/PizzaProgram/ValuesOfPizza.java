package PizzaProgram;

import java.util.ArrayList;

public class ValuesOfPizza {
    public String navn;
    public String ingredienser;
    public int pris;
    public String valuta;
    public static ArrayList<ValuesOfPizza> menyPizza= new ArrayList<>();




// vores constructor, hvor at hver gang en pizza bliver instanceret, så bliver den automatisk tilføjet til arraylisten menyPizza
    public ValuesOfPizza (String navn, String ingredienser, int pris){
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
        valuta ="kr";
        menyPizza.add(this);
    }

    public String pizzaToString (){
        return menyPizza.indexOf(this)+1 + ". " + this.navn + ": " + this.ingredienser + " ............ " + this.pris + " " + valuta;
    }

    public static void visAllePizzaer(){ //vores pizzaliste
        System.out.println("______________________________________________________________________________________________________________________________");
        for(ValuesOfPizza pizza : menyPizza){
            System.out.println(pizza.pizzaToString());
        }
        System.out.println("______________________________________________________________________________________________________________________________");

    }





}
