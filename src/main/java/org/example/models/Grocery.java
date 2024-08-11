package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Grocery {
    Scanner scanner = new Scanner(System.in);
    public static List<String> groceryList = new ArrayList<>();

    public void startGrocery(){
        int choise;
        do{
            System.out.println("Yapılmak istenen operasyonu seçin. {0= çıkış, 1= ekleme, 2= çıkarma");
            choise=scanner.nextInt();
            scanner.nextLine();
            switch (choise){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
            }
        }
        while (choise !=0);
        scanner.close();
    }

    public static void removeItems(String itemsToRemove) {

        String[] splitItems=itemsToRemove.split(",");
        for(String item:splitItems){
            item=item.trim();
            if(!checkItemIsInList(item)){
                System.out.println("Girelen item listede mevcut değil: "+item);
            }
            else {
                groceryList.remove(item);
            }
        }
        sortItems();
    }

    public static void addItems(String itemsToAdd) {
        String[] splitItems=itemsToAdd.split(",");

        for(String item:splitItems){
            item=item.trim();
            if(checkItemIsInList(item)){
                System.out.println("Girelen item listede mevcut: "+item);
            }
            else {
                groceryList.add(item);
            }
        }
        sortItems();
    }

    public static boolean checkItemIsInList(String item) {
        return groceryList.contains(item);
    }
    public static void printSorted(){
        sortItems();
        System.out.println("Mevcut Pazar Listesi: ");
        for(String item: groceryList){
            System.out.println(item);
        }
    }

    public static void sortItems() {
        Collections.sort(groceryList);
    }

}
