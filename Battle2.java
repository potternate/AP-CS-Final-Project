import java.util.ArrayList;
public class Battle2 implements Fightable
{
    Character ironman = new Character();//zero arg object
    int[] ironManStats;//array for zero arg object stats
    
    int[] thorStats;//enemy stats in array
    int ironManScore = 0;
    int opponentScore = 0;
    String nameInp = "Thor";
    int speedInp = 55 + (int)(Math.random()*40);//randomized stats (55-95)
    int strengthInp = 55 + (int)(Math.random()*40);
    int groundAttackInp = 55 + (int)(Math.random()*40);
    int airAttackInp = 55 + (int)(Math.random()*40);
    int defenseInp = 55 + (int)(Math.random()*40);
    Character opponent1 = new Character (nameInp, speedInp, strengthInp, groundAttackInp, airAttackInp, defenseInp);
    int winCount2;//initialize winCount2
    public Battle2()//main method, fills arrays
    {
        ironManStats = new int[5];
        
        ironManStats[0] = ironman.getSpeed();
        ironManStats[1] = ironman.getStrength();
        ironManStats[2] = ironman.getGroundAttack();
        ironManStats[3] = ironman.getAirAttack();
        ironManStats[4] = ironman.getDefense();
        
        thorStats = new int[5];
        
        thorStats[0] = speedInp;
        thorStats[1] = strengthInp;
        thorStats[2] = groundAttackInp;
        thorStats[3] = airAttackInp;
        thorStats[4] = defenseInp;
    }
    
    public String toString()//keeps score by comparing array values. 
    {
        if (ironManStats[0] > thorStats[0])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[1] > thorStats[1])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[2] > thorStats[2])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[3] > thorStats[3])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[4] > thorStats[4])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManScore> opponentScore)//if iron man wins, the first option is selected. A loss results in the "else" statement. 
        {
            winCount2=1;
        return "Thor's" + " Fighting Stats" + "\n" + "Speed: " + thorStats[0] + "\n" + "Strength: " + thorStats[1] + "\n" + "Ground Attack: " + thorStats[2] + "\n" + "Air Attack: " + thorStats[3] + "\n" + "Defense: " + thorStats[4] + "\n\n" + "Iron Man won the battle!";
        }
        else
        {
        return "Thor's" + " Fighting Stats" + "\n" + "Speed: " + thorStats[0] + "\n" + "Strength: " + thorStats[1] + "\n" + "Ground Attack: " + thorStats[2] + "\n" + "Air Attack: " + thorStats[3] + "\n" + "Defense: " + thorStats[4] + "\n\n" + "Iron Man lost the battle!";
        }
    }
    public int getScore()//getter method for adding score in Driver
    {
        return winCount2;
    }
}
