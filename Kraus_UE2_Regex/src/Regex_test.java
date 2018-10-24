/*
Author: Maximilian Kraus
Date: 9.10.2018

In diesem Programm wird ein String eingegeben und anschließend ausgegeben ob die Zeichenkette einer URL entspricht (REGEX).
 */

import java.util.Scanner;

public class Regex_test {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);            //Scanner wird erzeugt

        System.out.println("Bitte geben Sie die gewünschte URL ein: ");

        String regPrüfen = sc.nextLine();               //Eingabe mit Scanner

        System.out.println(regPrüfen.matches("(https?|ftp|file):\\/\\/[-\\w\\d+&@#/%?=~_|!:,.;]*[-a\\w\\d+&@#/%=~_|]")); //Ausgabe mithilfe von .matches welches mit Hilfe von Regex true|false zurückgibt

    }
}
