package com.ferragnez.partyBonus;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {

        // lista invitati
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //Creo scanner per chiedere nome
        Scanner scanner = new Scanner(System.in);

        System.out.println("Il suo nome prego:");

        String nome = scanner.nextLine();

        scanner.close();

        //controllo invito

        boolean invitato = false;
        int cycle = 0;

        while (cycle < listaInvitati.length){

            if (nome.equalsIgnoreCase(listaInvitati[cycle])) {
                invitato = true;
                //break;
            }
            cycle++;

        }

        //risultato
        if (invitato) {
            System.out.println("Benvenuto/a, si goda la festa");
        } else
            System.out.println("Lei non è invitato, la prego di allontanarsi");
    }
}
