package com.company;

public class L6_Operators  {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;
        System.out.println("the Arithmetic operators");
        System.out.println("The sum of two numbers is : " + sum);
        System.out.println("The subtraction of two numbers is : " + sub);
        System.out.println("The multiplication of two numbers is : " + mul);
        System.out.println("The division of two number is : " + div);
        System.out.println("The remainder after division of two numbers is : " + rem);
        System.out.println("The increment operation result is "  + ++num1);
        System.out.println("The decrement operation result is " + --num2);
        num1+=6;
        System.out.println("The current value of num1 is : " + num1);
        num2-=6;
        System.out.println("The current value of num2 is : " + num2);
        num1*=2;
        System.out.println("The current value of num1 is : " + num1);
        num2/=2;
        System.out.println("The current value of num2 is :" + num2);
        System.out.println("Assignment operators");
        int num3 = 10;
        num3 = num1 + num2;
        System.out.println("The value of num3 is : " + num3);
        num3 += num1;
        System.out.println("The value of num3 is : " + num3);
        num3 -= num2;
        System.out.println("The value of num3 is : " + num3);
        num3 *= num1;
        System.out.println("The value of num3 is : " + num3);
        num3 /= num2;
        System.out.println("The value of num3 is : " + num3);
        num3 %= num1;
        System.out.println("The value of num3 is : " + num3);
        System.out.println("Comparison operators");
        int num4 = 100;
        int num5 = 200;
        System.out.println(num4 > num5);
        System.out.println(num4 < num5);
        System.out.println(num1>=num4);
        System.out.println(num2<=num5);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println("The logical operators");
        System.out.println(num4<num5 && num4>num1);
        System.out.println(num5>num1 || num4>num5);
        System.out.println("The final value of num1 is :" + num1);
        System.out.println("The final value of num2 is :" + num2);
        System.out.println("The final value of num3 is :" + num3);
        System.out.println("The final value of num4 is :" + num4);
        System.out.println("The final value of num5 is :" + num5);
    }

}
