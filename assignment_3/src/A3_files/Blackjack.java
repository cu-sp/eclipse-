package A3_files;
import java.util.Scanner;
import java.lang.math;

/**
 * Q1: A variation of the game of Blackjack (20 pts).
 * 
 * Complete this program according to the instructions below.

## Instructions
In this project, you will play a simplified version of the game of Blackjack against a virtual dealer.

In our simplified version of Blackjack, the play unfolds in order as follows:

1)  Two cards are dealt and displayed to the user.

2)  Two cards are dealt to the dealer, but these are secret and not displayed to the user.

3)  The user is prompted whether they would like an additional card (a "hit"). 
    - This question is repeated and the user may accept as many additional cards as they would like, 
      until they respond with the words "stand", "stop", or "pass". 
    - If the value of the cards exceeds 21 at any point during this process of accepting cards, 
      the user has "busted" and lost, and the game ends.

4)  Assuming the user has not busted, once the user stops accepting new cards, 
    the robotic dealer decides whether to accept as many additional cards as it wants. 

    You can have the robot dealer do this at random if you like, or you can develop an artificial intelligence algorithm of your choosing. 
    If the robot dealer's cards exceed 21 points during this process, the dealer has busted and lost, and the user wins.

5)  Assuming neither the user or dealer busted, then if the user's cards are higher in total value than the dealer's cards, the user wins. 
    Otherwise, the dealer wins. If there is a tie, indicate so.

6) Regardless of how the game ends, whether by a bust or by a win, the program MUST show the user what cards 
   they had and what cards the dealer had at the end of the game and announce the result of the game 
   (either there is a winner, a tie, or one of the players has bust.)


## Activity diagram
Refer to the activity diagram inside the A3_files package


## Additional notes:
-   Do not worry about drawing the same card twice. Draw cards at random.
-   All "cards" are integer values from 2 through 10.
-   These rules are different from how Blackjack is played in casinos. Follow *our* version's rules.


## Sample output
The following are sample outputs from running the program with various outcomes. User responses are indicated 
on the same line as the program output for ease-of-reading only. In all cases, user input will actually appear on a separate line.

Your program's output should match closely these patterns.

#### Sample output: user stands, dealer stands
Welcome to Blackjack!
Your cards are: 2 and 4
Would you like to hit or stand? stand
The dealer stands.
The dealer's cards are: 8, 7
Dealer wins!


#### Sample output: dealer wins:
Welcome to Blackjack!
Your cards are: 3 and 7
Would you like to hit or stand? hit
Your cards are: 3, 7, and 4
Would you like to hit or stand? hit
Your cards are: 3, 7, 4, and 2
Would you like to hit or stand? stand
The dealer hits.
The dealer hits.
The dealer hits.
Your cards are: 3, 7, 4, and 2
The dealer's cards are: 8, 3, 4, 3, 3
Dealer wins!


#### Sample output: user wins:
Welcome to Blackjack!
Your cards are: 8 and 2
Would you like to hit or stand? hit
Your cards are: 8, 2, and 8
Would you like to hit or stand? stand
The dealer hits.
The dealer stands.
Your cards are: 8, 2, and 8
The dealer's cards are: 3, 3, and 7
You win!


#### Sample output: tie:
Welcome to Blackjack!
Your cards are: 5 and 6
Would you like to hit or stand? hit
Your cards are: 5, 6, and 3
Would you like to hit or stand? stand
The dealer hits.
The dealer hits.
The dealer stands.
Your cards are: 5, 6, and 3
The dealer's cards are: 2, 6, 2, and 4
Tie!


#### Sample output: dealer busts:
Welcome to Blackjack!
Your cards are: 5 and 6
Would you like to hit or stand? hit
Your cards are: 5, 6, and 3
Would you like to hit or stand? stand
The dealer hits.
The dealer stands.
Your cards are: 5, 6, and 3
The dealer's cards are: 8, 8, and 10
The dealer has bust!
You win!


#### Sample output: user busts:
Welcome to Blackjack!
Your cards are: 5 and 6
Would you like to hit or stand? hit
Your cards are: 5, 6, and 3
Would you like to hit or stand? hit
Your cards are: 5, 6, 3, and 10
You have bust!
The dealer's cards are: 5 and 7
Dealer wins!

 * 
 */


public class Blackjack {
  public static void main(String[] args) throws Exception {
	  System.out.println("Welcome to Blackjack!");
	  System.out.println(draw());

  }
  public static int draw() {
	  int card = (int) Math.random();
	  return card;
	  
  }

}
