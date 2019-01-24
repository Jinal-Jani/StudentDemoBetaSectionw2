/*
 *  Jinal Jani
 *  Student ID: 991525516
 *  SYST10199 - software design and development
 */
package w01_java_basic;

/**
 *
 * @author hp
 */
public class W01_java_basic 
{

    /** to populate the array the array with a word and print 
     * it on console
     * array mate - datatype [] name = new datatype [size of array]
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //char []  array  = new char[7];
        char [] array = {'s','t','u','d','e','n','t'};
       
        array [0] = 's';
        array[1] = 't';
        array [2] = 'u';
        array [3] = 'd';
        array [4] = 'e';
        array [5] = 'n';
        array [6] = 't';
        
        for (int i = 0; i< array.length; i++)
        {
            System.out.print( array [i]);
        }
    }
    
    
}
