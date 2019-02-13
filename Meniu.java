package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Meniu {

    private static Scanner scanner = new Scanner(System.in);
    private double Subtotal;

    public Meniu(){
    Meniu();
    AlegePizza();
    }

    public void Meniu () {

        ArrayList<String> listapizze = new ArrayList<>();
        listapizze.add("1.Quatro Stagioni - 14 lei");
        listapizze.add("2.Coloseum - 15 lei");
        listapizze.add("3.Diavola - 12 lei");
        listapizze.add("4.Vegetariana - 11 lei");
        listapizze.add("5.Quatro Formagi - 11 lei");
        listapizze.add("6.Margherita - 13 lei");
        listapizze.add("7.Finalizare Comanda");




        for (int i = 0; i < listapizze.size(); i++) {

            System.out.println(listapizze.get(i));
        }
    }

     public double AlegePizza (){

         System.out.println("Alege din lista un nr aferent pizzei pe care o vrei sau tasteaza 7 pt a finaliza comanda.");

            int Alegere = scanner.nextInt();
            if (Alegere == getAnInt()) {
                Subtotal = 14 + Subtotal;
                System.out.println("Ai bagat o pizza Quattro Stagioni. Subtotal= " + Subtotal + " lei. Altceva?");
                AlegePizza();
                return Subtotal;
            }
         if (Alegere == 2) {
             Subtotal = 15 + Subtotal;
             System.out.println("Ai bagat o pizza Coloseum. Subtotal= " + Subtotal + " lei. Altceva?");
             AlegePizza();
             return Subtotal;
         }
         if (Alegere == 3) {
             Subtotal = 12 + Subtotal;
             System.out.println("Ai bagat o pizza Diavola. Subtotal= " + Subtotal + " lei. Altceva?");
             AlegePizza();
             return Subtotal;
         }
         if (Alegere == 4) {
             Subtotal = 11 + Subtotal;
             System.out.println("Ai bagat o pizza Vegetariana. Subtotal= " + Subtotal + " lei. Altceva?");
             AlegePizza();
             return Subtotal;
         }
         if (Alegere == 5) {
             Subtotal = 11 + Subtotal;
             System.out.println("Ai bagat o pizza Quattro Formagi. Subtotal= " + Subtotal + " lei. Altceva?");
             AlegePizza();
             return Subtotal;
         }
         if (Alegere == 6) {
             Subtotal = 13 + Subtotal;
             System.out.println("Ai bagat o pizza Margherita. Subtotal= " + Subtotal + " lei. Altceva?");
             AlegePizza();
             return Subtotal;
         }
         if (Alegere == 7) {
             System.out.println("Comanda Finalizata! TOTAL DE PLATA: " + Subtotal + "lei");
         }

            else{
                System.out.println("Scrie un nr din lista!");
                AlegePizza();
            }
            return Subtotal;

    }

    private int getAnInt() {

        return 1;
    }


}



