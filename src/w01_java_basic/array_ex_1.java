
/*
 *  Jinal Jani
 *  Student ID: 991525516
 *  SYST10199 - Web Programming
 */
package w01_java_basic;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class array_ex_1 
{
     /** a class to take in a word from the user 
      * and print reverse the word using array
      * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in); 
        System.out.println("please enter a word");
        String word=sc.nextLine();
        
        //create array
        
        char [] c = new char [word.length()]; //() as it is string data type upar wada eg ma natu
        
        //populate array c 
        for(int i=0; i<word.length(); i++)
        //for(int i=0; i<=word.length-1(); i++); its written wrong but avu  kai 
        {
           c[i] =  word.charAt(i);
        }
            
        //to iterate  backward
        for(int i=c.length - 1 ; i>=0 ; i--)
        {
            System.out.println(c[i]);
        }
        
        
    }
    
}
