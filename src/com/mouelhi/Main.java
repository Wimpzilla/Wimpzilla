package com.mouelhi;

public class Main {


    public static String findPattern(String decimals) {

        String result="",subString;

        String val = decimals.substring(2);


        boolean repeated = false;

        int index = 0;

        while (!repeated) {

            result += val.charAt(index);

            if(index + result.length()+1 > val.length()) return result;

            subString = val.substring(result.length(),index + result.length()+1);

            if(result.equals(subString))
                break;

            if(index == val.length()) return "nothingFound";

            index++;

        }


        return result;
    }
    public static String computeDecimals(int length, int val) {

        String result = "0.";

        int remainder=1;

        for(int i=0;i<length;i++) {


            do {remainder*=10; if(remainder==0) return result;}
            while(val % remainder  == 0);



            result += (int)(remainder / val);

            remainder = remainder % val;


        }



        return result;
    }

    public static void main(String[] args) {
	// write your code here


        for(int i=970;i<=970;i++) {
            String decimals = computeDecimals(1000,i);

            System.out.println("1/" + i + " --->  " + decimals);


            String pattern = findPattern(decimals);

            System.out.println("1/" + i + "pattern --->  " + pattern);

        }

    }
}
