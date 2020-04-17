/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject15;

import java.util.Comparator;

/**
 *
 * @author Pan
 */
public class BubbleSort {
    
    
    public Shirt[] bubbleSort(Shirt[] arraytosort, Comparator comparator) {
        int n = arraytosort.length;
        Shirt temp;
        for (int y = 0; y < n; y++) {
            for (int j = 1; j < (n - y); j++) {
                if (comparator.compare(arraytosort[j - 1], arraytosort[j]) > 0) {
                    
                    
                    temp = arraytosort[j - 1];
                    arraytosort[j - 1] = arraytosort[j];
                    arraytosort[j] = temp;
                }
            }
        }
        
        return arraytosort;
       
    
    }

    void bubbleSort(Tshirt[] Shirtlist, ComparatorSize sizesort) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void bubbleSort(Tshirt[] Shirtlist, ComparatorFabric fabricsort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void bubbleSort(Tshirt[] Shirtlist, ComparatorColor colorsort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

}