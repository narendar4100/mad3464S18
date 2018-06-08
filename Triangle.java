/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author hp
 */
public class Triangle extends shape{
    Triangle(int x, int y){
        super(x,y);
    }

    @Override
    void draw(){
        System.out.println("drawing tringale ate"+ super.x + "and" + super.y);
        
}
}

