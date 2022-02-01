package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double boy,kg,vki;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu girin (ÖRN: 1.70 gibi)= ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu girin = ");
        kg = scanner.nextDouble();

        vki = kg/(boy*boy);

        if (vki<18.5){
            System.out.println("Zayıf");
        }else if((vki>=18.5) && (vki<=24.9)){
            System.out.println("Normal");
        }else if ((vki>=25)&&(vki<30)){
            System.out.println("Fazla kilolu");
        }else if ((vki>=30)&&(vki<35)){
            System.out.println("1. Tip obez");
        }else {
            System.out.println("Süper obez");
        }
    }
}
