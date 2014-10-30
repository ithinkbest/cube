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
public class MagicCube {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Cube cube=new Cube(123);
          System.out.println(" "+cube);
          
          cube.act(123);
          System.out.println(" "+cube);
          cube.act(123);
          System.out.println(" "+cube);
          cube.act(123);
          System.out.println(" "+cube);
          cube.act(123);
          System.out.println(" "+cube);
          
          System.out.println(" --- ");
          cube.act(132);
          System.out.println(" "+cube);
          cube.act(132);
          System.out.println(" "+cube);
          cube.act(132);
          System.out.println(" "+cube);
          cube.act(132);
          System.out.println(" "+cube);
          
          
    }
    
}
