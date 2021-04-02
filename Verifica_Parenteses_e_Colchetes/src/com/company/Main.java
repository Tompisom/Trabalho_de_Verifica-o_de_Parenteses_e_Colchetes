package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ler = new Scanner(System.in);

        String coisa = ler.next();

        char[] desafio = coisa.toCharArray();

        for (int i = 0; i < desafio.length; i++)
        {
            System.out.println(desafio[i]);
        }

        System.out.println(Esta_Certo(desafio));

    }

    public static boolean Esta_Certo(char[] desafio)
    {
        ArrayList<Character> resolusao =  new ArrayList<>();

        for (int i = 0; i < desafio.length; i++)
        {
            if (desafio[i] == '(' || desafio[i] == '[')
            {
                resolusao.add(0,desafio[i]);
            }

            if (desafio[i] == ')' || desafio[i] == ']')
            {
                if (resolusao.get(0) == '(' && desafio[i] == ')' || resolusao.get(0) == '[' && desafio[i] == ']' )
                {
                    resolusao.remove(0);
                }
            }
            System.out.println(resolusao.toString());
        }


        if (resolusao.size() == 0)
            return true;
        else
            return false;

    }
}
