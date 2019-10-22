package com.padmaja.flowcontrol;
import java.lang.String;

public class DoWhileLoopExample {
    public int tablesExample(int num,boolean divisibleBy7) {
       // boolean divisibleBy7 = false;
        do {
            System.out.println(num);
            if (num % 7 == 0)divisibleBy7 = true;
            num--;
        }while (divisibleBy7 == false);

        return num;

    }

    public int whileLoopExample2(int num, boolean divisibleBy7) {
        //boolean divisibleBy7 = true;
        do {
            System.out.println(num);
            if (num % 7 == 0)divisibleBy7 =false;
            num--;
        }while(divisibleBy7 == true);
        return num;

    }

}