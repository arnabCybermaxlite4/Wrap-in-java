package com.company;

public class L8_String_method {
    public static void main(String[] args) {
        String name ="Arnab";
        System.out.println("The name is : " + name);
        int value = name.length();
        System.out.println("The length of the name is : " + value);
        String lowstring = name.toLowerCase();
        System.out.println("The lower case of the name is : " + lowstring);
        String upperstring = name.toUpperCase();
        System.out.println("The upper case of the name is : " + upperstring);
        String nontrimstring = "      Arnab Ganguly";
        String trimstring = nontrimstring.trim();
        System.out.println("The trim of the name is : " + trimstring);
        String substring = name.substring(2);
        System.out.println("The substring of the name is : " + substring);
        String substring2 = name.substring(2,4);
        System.out.println("The substring of the name is : " + substring2);
        String replace = name.replace("a","A");
        System.out.println("The replaced string is :" + replace);
        String replace2 = name.replace("Arnab","Arnav");
        System.out.println("The replaced string is :" + replace2);
        boolean start = name.startsWith("An");
        System.out.println("Is the string starts with : " +start);
        boolean end = name.endsWith("ta");
        System.out.println("Is the string ends with : " +end);
        char chrAT = name.charAt(2);
        System.out.println("The character at index 2 is : " + chrAT);
        int index = name.indexOf("a");
        System.out.println("The index of the character is : " + index);
        String modifiedname = "Arnabnab";
        System.out.println("The index value of modified index is : " + modifiedname.indexOf("ab",4));
        int lastindex = modifiedname.lastIndexOf("ab");
        System.out.println("The last index value of modified index is : " + lastindex);
        System.out.println("The last index value of modified index is : " + modifiedname.lastIndexOf("ab" ,4));
        Boolean equal = name.equals("Mathamota");
        System.out.println("Is the string equal to Mathamota : " + equal);
        Boolean equal2 = name.equalsIgnoreCase("arnab");
        System.out.println("Is the string equal to Mathamota : " + equal2);
        String concat = name.concat(" Ganguly");
        System.out.println("The concat of the name is : " + concat);
    }
}
