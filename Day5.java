/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author QDS
 */
public class Day5 {
    public static void main(String args[]) throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
        StringBuilder password =new StringBuilder("        ");
        int index = 0;
        ArrayList<Integer> list = new ArrayList();
        
        while(password.indexOf(" ") != -1)
        {
            String ID = "cxdnnyjw" + Integer.toString(index);
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(ID.getBytes());
            byte[] digest = md.digest();
            String hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
            
            if(hash.substring(0, 5).equals("00000") && !Character.isAlphabetic(hash.codePointAt(5))){
                if(Integer.parseInt(Character.toString(hash.charAt(5))) < 8 && !list.contains(Integer.parseInt(Character.toString(hash.charAt(5))))){
                    
                    password.setCharAt(Integer.parseInt(Character.toString(hash.charAt(5))), hash.charAt(6));
                    list.add(Integer.parseInt(Character.toString(hash.charAt(5))));
                }
            }
            
            index += 1;
        }
        System.out.println(password);
    }
}
