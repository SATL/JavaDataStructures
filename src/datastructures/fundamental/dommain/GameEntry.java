/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.fundamental.dommain;

/**
 *
 * @author slem
 */
public class GameEntry {
    
    private String name;
    private int score;
    
    public GameEntry(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public GameEntry(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
    public String toString(){
        return this.name+": "+this.score;
    }
    
}
