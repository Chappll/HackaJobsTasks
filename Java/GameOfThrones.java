public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

   
    public static String run(String first_strike_army_name, int no_of_dragons, int no_of_white_lords) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/
        int skAttack = 10000 + (no_of_dragons*600);
        int skDef = 10000 + (no_of_dragons * 600);
        int wwAttack = 10000 + (no_of_white_lords*50);
        int wwDef = 30000 + (no_of_white_lords*100);
        int turnCount = 0;
        int turnAttack = 0;

        if (first_strike_army_name == "Seven Kingdom Army") {           
            while (skDef > 0 && wwDef > 0 || turnCount >10) {
                turnCount ++;
                turnAttack = skAttack;
                while (turnAttack > 0) {
                    if (no_of_white_lords > 0 && turnAttack > 100) {
                        turnAttack = turnAttack - 100;
                        no_of_white_lords--;
                        wwAttack = wwAttack - 50;
                        wwDef = wwDef - 100;
                    }
                    else if(turnAttack > 3)
                    {
                        turnAttack = turnAttack - 3;
                        wwAttack --;
                        wwDef = wwDef - 3;
                    }
                    else{
                        turnAttack = 0;
                    } 
                }
                if (wwDef <= 0 || wwAttack <= 0) {
                    break;
                }
                turnAttack = wwAttack;
                turnCount++;
                while (turnAttack > 0) {
                    if (no_of_dragons > 0 && turnAttack > 600) {
                        turnAttack = turnAttack - 600;
                        no_of_dragons--;
                        skAttack = skAttack - 600;
                        skDef = skDef - 600;
                    }
                    else if(turnAttack > 2)
                    {
                        turnAttack = turnAttack - 2;
                        skAttack = skAttack - 2;
                        skDef = skDef - 2;
                    }
                    else{
                        turnAttack = 0;
                    } 
                }
                
            }
        }
        else{
            while (skDef > 0 && wwDef > 0) {
                turnCount ++;
                turnAttack = wwAttack;
                while (turnAttack > 0) {
                    if (no_of_dragons > 0 && turnAttack > 600) {
                        turnAttack = turnAttack - 600;
                        no_of_dragons--;
                        skAttack = skAttack - 600;
                        skDef = skDef - 600;
                    }
                    else if(turnAttack > 2)
                    {
                        turnAttack = turnAttack - 2;
                        skAttack = skAttack - 2;
                        skDef = skDef - 2;
                    }
                    else{
                        turnAttack = 0;
                    } 
                }
                if (skDef <= 0 || skAttack <= 0) {
                    break;
                }
                turnAttack = skAttack;
                turnCount++;
                while (turnAttack > 0) {
                    if (no_of_white_lords > 0 && turnAttack > 100) {
                        turnAttack = turnAttack - 100;
                        no_of_white_lords--;
                        wwAttack = wwAttack - 50;
                        wwDef = wwDef - 100;
                    }
                    else if(turnAttack > 3)
                    {
                        turnAttack = turnAttack - 3;
                        wwAttack --;
                        wwDef = wwDef - 3;
                    }
                    else{
                        turnAttack = 0;
                    } 
                }
                
            }
        }

        
		
        String result = "";
        if (skDef < wwDef) {
            result = "White Walker Army|" + turnCount;
        } else {
            result = "Seven Kingdom Army|" + turnCount;
        }
		return result;
	}
}
