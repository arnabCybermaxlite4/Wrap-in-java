package com.company;
import java.util.*;
public class L17_array {
    public static void main(String[] args) {
        //type[] arrayname = new type[size];
        int[] marks = {100, 90, 80, 70, 50};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("The marks of student " + (i + 1) + " is: " + marks[i]);
        }
    }
}