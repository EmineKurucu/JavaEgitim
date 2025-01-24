package com.eminekurucu.javaegitim;

public class KontrollerVeDonguler {
    public static void main(String[] args){
        // if statement
        System.out.println("---if-Statement---");
        int x = 4;
        int y = 10;
        if (x < y) {
            System.out.println("y is bigger than x");
        } else if (y < x){
            System.out.println("x is bigger than y");
        } else if (x == y){ // else de denebilir
            System.out.println("x is equal to y");
        }
        System.out.println("------");

        // Switch
        System.out.println("---Switch---"); // içiçe if else kullanmak yerine kullanılabilir

        int dayNum = 8;
        String dayName = "";

        switch (dayNum){
            case 1 :
                dayName = "Monday";
                break;
            case 2:
                dayName = "Thuesday ";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Gecersiz deger";
                break;
        }
        System.out.println(dayName);
        System.out.println("------");

        System.out.println("---For-Dongusu---");

        int[] NumberList = {12,15,18,21,24};
        for (int i =0; i < NumberList.length; i++){
            System.out.println(NumberList[i] / 3 * 5);
            // alt alta 20 25 30 35 40
        }
        System.out.println();
        // for loop genelde dizilerle kullanılır bu sebeple kısa yolu var

        for(int num: NumberList) {
            System.out.println(num / 3 * 5 );
            // alt alta 20 25 30 35 40
        }
        System.out.println("------");

        System.out.println("---While-Dongusu---");

        int j = 0;
        while (j < 10){
            System.out.println(j);
            j++;
        } // alt alta 0-9 arası yazdırır


    }
}
