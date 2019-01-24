/*
 *  Jinal Jani
 *  Student ID: 991525516
 *  SYST10199 - Web Programming
 */
package w01_java_basic;

/**MODEL CLASS FOR BEAD 
 * AND BEAD HAS COLOR AND SINGLE LETTER ON IT
 *
 * @author hp
 */
public class bead 
{
   private String color;
   private char letter;
   
   public bead() //default constructor if na lakhiye toh b jate ave 
   {
       
   }

    /**
     * @return the color
     */
    public String getColor() 
    {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String c) 
    {
        color = c; //this keyword specifies class variable 
    }

    /**
     * @return the letter
     */
    public char getLetter() 
    {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char l) 
    {
       letter = l;
    }
    
    public bead(String c ,char l)
    {
        color = c;
        letter = l;
    }
    
            
   
   
    
    
}
