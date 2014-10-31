/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithinkbest.magiccube;

/**
 *
 * @author J20018
 */
public class Ring {
    private Cube[] ring=new Cube[9];

    public Ring() {
        for (int i=0;i<9;i++){
            ring[i]=new Cube();
        }
        
        
        
    }
    public static void main(String[] args){
        Ring ring=new Ring();
        System.out.println(ring);
    }
    
    
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<9;i++){
            sb.append(ring[i]);
        }
        
        
        return sb.toString();
    }
}
