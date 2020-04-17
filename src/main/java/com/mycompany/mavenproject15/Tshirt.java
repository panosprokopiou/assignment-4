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
public class Tshirt {

    public Tshirt(Color randomColor, Size randomSize, Fabric randomFabric) {
    }
    
    
    
    private final Tshirt[] maketshirts = new Tshirt[40];

    Tshirt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    //create tshirts
    public Tshirt[] production(int quantity){
        for (int y=0; y<quantity; y++){
            
            maketshirts[y]= new Tshirt(Color.getRandomColor(), Size.getRandomSize(), Fabric.getRandomFabric());
        }
        return maketshirts;
    }

    Object getC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
