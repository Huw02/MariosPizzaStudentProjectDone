package PizzaProgram;

import java.util.Scanner;

import static PizzaProgram.ValuesOfPizza.menyPizza;

public class Pizza {

Ændremenykort change = new Ændremenykort();
MakeOrder alexander = new MakeOrder("");



    public Pizza (){

        ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    }
        ValuesOfPizza margaritha = new ValuesOfPizza("Margaritha", "Tomatsovs og ost", 65);
        ValuesOfPizza pepperoni = new ValuesOfPizza("Pepperoni", "Tomatsovs, ost og pepperoni", 75);
        ValuesOfPizza hawaii = new ValuesOfPizza("Hawaii", "Tomatsovs, ost, skinke og ananas", 70);
        ValuesOfPizza capriccioa = new ValuesOfPizza("Capriccioa", "Tomatsauce, mozzarella, skinke, champignon", 85);
        ValuesOfPizza quattroStagioni= new ValuesOfPizza("Quattro Stagioni", "Tomatsauce, mozzarella, skinke, champignon, artiskok, oliven", 90 );
     ValuesOfPizza vesuvio = new ValuesOfPizza("Vesuvio", "Tomatsauce, mozzarella, skinke", 80 );
    ValuesOfPizza diavola = new ValuesOfPizza("Diavola", "Tomatsauce, mozzarella, spicy salami, chili", 90 );
    ValuesOfPizza prosciuttoEFunghi = new ValuesOfPizza("Prosciutto e Funghi", " Tomatsauce, mozzarella, skinke, svampe", 85 );
    ValuesOfPizza marinara = new ValuesOfPizza("Marinara", "Tomatsauce, hvidløg, oregano", 65);
    ValuesOfPizza vegetariana = new ValuesOfPizza("Vegetariana", "Tomatsauce, mozzarella, peberfrugt, løg, zucchini, aubergine", 85);
    ValuesOfPizza quattroFormaggi= new ValuesOfPizza("Quattro Formaggi", "Tomatsauce, mozzarella, gorgonzola, parmesan, ricotta", 95);
    ValuesOfPizza tonnoECipolla= new ValuesOfPizza("Tonno e Cipolla", "Tomatsauce, mozzarella, tun, løg", 90);
    ValuesOfPizza bBQChicken= new ValuesOfPizza("BBQ Chicken", " BBQ sauce, kylling, mozzarella, løg", 90);
    ValuesOfPizza bianca = new ValuesOfPizza("Bianca", "Creme fraiche, mozzarella, kartoffel, rosmarin", 85);
    ValuesOfPizza parma = new ValuesOfPizza("Parma", "Tomatsauce, mozzarella, parmaskinke, rucola, parmesan", 95);
    /*
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0);
    ValuesOfPizza x = new ValuesOfPizza("", " ", 0); */









    public void kommandoer(){
        boolean kmOn = true;
        while(kmOn) {
            menyMuligheder();
            System.out.println("\nSkriv et tal fra 1-8 ud fra den kommando du vil udføre.");
            Scanner sc = new Scanner(System.in);
            int scInput = sc.nextInt();
            if (scInput == 1) {
                ValuesOfPizza.visAllePizzaer();

            } else if (scInput == 2) {
                alexander.IndtastOrdre();

            } else if (scInput == 3) {

            } else if (scInput == 4) {

            } else if (scInput == 5) {

            } else if (scInput == 6) {

            } else if (scInput == 7) {
                change.ændreMenukort();

            } else if (scInput == 8){
                System.out.println("Du har valgt at slukke for programmet");
                kmOn = false;
            }else {
                System.out.println("Jeg forstod ikke hvad du ville, prøve at indtaste et nyt nummer mellem 1-8.");
            }
        }
    }
    public void menyMuligheder(){
        System.out.println( "" +
                "\n1. Vis liste over pizza" +
                "\n2. Opret ny order" +
                "\n3. Se nuværende ordrer" +
                "\n4. Rediger ordre" +
                "\n5. Beregn pris for ordre" +
                "\n7. Adminastrativt arbejde" +
                "\n7A.Se dagens omsætning" +
                "\n7B.Se dagens tab" +
                "\n7C.Ændre menyKortet" +
                "\n8. Sluk for programmet");
    }
}
