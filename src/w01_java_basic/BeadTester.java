/*
 *  Jinal Jani
 *  Student ID: 991525516
 *  SYST10199 - Web Programming
 */
package w01_java_basic;

/**
 *
 * @author hp
 */
public class BeadTester 
{
    public static void main(String[] args)
    {
        bead b1 = new bead("yellow",'j');
        
        //araay of obj --> claassName [] name  =  new className [ array sze]
        bead[] b  =  new bead[5];
                
        b [0] = b1; //assiging for the first index
        b [1] = new bead ("pink",'i');
        b [2] = new bead ("red",'n');
        b [3] = new bead ("blue",'a');
        b [4] = new bead ("black",'l');
                
        System.out.println(b1.getColor()); // to print color -- used get constructor
        System.out.println(b[1].getColor()); 
        System.out.println(b[2].getColor()); 
        System.out.println(b[3].getColor()); 
        System.out.println(b[4].getColor()); 
    }
}
