package com.emilioaraos;

public class Main {

    public static void main(String[] args) {

        for(int i =1; i<=10;i++){
            for(int j = 1; j<=10 ; j++){
               if( j % 3==0){
                   System.out.print("*");

               }    else{
                   System.out.print("o");
               }
            }
            System.out.println();
        }


    }
}
