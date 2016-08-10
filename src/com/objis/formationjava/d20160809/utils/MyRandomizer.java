package com.objis.formationjava.d20160809.utils;

/**
 * Created by Stagiaire on 10/08/2016.
 */
public class MyRandomizer {

    public static String generate(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuffer pass = new StringBuffer();
        for(int x=0;x<length;x++)   {
            int i = (int)Math.floor(Math.random() * (chars.length() -1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }


    public static String generateCodePostal() {
        int length = 5;
        String chars = "123456789";
        StringBuffer pass = new StringBuffer();

        int i = (int)Math.floor(Math.random() * (chars.length() -1));
        pass.append(chars.charAt(i));

        chars = "1234567890";

        for(int x=1;x<length;x++)   {
            i = (int)Math.floor(Math.random() * (chars.length() -1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }

    public static String generatePhone(){
        int length = 10;
        String chars = "1234567890";
        StringBuffer pass = new StringBuffer();
        for(int x=0;x<length;x++)   {
            int i = (int)Math.floor(Math.random() * (chars.length() -1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }


    public static int generateInt(int length){
        String chars = "1234567890";
        StringBuffer pass = new StringBuffer();
        for(int x=0;x<length;x++)   {
            int i = (int)Math.floor(Math.random() * (chars.length() -1));
            pass.append(chars.charAt(i));
        }
        return Integer.valueOf(pass.toString());
    }


}
