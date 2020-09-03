package ru.mirea.lab1;

import java.util.Scanner;

public class SecondEx {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        String line;
        for (int i = 0; i<5; i++){
            if (sc.hasNextLine()){
                line = sc.nextLine();
                System.out.println(line);
            }
        }
    }
}
