/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.fundamental;

/**
 *
 * @author slem
 */
public class ArraysSort {
    
    
    public static void insertionSort(char[] arr){        
        
        for(int i = 0; i<arr.length; i++){
            char curr = arr[i];
            int j = i;
            
            while(j>0 && arr[j-1]>curr){
                arr[j] = arr[j-1];
                j--;
            }
            
            arr[j] = curr;
        }
    }
    
    public static void insertionSortDesc(char[] arr){        
        
        for(int i = 0; i<arr.length; i++){
            char curr = arr[i];
            int j = i;
            
            while(j>0 && arr[j-1]<curr){
                arr[j] = arr[j-1];
                j--;
            }
            
            arr[j] = curr;
        }
    }
}
