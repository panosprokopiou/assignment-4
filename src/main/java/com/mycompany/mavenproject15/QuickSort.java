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
public class QuickSort {
    
    
    public static Shirt[] quickSort(Shirt[] array, int begin, int end, Comparator comparator) {
        if (begin < end) {
            
            
            int partitionIndex = partition(array, begin, end, comparator);
            quickSort(array, begin, partitionIndex - 1, comparator);
            quickSort(array, partitionIndex + 1, end, comparator);
        }
        
        return array;
    }
    
    
    
    
    
    
    private static int partition(Shirt arr[], int begin, int end, Comparator comparator) {
        Shirt pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (comparator.compare(arr[j], pivot) < 0) {
                i++;
                Shirt swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Shirt swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

    static void quickSort(Tshirt[] Shirtlist, int i, int i0, ComparatorSize sizesort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void quickSort(Tshirt[] Shirtlist, int i, int i0, ComparatorColor colorsort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void quickSort(Tshirt[] Shirtlist, int i, int i0, ComparatorFabric fabricsort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
