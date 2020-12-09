/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author QDS
 */
public class Day13 {
    public static void main(String args[])
    {
        int number = 1358;
        int[][] map = new int[5000][5000];
        
        //creates maze
        for(int x = 0; x < 5000; x++){
            for(int y = 0; y < 5000; y++){
                int temp = x*x + 3*x + 2*x*y + y + y*y;
                int bits = Integer.bitCount(temp + number);
                
                if(bits % 2 == 0){
                    map[x][y] = 0;
                }else{
                    map[x][y] = 1;
                }
            }
        }
        
        solve(map);
    }
    public static void solve(int[][] maze)
    {
        Queue<Point> q = new LinkedList();
        ArrayList<Point> visited = new ArrayList();
        q.add(new Point(1,1));
        visited.add(new Point(1,1));
        int dis = 0;
        int neighbors;
        int qsize = q.size();
        
        while(qsize > 0)
        {
            while(qsize-- > 0){
                Point c = q.remove();
                //if at goal
                if(c.x == 31 && c.y == 39){
                    System.out.println(dis);
                    //printMaze(maze);
                    break;
                }
                if(dis == 50){
                    System.out.println(qsize);
                    break;
                }
                else{
                    neighbors = 0;
                    Point north = new Point(c.x, c.y + 1);
                    Point south = new Point(c.x, c.y - 1);
                    Point east = new Point(c.x + 1, c.y);
                    Point west = new Point(c.x - 1, c.y);

                    if(north.x >= 0 && north.y >= 0 && maze[north.x][north.y] == 0 && !visited.contains(north)){
                        visited.add(north);
                        q.add(north);
                        maze[north.x][north.y] = 5;
                    }
                    if(south.x >= 0 && south.y >= 0 && maze[south.x][south.y] == 0 && !visited.contains(south)){
                        visited.add(south);
                        q.add(south);
                        maze[south.x][south.y] = 5;
                    }
                    if(east.x >= 0 && east.y >= 0 && maze[east.x][east.y] == 0 && !visited.contains(east)){
                        visited.add(east);
                        q.add(east);
                        maze[east.x][east.y] = 5;
                    }
                    if(west.x >= 0 && west.y >= 0 && maze[west.x][west.y] == 0 && !visited.contains(west)){
                        visited.add(west);
                        q.add(west);
                        maze[west.x][west.y] = 5;
                    }

                    if(qsize <= 0){
                        qsize = q.size();
                        if(qsize > 0) dis++;
                    }
                }
            }
        }
    }
    public static void printMaze(int[][] map)
    {
        for(int i = 0; i < 10; i++){
            String c = "";
            for(int j = 0; j < 10; j++){
                c += map[j][i];
            }
            System.out.println(c);
        }
    }
}
