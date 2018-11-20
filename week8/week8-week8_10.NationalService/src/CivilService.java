/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertdavis
 */
public class CivilService implements NationalService {
    private int daysLeft = 362;
    
    public int getDaysLeft() {
        return daysLeft;
    }
    
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }

}

/*
public class CivilService implements NationalService {
    private int daysLeft = 362;
 
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }
 
    @Override
    public void work() {
        if (daysLeft == 0) {
            return;
        }
        daysLeft--;
    }
}
*/