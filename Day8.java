/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author QDS
 */
public class Day8 {
    public static void main(String args[])
    {
        String[] instr = {"rect 1x1",
"rotate row y=0 by 6",
"rect 1x1",
"rotate row y=0 by 3",
"rect 1x1",
"rotate row y=0 by 5",
"rect 1x1",
"rotate row y=0 by 4",
"rect 2x1",
"rotate row y=0 by 5",
"rect 2x1",
"rotate row y=0 by 2",
"rect 1x1",
"rotate row y=0 by 5",
"rect 4x1",
"rotate row y=0 by 2",
"rect 1x1",
"rotate row y=0 by 3",
"rect 1x1",
"rotate row y=0 by 3",
"rect 1x1",
"rotate row y=0 by 2",
"rect 1x1",
"rotate row y=0 by 6",
"rect 4x1",
"rotate row y=0 by 4",
"rotate column x=0 by 1",
"rect 3x1",
"rotate row y=0 by 6",
"rotate column x=0 by 1",
"rect 4x1",
"rotate column x=10 by 1",
"rotate row y=2 by 16",
"rotate row y=0 by 8",
"rotate column x=5 by 1",
"rotate column x=0 by 1",
"rect 7x1",
"rotate column x=37 by 1",
"rotate column x=21 by 2",
"rotate column x=15 by 1",
"rotate column x=11 by 2",
"rotate row y=2 by 39",
"rotate row y=0 by 36",
"rotate column x=33 by 2",
"rotate column x=32 by 1",
"rotate column x=28 by 2",
"rotate column x=27 by 1",
"rotate column x=25 by 1",
"rotate column x=22 by 1",
"rotate column x=21 by 2",
"rotate column x=20 by 3",
"rotate column x=18 by 1",
"rotate column x=15 by 2",
"rotate column x=12 by 1",
"rotate column x=10 by 1",
"rotate column x=6 by 2",
"rotate column x=5 by 1",
"rotate column x=2 by 1",
"rotate column x=0 by 1",
"rect 35x1",
"rotate column x=45 by 1",
"rotate row y=1 by 28",
"rotate column x=38 by 2",
"rotate column x=33 by 1",
"rotate column x=28 by 1",
"rotate column x=23 by 1",
"rotate column x=18 by 1",
"rotate column x=13 by 2",
"rotate column x=8 by 1",
"rotate column x=3 by 1",
"rotate row y=3 by 2",
"rotate row y=2 by 2",
"rotate row y=1 by 5",
"rotate row y=0 by 1",
"rect 1x5",
"rotate column x=43 by 1",
"rotate column x=31 by 1",
"rotate row y=4 by 35",
"rotate row y=3 by 20",
"rotate row y=1 by 27",
"rotate row y=0 by 20",
"rotate column x=17 by 1",
"rotate column x=15 by 1",
"rotate column x=12 by 1",
"rotate column x=11 by 2",
"rotate column x=10 by 1",
"rotate column x=8 by 1",
"rotate column x=7 by 1",
"rotate column x=5 by 1",
"rotate column x=3 by 2",
"rotate column x=2 by 1",
"rotate column x=0 by 1",
"rect 19x1",
"rotate column x=20 by 3",
"rotate column x=14 by 1",
"rotate column x=9 by 1",
"rotate row y=4 by 15",
"rotate row y=3 by 13",
"rotate row y=2 by 15",
"rotate row y=1 by 18",
"rotate row y=0 by 15",
"rotate column x=13 by 1",
"rotate column x=12 by 1",
"rotate column x=11 by 3",
"rotate column x=10 by 1",
"rotate column x=8 by 1",
"rotate column x=7 by 1",
"rotate column x=6 by 1",
"rotate column x=5 by 1",
"rotate column x=3 by 2",
"rotate column x=2 by 1",
"rotate column x=1 by 1",
"rotate column x=0 by 1",
"rect 14x1",
"rotate row y=3 by 47",
"rotate column x=19 by 3",
"rotate column x=9 by 3",
"rotate column x=4 by 3",
"rotate row y=5 by 5",
"rotate row y=4 by 5",
"rotate row y=3 by 8",
"rotate row y=1 by 5",
"rotate column x=3 by 2",
"rotate column x=2 by 3",
"rotate column x=1 by 2",
"rotate column x=0 by 2",
"rect 4x2",
"rotate column x=35 by 5",
"rotate column x=20 by 3",
"rotate column x=10 by 5",
"rotate column x=3 by 2",
"rotate row y=5 by 20",
"rotate row y=3 by 30",
"rotate row y=2 by 45",
"rotate row y=1 by 30",
"rotate column x=48 by 5",
"rotate column x=47 by 5",
"rotate column x=46 by 3",
"rotate column x=45 by 4",
"rotate column x=43 by 5",
"rotate column x=42 by 5",
"rotate column x=41 by 5",
"rotate column x=38 by 1",
"rotate column x=37 by 5",
"rotate column x=36 by 5",
"rotate column x=35 by 1",
"rotate column x=33 by 1",
"rotate column x=32 by 5",
"rotate column x=31 by 5",
"rotate column x=28 by 5",
"rotate column x=27 by 5",
"rotate column x=26 by 5",
"rotate column x=17 by 5",
"rotate column x=16 by 5",
"rotate column x=15 by 4",
"rotate column x=13 by 1",
"rotate column x=12 by 5",
"rotate column x=11 by 5",
"rotate column x=10 by 1",
"rotate column x=8 by 1",
"rotate column x=2 by 5",
"rotate column x=1 by 5"};
        boolean[][] grid = new boolean[50][6];
        for(int i = 0; i < 50; i++){
            for(int j = 0; j < 6; j++){
                grid[i][j] = false;
            }
        }
        
        for(String str : instr)
        {
            if(str.split(" ", 2)[0].equals("rect")){
                for(int i = 0; i < Integer.parseInt(str.split(" ")[1].split("x")[0]); i++){
                    for(int j = 0; j < Integer.parseInt(str.split(" ")[1].split("x")[1]); j++){
                        grid[i][j] = true;
                    }
                }
            }
            else if(str.split(" ", 2)[0].equals("rotate") && str.split(" ", 3)[1].equals("column")){
                int x = Integer.parseInt(str.split(" ", 4)[2].split("=")[1]);
                int amount = Integer.parseInt(str.split(" ", 5)[4]);
                ArrayList<Boolean> array = new ArrayList();
                for(int i = 0; i < 6; i++){
                    array.add(grid[x][i]);
                }
                Collections.rotate(array, amount);
                for(int i = 0; i < 6; i++){
                    grid[x][i] = array.get(i);
                }
            }
            else if(str.split(" ", 2)[0].equals("rotate") && str.split(" ", 3)[1].equals("row")){
                int y = Integer.parseInt(str.split(" ", 4)[2].split("=")[1]);
                int amount = Integer.parseInt(str.split(" ", 5)[4]);
                ArrayList<Boolean> array = new ArrayList();
                for(int i = 0; i < 50; i++){
                    array.add(grid[i][y]);
                }
                Collections.rotate(array, amount);
                for(int i = 0; i < 50; i++){
                    grid[i][y] = array.get(i);
                }
            }
        }
        String[][] display = new String[50][6];
        for(int i = 0; i < 50; i++){
            for(int j = 0; j < 6; j++){
                if(grid[i][j] == true){
                    display[i][j] = "#";
                }
                else{
                    display[i][j] = ".";
                }
            }
        }
        //PRINTING DISPLAY
        
        for(int i = 0; i < 6; i++){
            String c = "";
            for(int j = 0; j < 50; j++){
                c += display[j][i];
            }
            System.out.println(c);
        }
    }    
}
