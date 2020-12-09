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
public class Day16 {
    public static void main(String args[])
    {
        String data = "10001001100000001";
        int length = 35651584;
        
        while(data.length() < length){
            String b = new StringBuilder(data).reverse().toString().replace("0", "2").replace("1", "0").replace("2", "1");
            data += "0" + b;
        }
        
        if(data.length() > length){
            data = data.substring(0, length);
        }
        
        String pattern = "";
        for(int i = 0; i < data.length()/2; i++)
        {
            pattern += data.charAt(i);
            System.out.print(pattern);
            if(pattern.equals(data.substring(i+1, i+1+data.length()/2))){
                
            }
        }
        
        String checksum = "";
        
        while(data.length() % 2 == 0)
        {
            for(int i = 0; i < data.length(); i += 2){
                if(data.charAt(i) == data.charAt(i+1)){
                    checksum += "1";
                }else{
                    checksum += "0";
                }
            }
            data = checksum;
            checksum = "";
        }
        System.out.println(data);
    }
}
