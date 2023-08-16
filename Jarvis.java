public class Jarvis
{
    private double rocketFuel = 100.0;//instance variables
    private double batteryLife = 100.0;
    private double armorCondition = 100.0;
    int level = 1;  //starts the game at level 1
    public Jarvis (int level)
    {
        if (level == 1)
        {
            rocketFuel = 100.0;
            batteryLife = 100.0;
            armorCondition = 100.0;
        }
        else if (level == 2)
        {
            rocketFuel = 72.4;//decline in resources in predetermined in this code
            batteryLife = 68.4;
            armorCondition = 74.1;
        }
        else if (level == 3)
        {
            rocketFuel = 48.8;//gradual decline
            batteryLife = 51.7;
            armorCondition = 50.2;
        }
        else if (level == 4)
        {
            rocketFuel = 22.4;//getting lower
            batteryLife = 27.6;
            armorCondition = 25.3;
        }
        else if (level == 5)
        {
            rocketFuel = 0.0;//rocket Fuel is at 0.0, I send a custom message to the player. 
            batteryLife = 2.0;
            armorCondition = 0.7;
        }
    }
    public String toString()//returns the levels of the three resources (100 scale) 
    {
        return "Your resource levels are: " + "\n" + "Rocket fuel: " + rocketFuel + "\n" + "Battery life: " + batteryLife + "\n" + "Armor Condition: " + armorCondition;
    }
}
