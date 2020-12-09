/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author QDS
 */
public class Day12 {
    public static void main(String args[])
    {
        String[] list = {"cpy 1 a",
"cpy 1 b",
"cpy 26 d",
"jnz c 2",
"jnz 1 5",
"cpy 7 c",
"inc d",
"dec c",
"jnz c -2",
"cpy a c",
"inc a",
"dec b",
"jnz b -2",
"cpy c b",
"dec d",
"jnz d -6",
"cpy 14 c",
"cpy 14 d",
"inc a",
"dec d",
"jnz d -2",
"dec c",
"jnz c -5"};
        
        Map<String, Integer> registers = new HashMap();
        registers.put("a", 0);
        registers.put("b", 0);
        registers.put("c", 1);
        registers.put("d", 0);
        
        for(int k = 0; k < list.length; k++)
        {
            String[] split = list[k].split(" ");
            String str = split[0];
            String reg = split[1];
            String value = "";
            if(split.length > 2){
                value = split[2];
            }
            
            switch (str) {
                case "cpy":
                    int val;
                    if(registers.containsKey(reg)){
                        val = registers.get(reg);
                    }else{
                        val = Integer.parseInt(reg);
                    }
                    registers.replace(value, val);
                    break;
                case "inc":
                    registers.replace(reg, registers.get(reg) + 1);
                    break;
                case "dec":
                    registers.replace(reg, registers.get(reg) - 1);
                    break;
                case "jnz":
                    int x;
                    int y;
                    if(registers.containsKey(reg)){
                        x = registers.get(reg);
                    }else{
                        x = Integer.parseInt(reg);
                    }
                    if(registers.containsKey(value)){
                        y = registers.get(value);
                    }else{
                        y = Integer.parseInt(value);
                    }

                    if(x != 0){
                        k += y - 1;
                    }
                    break;
            }
        }
        System.out.println(registers.get("a"));
    }
}
