
package minigame;

/**
 *
 * @author S199847600
 */

//the superclass
public class People {
    public String Name, Job, Hint;
    
    //this method prints out the hint to the player
    public void Talk(){
    System.out.println("Occupation: " + this.Job);
    System.out.println(this.Hint);
    }
    
    //see if person is right
    public boolean PersonVerifier(String guess){ // 
        return guess.equalsIgnoreCase(this.Name);
        
    }
        
        

}
