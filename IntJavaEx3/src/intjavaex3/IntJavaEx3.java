/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavaex3;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class IntJavaEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String choice = "y";
        
        //Lets set this up to execute as many times as you wish
        while (choice.equalsIgnoreCase("y")){
            p("Hello and welcome to the counting application.");
            
            //Prompt the user's first anem
            p("Please provide first name");
            String firstName = sc.next();
            p("Please provide last name");
            String lastName = sc.next();
            
            p("Please provide a starting number");
            int startingNumber = sc.nextInt();
            sc.nextLine();
            
            p("Please provide the number iterations");
            int countIterations = sc.nextInt();
            sc.nextLine();
            
            p("Please provide a method for counting 1 or StringBuilder, 2 for concatentation");
            int useSB = sc.nextInt();
            sc.nextLine();
            
            p("Your name: \t" + firstName + ' ' + lastName + "\n will no count for you");
            
            if (useSB == 1){
                for (int i = startingNumber; i < (countIterations + startingNumber); i++){
                    sb.append(i);
                    sb.append("\n");
                }
                p(sb.toString());
            }
            else{
                String myString = "";
                
                for (int i = startingNumber; i < (countIterations + startingNumber); i++){
                    myString += i + "\n";
                }
                
                p(myString);
            }
            
            
            
            p("Continue? y/n");
            choice = sc.nextLine();
            
        }
        
    }
    
    
    static void p(String msg){
        System.out.println(msg);
    }
}
