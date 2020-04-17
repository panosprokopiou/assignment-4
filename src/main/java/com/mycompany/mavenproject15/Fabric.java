/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject15;

import java.util.Random;

/**
 *
 * @author Pan
 */
public enum Fabric {
    
    WOOL(5), COTTON(9), POLYESTER(10), CASHMERE(50), SILK(120);

    private int value;

    private Fabric(int y) {
        this.value = y;
    }

    public int getValue() {
        return this.value;
    }
    
    public static Fabric getRandomFabric(){
            
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    
}
