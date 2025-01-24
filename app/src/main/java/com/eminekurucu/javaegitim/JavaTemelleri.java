package com.eminekurucu.javaegitim;

import android.telephony.SmsManager;

public class JavaTemelleri {
    public static void main(String[] args){ // public static her yerden çağrılabilir geri değe döndürmez
        // ana method budur her şey burdan çalıştırılır psvm yazarsan direk bunu oluşturur
        System.out.println("Hello java"); // sout yazınca çıkar

        // Variables
        System.out.println("---Degiskenler---");

        //integer - Long
        int age = 20;
        System.out.println(age / 5 * 7);
        int x = 5, y = 11;
        System.out.println(y/x); // integer/integer = integer : 2

        // longun kapasitesi integer dan fazla
        long myLong = 10;
        System.out.println(myLong); // 10

        //Double Float
        double z = 5.0, a = 11.0;
        System.out.println(a/z); // 2.2

        // float tanımlarken sonuna f koy
        float myFloat = 20.20f;
        System.out.println(myFloat/4); // 5.05

        //Daire alanı hesaplama
        double pi = 3.14;
        int radius = 4;
        double daireAlan = pi * (radius * radius) ;
        double daireCevre = 2 * pi * radius;
        System.out.println(daireCevre); // 25.12
        System.out.println(daireAlan); // 50.24
        // kesirli sayıların java da çok küçük farklılıkları olabilir

        // STRING
        String name = "James";
        String surname = "Hardy";
        System.out.println(name);
        System.out.println(surname);
        String fullName = name + " " + surname;
        System.out.println(fullName); // James Hardy

        // BOOLEAN true false değer alır
        boolean isAlive = true;
        System.out.println(isAlive);

        // Sabitler final
        int myInt = 10;
        // normal tanımlanan değişkenlerin değeri sonradan değiştirilebilir
        System.out.println("myInt: " +myInt); // 10
        myInt = 4;
        System.out.println("myInt: "+myInt); // 4

        // final ile tanımlanan değişkenler sabittir sonradan değiştirilemez
        final  int sabitInt = 7;
        System.out.println("sabitInt: " + sabitInt);
        // sabitInt = 4; hata verir

        // Operatörler
        System.out.println("---Operatorler---");

        // incerement decrement
        int sayi = 9;
        System.out.println("sayi: "+ sayi); // 9
        System.out.println("sayi++: "+ sayi++); // 9
        System.out.println("sayi: "+ sayi); // 10
        System.out.println("++sayi: "+ (++sayi)); // 11
        System.out.println("sayi: "+ sayi); // 11
        sayi++;
        System.out.println("son durumda sayi: " + sayi); // 12
        System.out.println("---------");


        int sayi2 = 5;
        System.out.println("sayi2: "+ sayi2); // 5
        System.out.println("sayi2--: "+ sayi2--); // 5
        System.out.println("sayi2: "+ sayi2); //4
        System.out.println("--sayi2: "+ (--sayi2)); //3
        System.out.println("sayi2: "+ sayi2); // 3
        sayi2--;
        System.out.println("son durum sayi2: "+ sayi2); // 2
        System.out.println("-------");

        int c = 5;
        int k = 6;
        System.out.println(c > k); // false
        System.out.println(c < k); // true
        System.out.println(c == k); // false
        System.out.println(c <= k); // true
        System.out.println(c != k); // true
        System.out.println("-------");

        // and && , or || , not !
        int p = 4;
        int m = 8;
        int r = 12;
        System.out.println(p<m && r>m); // 1 and 1 = 1 : true
        System.out.println(p<m || r<m); // 1 or 0 = 1 : true
        System.out.println(!(p<m)); // not true = false


    }
}

