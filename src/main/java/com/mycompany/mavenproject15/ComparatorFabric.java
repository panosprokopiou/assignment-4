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
public class ComparatorFabric implements Comparator<Shirt>{

    
    
    @Override
    public int compare(Shirt t1, Shirt t2) {
        return (t1.getF().ordinal() - t2.getF().ordinal());
    }
    
       
    
    @Override
    public Comparator<Shirt> reversed() {
        return Comparator.super.reversed(); 
    }
    
    
    
    
    
   
}





