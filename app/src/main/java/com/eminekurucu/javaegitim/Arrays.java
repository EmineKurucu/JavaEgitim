package com.eminekurucu.javaegitim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
        // Diziler
        System.out.println("---Diziler---");
        // birden çok veriyi bir arada tutmaya yarar

        // string dizisi oluşturuyoruz
        String[] StringArray = new String[3]; // dizi içeriği türü ve size girilmeli
        StringArray[0] = "buket";
        StringArray[1] = "yeliz";
        StringArray[2] = "pinar";
        //System.out.println(StringArray); diziyi değil kayıtlı olduğu dizini yazdırır.
        System.out.println(StringArray[1]); // yeliz

        // integer dizi oluşturuyoruz
        Integer[] IntArray = new Integer[3];
        IntArray[0] = 32;
        IntArray[1] = 24;
        IntArray[2] = 54;
        System.out.println(IntArray[1]);

        // diğer dizi tanımlama yöntemi
        Integer[] AgeArray = {18,22,46,64,78};
        System.out.println(AgeArray[3]);

        // Listeler
        System.out.println("---List---");
        // dizilerden daha esnek tanımlarken size belirtmeye gerek yok
        ArrayList<String> myMusician = new ArrayList<String>();
        myMusician.add("James");
        System.out.println(myMusician.get(0)); // James
        myMusician.add("Lars");
        myMusician.add("Rob");
        myMusician.add(0,"Kirk"); // belirli bir indexe ekleme yaptık
        System.out.println(myMusician.get(0)); // Kirk
        System.out.println(myMusician.size());

        // Sets
        System.out.println("---Sets---");
        // her eleman unique HashSet ile oluşturulur. Kullanımı listeyle aynı
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Orkun");
        mySet.add("Orkun");
        mySet.add("Can");
        mySet.add("Hazal");
        System.out.println(mySet); // [Can, Hazal, Orkun]
        System.out.println(mySet.size()); // 3 (Orkun'u 1 kere saydı)

        // Map
        System.out.println("---Map---");
        // HashMap ile oluşturulur. Key-Value pairs olarak çalışır
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("Burcu", "Java");
        myMap.put("Aysun", "Python");
        myMap.put("Furkan", "C++");
        System.out.println(myMap.get("Furkan")); // C++
        System.out.println(myMap.get("Aysun")); // Python

        // ilkel tipler(primitive) küçük harfle başlar : int
        // diğer tipler HashMap , String büyük harfle başlar
        // HashMap'te ikinci değer primitive tip olamaz
        // HashMap<String, int> newMap = new HashMap<String, int>() ; hata verir
        // int a = 5; yerine Integer a = 5 şeklinde de tanımlanabilir
        HashMap<String,Integer> IntMap = new HashMap<String, Integer>();
        IntMap.put("Serhat", 1);
        IntMap.put("Barbaros", 2);
        IntMap.put("Emir", 3);
        System.out.println(IntMap.get("Serhat")); // 1










    }
}
