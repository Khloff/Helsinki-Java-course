/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Cube {

    private int length;

    public Cube(int length) {
        this.length = length;
    }
    
    public int volume(){
        return this.length * this.length * length;
    }
    
    public String toString(){
        return "The length of the edge is " + this.length + " and the volume " + volume();
    }

}
