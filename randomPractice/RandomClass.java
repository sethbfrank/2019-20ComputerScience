public class RandomClass
{
    private int startingCoins; // starting number of coins

    private int maxRounds; // maximum number of rounds played
    
     
    
    public RandomClass(int s, int r)
    
    {
    
    startingCoins = s;
    
    maxRounds = r;
    
    }
    
     
    
    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
    
    */
    
    public int getPlayer1Move(int round)
    
    {
    
        int result;
        if(round%3 == 0)
           result = 3;
        else if(round%2 == 0)
                result = 2;
             else
                result = 1;
        return result;
    
    }
    
     
    
    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).
    
    */
    
    public int getPlayer2Move(int round)
    
    {
    
        
           int result;
           if(round%3 == 0)
              result = 3;
           else if(round%2 == 0)
                   result = 2;
                else
                   result = 1;
           return result;
        
        
    
    }
   
   
   
   
   
    public void playGame()
   {
    int player1 = startingCoins;
    int player2 = startingCoins;
    int round = 1;
    while(player1 >= 3 && player2 >=3 && round <= maxRounds) {
       int p1Move = this.getPlayer1Move(round);
       int p2Move = this.getPlayer2Move(round);
       player1 -= p1Move;
       player2 -= p2Move;
       if(p1Move == p2Move)
          player2++;
       else if(Math.abs(p1Move-p2Move) == 1)
               player2++;
            else
               player1 += 2;
       round++;
    }
    if(player1 > player2)
       System.out.println("player 1 wins");
    else if(player2 > player1)
            System.out.println("player 2 wins");
         else
            System.out.println("tie game");
}
    
    
    
    public static void main(String[] args)
    {
       RandomClass game = new RandomClass(10, 5);
       game.playGame();
    }
}