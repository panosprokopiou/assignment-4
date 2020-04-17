/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject15;

/**
 *
 * @author Pan
 */
//Panagiotis Prokopiou
public class Main {
    
    public static void main(String[] args) {
        Tshirt make = new Tshirt();
        Tshirt[] Shirtlist = make.production(40);
        
        
        
        ComparatorSize sizesort = new ComparatorSize();
        ComparatorFabric fabricsort = new ComparatorFabric();
        ComparatorColor colorsort = new ComparatorColor();
        
        
        
        
        
        System.out.println("Sorting size:");
        BubbleSort sort = new BubbleSort();
        
        sort.bubbleSort(Shirtlist, sizesort);
        for (int y = 0; y < Shirtlist.length; y++) {
          System.out.print(Shirtlist[y]);  
        }
        
        
        sort.bubbleSort(Shirtlist, fabricsort);
        for (int y = 0; y < Shirtlist.length; y++) {
          System.out.print(Shirtlist[y]);  
        }
        
         sort.bubbleSort(Shirtlist, colorsort);
        for (int y = 0; y < Shirtlist.length; y++) {
          System.out.print(Shirtlist[y]);  
        }
        
        System.out.println("Sorting size:");
        QuickSort.quickSort(Shirtlist, 0, Shirtlist.length - 1, colorsort); 
        QuickSort.quickSort(Shirtlist, 0, 0, colorsort);                

        QuickSort.quickSort(Shirtlist, 0, Shirtlist.length - 1, sizesort); 
        QuickSort.quickSort(Shirtlist, 0, 0, sizesort);   
        
        QuickSort.quickSort(Shirtlist, 0, Shirtlist.length - 1, fabricsort); 
        QuickSort.quickSort(Shirtlist, 0, 0, fabricsort);
        
    }

}





        