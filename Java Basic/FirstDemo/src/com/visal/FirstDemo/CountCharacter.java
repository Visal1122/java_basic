package com.visal.FirstDemo;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input String To show Length : ");
        String text = sc.nextLine();
        String trimText = text.replaceAll("\\s" , "");
        System.out.println(trimText);
        System.out.println("Character Length is : " +trimText.length());
    }

}
