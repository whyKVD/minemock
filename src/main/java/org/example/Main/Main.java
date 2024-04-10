package org.example.Main;

import org.example.data.ui.Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        init();
    }
    
    private static void init(){
        Map m = new Map();
        m.display_on_out();

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter row: ");
            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();

            System.out.print("Enter column: ");
            int col = myObj.nextInt();

            System.out.println("Changing: "+row+" - "+col);
            m.insert_at_coords(row,col);

            m.display_on_out();
        }
    }
}