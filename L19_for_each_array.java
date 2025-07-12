package com.company;

public class L19_for_each_array {
    public static void main(String[] args) {
        int[] marks={ 23, 45, 67, 89, 28};
        System.out.println(" print in actual order");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("in reverse order");
        for (int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("using for each loop: ");
        for(int element: marks){
            System.out.println(element);
        }
        System.out.println("printing the index: ");
        for(int i =0; i<marks.length; i++){
            System.out.println("index is "+i);
            System.out.println("element is "+marks[i]);
        }
    }
}
