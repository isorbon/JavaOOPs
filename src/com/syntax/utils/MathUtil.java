package com.syntax.utils;

public class MathUtil {
        public static double trimDecimalNumbers(double value, int decimalpoint)
        {
            // Using the pow() method
            value = value * Math.pow(10, decimalpoint);
            value = Math.floor(value);
            value = value / Math.pow(10, decimalpoint);
            System.out.println(value);
            return value;
        }

        public static void main(String[] args) {
            double number = 10.9999999;
            System.out.println(trimDecimalNumbers(number, 2));

        }
}
