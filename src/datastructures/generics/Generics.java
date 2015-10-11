/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.generics;

/**
 *
 * @author Slem
 */
public class Generics {
    public static <T> T[] reverse(T[] data){
        int low = 0, high = data.length-1;
        
        while(low<high){
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }
        return data;   
        
    }
}
