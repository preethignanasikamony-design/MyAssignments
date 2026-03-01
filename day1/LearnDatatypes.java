package org.testleaf.week1.day1;

public class LearnDatatypes {
public static void main(String[] args) {
    byte age =33;  //-128 to 127 -- 1 byte
    System.out.println(age);
    short amount =32566; //-32768 to 32767 -- 2 bytes
    System.out.println(amount);
    int salary=567856; //4 bytes
    long phone =9999967548L;// --8 bytes

    float rate=10.3456788f; // can store upto 7 decimals if given more than that , it will be rounded to 7 decimals
    System.out.println(rate);
    double amount1 =67.7864887657865468; //can store upto 15 decimals
    System.out.println(amount1);

    //char - a single character, special character, number or alphabet
    char logo='Y';

    //boolean - true or false

    boolean isPresent=true;

    //String --collection of characters/ collection of numbers, collection of spl characters or combination
    String name="Preethi";
    System.out.println(name);

    //print more than 1 variable in syso
    System.out.println(name+age); //+ is the concatenation 
    System.out.println(name+" "+age); // to create space between name and age //Preethi 33
}
}
