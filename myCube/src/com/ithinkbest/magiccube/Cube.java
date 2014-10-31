/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithinkbest.magiccube;

/**
 *
 * @author u1
 */
public class Cube {
    
    // for any single cube
    // possbile status count is 24
    // top, left, right
    // 1    2   3 White Red Blue
    /*
    1White<=>4Yellow
    2Red<=>5Orange
    3Blue<=>6Green
    
    123
    135
    15
    
    
    */
    private int state;
    private int state1;
    private int state2;
    private int state3;
    
    public Cube() {
       
        state=0;
        state1=0;
        state2=0;
        state3=0;
        
    }
 
    
    
    public Cube(int state) {
        this.state = state;
        state1=state/100;
        state2=state-100*state1;
        state2=state2/10;
        state3=state-100*state1-10*state2;
        
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    private int getBack(int front){
        switch(front){
            case 1:return 4;
            case 2:return 5;
            case 3:return 6;
            case 4:return 1;
            case 5:return 2;
            case 6:return 3;
                
        }
        return -1;
    }
    /**
     * 123
     * 132
     * 213
     * 231
     * 312
     * 321
     * @param k 
     */
    public void act(int k){
        int k1,k2,k3,temp;
        k1=k/100;
        k2=k-100*k1;
        k2=k2/10;
        k3=k-100*k1-10*k2;
        switch (k){
            case 123:
                temp=state3;
                state3=state2;
                state2=getBack(temp);
                break;
            case 132:
                temp=state2;
                state2=state3;
                state3=getBack(temp);
                
                break;
            case 213:
                temp=state3;
                state3=state1;
                state1=getBack(temp);
                
                break;
            case 231:
                temp=state1;
                state1=state3;
                state3=getBack(temp);
                
                break;
            case 312:
                temp=state2;
                state2=state1;
                state1=getBack(temp);
                
                break;
            case 321:
                temp=state1;
                state1=state2;
                state2=getBack(temp);
                
                break;
                
            default:
                state1=0;
                state2=0;
                state3=0;
            
        }
        
    }
    
    
    @Override
    public String toString(){
        return state1+"-"+state2+"-"+state3+" ";
    }
    
    public static void main(String[] args){
        System.out.println(" "+new Cube(123));
    }
}
