/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.fundamental;

import datastructures.fundamental.dommain.GameEntry;

/**
 *
 * @author slem
 */
public class Scoreboard {

    private GameEntry[] board;

    public GameEntry[] getBoard() {
        return board;
    }

    public int getNumEntries() {
        return numEntries;
    }
    private int numEntries = 0;

    public Scoreboard(int maxLength) {
        this.board = new GameEntry[maxLength];
    }

    public void add(GameEntry entry) {
        int newScore = entry.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }
            
            int pos = numEntries-1;
            
            while(pos > 0 && newScore > board[pos-1].getScore()){
                board[pos] = board[pos-1];
                pos--;
            }
            
            board[pos] = entry;
            
        }
    }
    
    
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if(i<0 || i>=numEntries){
            throw new IndexOutOfBoundsException("Invalid index: "+i);            
        }
        
        GameEntry e = board[i];
        
        for(int j =i; j<numEntries-1; j++){
            board[j] = board[j+1];
        }        
        numEntries--;
        board[numEntries] = null;
                
        return e;
    }
}
