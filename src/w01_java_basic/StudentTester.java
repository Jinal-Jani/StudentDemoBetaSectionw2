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
public class StudentTester 
{
    public static void main (String [] args)
    {
        Student s1 = new Student(); //() ahiya error ania ave coz overloaded construtor nathi idk how samjooooo
        s1.setName("Jinal");
        
        Student [] s = new Student [5];
        
        s[0] = s1;
        
        Student s2 = new Student(); 
        s2.setName("jani");
        
        s[1] = s2;
        
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        
        
        
        
    }
    
}
