package com.visal.learning;

import java.util.Scanner;

public class Continue_Keyword_Exercise {
    public static void main(String[] args) {
        String word = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of word you wanna input : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            System.out.print("Word " + i + " : ");
            String w = sc.next();
            int index = w.length()-1;
            char lastChar = w.charAt(index);
//            System.out.println(lastChar);
//            if (lastChar != 'a' && lastChar != 'e' && lastChar != 'i' && lastChar != 'o' && lastChar != 'u'){
//                word += w;
//            }else {
//                continue;
//            }
            if("aeiouAEIOU".indexOf(lastChar) == -1){
                word += w + " ";
            }
            else {
                continue;
            }
        }
        System.out.println(word);
    }
}
