package com.titoacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "tito academy for programming";
        char [] myChar = myString.toCharArray();
        myChar[0] = (char) (myChar[0] - 32);
        for (int i = 1;i < myChar.length;i++){
            if (myChar[i] == ' '){
                myChar[i + 1] = (char)(myChar[i + 1] - 32);
            }
        }

        System.out.println(myString);
        System.out.println(myChar);

    }
}
