import java.util.ArrayList;
public class Battle3 implements Fightable
{
    Character ironman = new Character();//zero arg character
    int[] ironManStats;
    
    int[] capStats;
    int ironManScore = 0;
    int opponentScore = 0;
    String nameInp = "Captain America";
    //randomize stats (60-95)
    int speedInp = 60 + (int)(Math.random()*35);
    int strengthInp = 60 + (int)(Math.random()*35);
    int groundAttackInp = 60 + (int)(Math.random()*35);
    int airAttackInp = 60 + (int)(Math.random()*35);
    int defenseInp = 60 + (int)(Math.random()*35);
    Character opponent1 = new Character (nameInp, speedInp, strengthInp, groundAttackInp, airAttackInp, defenseInp);//multiarg character
    int winCount3;//intialize winCount again. Had to do this per class because it didnt work because the object stats were only randomized once. not in every class. 
    public Battle3()//fills arrays with stats
    {
        ironManStats = new int[5];
        
        ironManStats[0] = ironman.getSpeed();
        ironManStats[1] = ironman.getStrength();
        ironManStats[2] = ironman.getGroundAttack();
        ironManStats[3] = ironman.getAirAttack();
        ironManStats[4] = ironman.getDefense();
        
        capStats = new int[5];
        
        capStats[0] = speedInp;
        capStats[1] = strengthInp;
        capStats[2] = groundAttackInp;
        capStats[3] = airAttackInp;
        capStats[4] = defenseInp;
    }
    
    public String toString()//score keeper. compares array slots and add points based off whose stat is higher
    {
        if (ironManStats[0] > capStats[0])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[1] > capStats[1])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[2] > capStats[2])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[3] > capStats[3])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[4] > capStats[4])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManScore> opponentScore)//highest score wins and results in that line being printed.
        {
            winCount3 = 1;
        return "Captain America's" + " Fighting Stats" + "\n" + "Speed: " + capStats[0] + "\n" + "Strength: " + capStats[1] + "\n" + "Ground Attack: " + capStats[2] + "\n" + "Air Attack: " + capStats[3] + "\n" + "Defense: " + capStats[4] + "\n" + "\n" + "Iron Man won the battle!";
        }
        else
        {
        return "Captain America's" + " Fighting Stats" + "\n" + "Speed: " + capStats[0] + "\n" + "Strength: " + capStats[1] + "\n" + "Ground Attack: " + capStats[2] + "\n" + "Air Attack: " + capStats[3] + "\n" + "Defense: " + capStats[4] + "\n" + "\n" + "Iron Man lost the battle!";
        }
    }
    public int getScore()//getter method
    {
        return winCount3;//returns winCount, used in Driver
    }
}
