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
public enum Color {
    
    
    RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5);
	
	
	
	
	private int value;
	
	
	
	private Color(int y) {
		
		this.value = y;
	}


	public int getValue() {
		return value;
	}
	
	
	public static Color getRandomColor(){
            
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
	
    
    
}
