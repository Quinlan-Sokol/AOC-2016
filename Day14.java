/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author QDS
 */
public class Day14 {
    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        int index = 0;
        ArrayList<String> keys = new ArrayList();
        
        while(keys.size() < 64)
        {
            String hash = getHash("ngcjuoqr" + Integer.toString(index));
            
            boolean hasTriple = false;
            char c = ' ';
            //check for triple
            for(int i = 0; i < hash.length()-2; i++){
                String sub = hash.substring(i, i+3);
                if(sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)){
                    hasTriple = true;
                    c = sub.charAt(0);
                    break;
                }
            }
            
            //check next 1000 for char * 5
            if(hasTriple)
            {
                String sub = String.valueOf(c) + String.valueOf(c) + String.valueOf(c) + String.valueOf(c) + String.valueOf(c);
                for(int i = index; i < 1000; i++){
                    String checkHash = getHash("ngcjuoqr" + Integer.toString(i));
                    if(checkHash.contains(sub.toLowerCase())){
                        keys.add(hash);
                        System.out.println(index);
                        break;
                    }
                }
            }
            
            index++;
        }
        System.out.println(index);
    }
    static String getHash(String ID) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(ID.getBytes());
        byte[] digest = md.digest();
        String hash = DatatypeConverter.printHexBinary(digest).toLowerCase();
        return hash;
    }
}
