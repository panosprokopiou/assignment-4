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
public class ComparatorColor implements Comparator<Shirt> {

    @Override
    public int compare(Shirt t1, Shirt t2) {
        return (t1.getC().ordinal() - t2.getC().ordinal());
    }
    
       
    
    @Override
    public Comparator<Shirt> reversed() {
        return Comparator.super.reversed(); 
    }

    
}






