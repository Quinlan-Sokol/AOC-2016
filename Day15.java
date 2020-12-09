/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.util.ArrayList;

/**
 *
 * @author QDS
 */
public class Day15 {
    public static void main(String args[])
    {
        int time = 0;
        ArrayList<Integer> discs = new ArrayList();
        discs.add(10);
        discs.add(15);
        discs.add(17);
        discs.add(1);
        discs.add(0);
        discs.add(1);
        
        discs.add(0);//part 2
        
        while(!canDrop(discs))
        {
            updateDiscs(discs);
            
            time++;
        }
        System.out.println(time - 1);
    }
    static boolean canDrop(ArrayList<Integer> discs)
    {
        ArrayList<Integer> discsCopy = (ArrayList<Integer>) discs.clone();
        
        for(int i : discsCopy){
            updateDiscs(discsCopy);
            
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    static void updateDiscs(ArrayList<Integer> discs)
    {
        if(discs.get(0) + 1 > 12){
                discs.set(0, 0);
        }else{
            discs.set(0, discs.get(0) + 1);
        }

        if(discs.get(1) + 1 > 16){
            discs.set(1, 0);
        }else{
            discs.set(1, discs.get(1) + 1);
        }
        
        if(discs.get(2) + 1 > 18){
            discs.set(2, 0);
        }else{
            discs.set(2, discs.get(2) + 1);
        }
        
        if(discs.get(3) + 1 > 6){
            discs.set(3, 0);
        }else{
            discs.set(3, discs.get(3) + 1);
        }
        
        if(discs.get(4) + 1 > 4){
            discs.set(4, 0);
        }else{
            discs.set(4, discs.get(4) + 1);
        }
        
        if(discs.get(5) + 1 > 2){
            discs.set(5, 0);
        }else{
            discs.set(5, discs.get(5) + 1);
        }
        
        if(discs.get(6) + 1 > 10){
            discs.set(6, 0);
        }else{
            discs.set(6, discs.get(6) + 1);
        }
    }
}
