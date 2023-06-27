import java.util.ArrayList;
public class Battle4 implements Fightable
{
    Character ironman = new Character();//zeroArg
    int[] ironManStats;//zero arg object stats array. only declaring array
    
    int[] lokiStats;//enemy stats array. only declaring array
    int ironManScore = 0;
    int opponentScore = 0;
    String nameInp = "Loki";
    //randomize stats in the Loki array
    int speedInp = 65 + (int)(Math.random()*30);
    int strengthInp = 65 + (int)(Math.random()*30);
    int groundAttackInp = 65 + (int)(Math.random()*30);
    int airAttackInp = 65 + (int)(Math.random()*30);
    int defenseInp = 65 + (int)(Math.random()*30);
    Character opponent1 = new Character (nameInp, speedInp, strengthInp, groundAttackInp, airAttackInp, defenseInp);//multi arg Character object
    int winCount4;//another winCount
    public Battle4()
    {
        ironManStats = new int[5];//initialized the array here
        
        ironManStats[0] = ironman.getSpeed();//uses getter method from Character class
        ironManStats[1] = ironman.getStrength();
        ironManStats[2] = ironman.getGroundAttack();
        ironManStats[3] = ironman.getAirAttack();
        ironManStats[4] = ironman.getDefense();
        
        lokiStats = new int[5];
        
        lokiStats[0] = speedInp;
        lokiStats[1] = strengthInp;
        lokiStats[2] = groundAttackInp;
        lokiStats[3] = airAttackInp;
        lokiStats[4] = defenseInp;
        int ph = 0;//variables for the max for loop
        int ph2 = 0;
        int max = 0;
        int min = 100;
        
        for (int i = 0; i<lokiStats.length; i++)//finds the max stat of Loki
        {
            if (lokiStats[i]>max)
            {
                max = lokiStats[i];
                ph=i;
            }    
        }
        
    }
    
    public String toString()//returns the winner of the battle by comparing stats in the array slots
    {
        if (ironManStats[0] > lokiStats[0])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[1] > lokiStats[1])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[2] > lokiStats[2])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[3] > lokiStats[3])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManStats[4] > lokiStats[4])
        {
            ironManScore += 1;
        }
        else
        {
            opponentScore += 1;
        }
        if (ironManScore> opponentScore)
        {
            winCount4 = 1;
        return "Loki's" + " Fighting Stats" + "\n" + "Speed: " + lokiStats[0] + "\n" + "Strength: " + lokiStats[1] + "\n" + "Ground Attack: " + lokiStats[2] + "\n" + "Air Attack: " + lokiStats[3] + "\n" + "Defense: " + lokiStats[4] + "\n" + "\n" + "Iron Man won the battle!";
        }
        else
        {
        return "Loki's" + " Fighting Stats" + "\n" + "Speed: " + lokiStats[0] + "\n" + "Strength: " + lokiStats[1] + "\n" + "Ground Attack: " + lokiStats[2] + "\n" + "Air Attack: " + lokiStats[3] + "\n" + "Defense: " + lokiStats[4] + "\n" + "\n" + "Iron Man lost the battle!";
        }
    }
    public int getScore()//getter method for returning the win count
    {
        return winCount4;//if iron man wins, this is 1. If he loses, it is 0. win count only for this round. 
    }
    
}
