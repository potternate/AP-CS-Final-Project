import java.util.ArrayList;
public class Battle1 implements fightable
    Character ironman = new Character();//iron is my zeroarg character
    int[] ironManStats;//array for his stats
    
    int[] hulkStats;//array for hulks stats
    int ironManScore = 0;//keep score to determine winner
    int opponentScore = 0;
    String nameInp = "Hulk";
    
    //randomize stats, base 50, max 95
    int speedInp = 50 + (int)(Math.random()*45);
    int strengthInp = 50 + (int)(Math.random()*45);
    int groundAttackInp = 50 + (int)(Math.random()*45);
    int airAttackInp = 50 + (int)(Math.random()*45);
    int defenseInp = 50 + (int)(Math.random()*45);
    Character opponent1 = new Character (nameInp, speedInp, strengthInp, groundAttackInp, airAttackInp, defenseInp);
    int winCount1 = 0;
    public Battle1()//main method, sets stats into the array
    {
        ironManStats = new int[5];
        
        ironManStats[0] = ironman.getSpeed();
        ironManStats[1] = ironman.getStrength();
        ironManStats[2] = ironman.getGroundAttack();
        ironManStats[3] = ironman.getAirAttack();
        ironManStats[4] = ironman.getDefense();
        
        hulkStats = new int[5];
        
        hulkStats[0] = speedInp;
        hulkStats[1] = strengthInp;
        hulkStats[2] = groundAttackInp;
        hulkStats[3] = airAttackInp;
        hulkStats[4] = defenseInp;
    }
    
    public String toString()//if statements to keep score of fight, winner is the one with higher score
    {
        if (ironManStats[0] > hulkStats[0])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[1] > hulkStats[1])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[2] > hulkStats[2])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[3] > hulkStats[3])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[4] > hulkStats[4])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManScore> opponentScore)
        {
            winCount1 = 1;
        return "Hulk's" + " Fighting Stats" + "\n" + "Speed: " + hulkStats[0] + "\n" + "Strength: " + hulkStats[1] + "\n" + "Ground Attack: " + hulkStats[2] + "\n" + "Air Attack: " + hulkStats[3] + "\n" + "Defense: " + hulkStats[4] + "\n" + "Iron Man won the battle!";
        }

        else
        {
        return "Hulk's" + " Fighting Stats" + "\n" + "Speed: " + hulkStats[0] + "\n" + "Strength: " + hulkStats[1] + "\n" + "Ground Attack: " + hulkStats[2] + "\n" + "Air Attack: " + hulkStats[3] + "\n" + "Defense: " + hulkStats[4] + "\n" + "Iron Man lost the battle!";
        }
    }
    public int getScore()//Getter method for the win count
    {
        return winCount1;
    }
}
