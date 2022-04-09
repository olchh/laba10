package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите строку: ");
        String str = in.nextLine();
        StringBuilder kk1 = new StringBuilder(str) ;
        StringBuilder kk2 = new StringBuilder(str) ;
        kk2 = kk2.reverse() ; //изменение порядка
        System.out.print(kk1);
        System.out.println();
        System.out.print(kk2);
        System.out.println("\n" + (new String(kk1)).equals(new String(kk2)));//сравнение строк

        }
    }

