/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
interface sports{
    int getNumberofGoals();
    void dispTeam();
    
}

class Hockey implements sports{
    public int getNumberofGoals(){
        return 3;  
    }
    public void dispTeam(){
        System.out.println("Team Hockey");
    }
}
class Football implements sports{
    public int getNumberofGoals(){
        return 6;
    }
    public void dispTeam(){
        System.out.println("Team Football");
    }
}
public class TestSports {
    public static void main(String[] args) {
        
    Football f = new Football();
    f.dispTeam();
        System.out.println(f.getNumberofGoals());
    Hockey h = new Hockey();
    h.dispTeam();
        System.out.println(h.getNumberofGoals());
    }
}
