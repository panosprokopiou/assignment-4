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
public class Shirt {
    
    private Color c;
    private Size s;
    private Fabric f;
    private StrategyPayment payment;
    
    public Shirt(Color c, Size s, Fabric f, StrategyPayment payment) {
        this.c = c;
        this.s = s;
        this.f = f;
        this.payment = payment;
    }
    
    public void buyShirt() {
        this.payment.pay();
    }

    public Color getC() {
        return this.c;
    }
    
    public int CalcPrice(Shirt t) {
        int price = t.s.getValue() + t.f.getValue() + t.c.getValue();
        return price;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Size getS() {
        return this.s;
    }

    public void setS(Size s) {
        this.s = s;
    }

    public Fabric getF() {
        return this.f;
    }

    public void setF(Fabric f) {
        this.f = f;
    }
        public StrategyPayment getPay() {
        return this.payment;
    }

    public void setPay(StrategyPayment payment) {
        this.payment = payment;
    }
    
    @Override
    public String toString() {
        return "Tshirt{" + "c=" + c + ", s=" + s + ", f=" + f + ", pay=" + payment + '}';
    }
    
}






