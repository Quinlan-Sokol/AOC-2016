/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

/**
 *
 * @author QDS
 */
public class Day9 {
    public static void main(String args[])
    {
        String list = "X(8x2)(3x3)ABCY";//20
        int length = 0;
        
        for(int i = 0; i < list.length(); i++)
        {
            if(list.charAt(i) == '('){
                String marker = "";
                for(int j = i+1; j < list.length(); j++){
                    if(list.charAt(j) == ')'){
                        break;
                    }
                    marker += list.charAt(j);
                }
                
                int sub = Integer.parseInt(marker.split("x")[0]);
                int rep = Integer.parseInt(marker.split("x")[1]);
                length += sub * rep;
                i += sub + marker.length() + 1;
            }
            else{
                length++;
            }
        }
        System.out.println(length);
    }
}
