package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("sal");
        System.out.println("Ce vrei? Tasteaza 1 pt pizza");
        int Raspuns = scanner.nextInt();
        if (Raspuns == 1) {
            Meniu Meniu = new Meniu();
        }
        else {
            System.out.println("N-avem");
        }

    }
}
