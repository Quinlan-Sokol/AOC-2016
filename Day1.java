/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author QDS
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Point> visited = new ArrayList();
        String[] directions = {"R8", "R4", "R4", "R8"};
        //String[] directions = {"R1", "L4", "L5", "L5", "R2", "R2", "L1", "L1", "R2", "L3", "R4", "R3", "R2", "L4", "L2", "R5", "L1", "R5", "L5", "L2", "L3", "L1", "R1", "R4", "R5", "L3", "R2", "L4", "L5", "R1", "R2", "L3", "R3", "L3", "L1", "L2", "R5", "R4", "R5", "L5", "R1", "L190", "L3", "L3", "R3", "R4", "R47", "L3", "R5", "R79", "R5", "R3", "R1", "L4", "L3", "L2", "R194", "L2", "R1", "L2", "L2", "R4", "L5", "L5", "R1", "R1", "L1", "L3", "L2", "R5", "L3", "L3", "R4", "R1", "R5", "L4", "R3", "R1", "L1", "L2", "R4", "R1", "L2", "R4", "R4", "L5", "R3", "L5", "L3", "R1", "R1", "L3", "L1", "L1", "L3", "L4", "L1", "L2", "R1", "L5", "L3", "R2", "L5", "L3", "R5", "R3", "L4", "L2", "R2", "R4", "R4", "L4", "R5", "L1", "L3", "R3", "R4", "R4", "L5", "R4", "R2", "L3", "R4", "R2", "R1", "R2", "L4", "L2", "R2", "L5", "L5", "L3", "R5", "L5", "L1", "R4", "L1", "R1", "L1", "R4", "L5", "L3", "R4", "R1", "L3", "R4", "R1", "L3", "L1", "R1", "R2", "L4", "L2", "R1", "L5", "L4", "L5"};
        int direction = 1; //1=north 2=east 3=south 4=west
        int y = 0;
        int x = 0;
        String tempamount = "";
        int amount;
        
        for(int i = 0; i < directions.length; i++)
        {
            if(directions[i].startsWith("R")){
                direction += 1;
                tempamount = directions[i].replace("R", "");
            }
            else if(directions[i].startsWith("L")){
                direction -= 1;
                tempamount = directions[i].replace("L", "");
            }
            
            if(direction > 4){
                direction = 1;
            }
            if(direction < 1){
                direction = 4;
            }
            
            amount = Integer.parseInt(tempamount);
            
            switch(direction){
                case 1://north
                    y += amount;
                    break;
                case 2://east
                    x += amount;
                    break;
                case 3://south
                    y -= amount;
                    break;
                case 4://west
                    x -= amount;
                    break;
            }
            
            
            if(visited.contains(new Point(x,y))){
                System.out.println(Math.abs(x)+Math.abs(y));
                break;
            }
            visited.add(new Point(x,y));
        }
        
    }
    
}
