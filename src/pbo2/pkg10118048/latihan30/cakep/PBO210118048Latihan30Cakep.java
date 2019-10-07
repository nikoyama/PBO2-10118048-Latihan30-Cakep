/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : pujian kepada diri sendiri
 */
public class PBO210118048Latihan30Cakep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jawaban;
        
        System.out.print(ANSI_RED +"Kamu");
        System.out.print(ANSI_GREEN +" ngerjain sendiri");
        System.out.print(ANSI_YELLOW +" latihan 17 sampe");
        System.out.println(ANSI_BLUE +" latihan 30 ini?");
        System.out.print(ANSI_BLUE +"Jawab");
        System.out.print(ANSI_RED +" (YOI/ENGGAK) : ");
        jawaban = scanner.next().toUpperCase();
        tampilHasil(jawaban);
    }
    
    public static void tampilHasil(String jawaban) {
        if (jawaban.equals("YOI"))
            System.out.println("\n" +ANSI_RED +"Cakep Bener." +ANSI_PURPLE +"Good Job");
        else if (jawaban.equals("ENGGAK"))
            System.out.println("\n" +ANSI_RED +"Tetep cakep sih." 
                    +"\n" +ANSI_CYAN +"Sing penting paham konsep nya yee."
                    +"\n +"+ANSI_RESET +"Keep the code works dude");
    }
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLACK = "\u001B[30m";
}
