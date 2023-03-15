package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public char getFirstSingle(String word) {

        char[] charArray = word.toCharArray();

        for (int i=0; i<charArray.length; i++) {
            boolean found = false;                       
            for (int j=i+1; j< charArray.length; j++) {
               if (charArray[i] != '\0' && charArray[i] == charArray[j]) {
                   found = true;
                   charArray[j] = '\0';
               }
            }
            if (charArray[i] != '\0' && !found) {return charArray[i];}
        }
        return '\0';
    }

}
