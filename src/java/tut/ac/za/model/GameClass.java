/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tut.ac.za.model;

/**
 *
 * @author Zanele
 */
public class GameClass implements GameInterface{

    @Override
    public char generateSign() {
 
        char[] signs = {'R','P','S'};
        int index = (int)Math.floor(Math.random()*3);
        
        return signs[index];
    }

    @Override
    public String determineOutcome(char playerSign, char computerSign) {

       String outcome ="";
       
                     if(playerSign =='P' && computerSign == 'R')
                         outcome = "Paper wraps rock. Player wins";
                     else if(playerSign =='R' && computerSign == 'S')
                         outcome = "Rock crushes scissor. Players wins";
                     else if(playerSign =='S' && computerSign == 'P')
                         outcome = "Scissors cuts paper. Player wins";
                     else if(playerSign =='R' && computerSign == 'R')
                          outcome = "Paper wraps rock. Computer wins";
                     else if(playerSign =='S' && computerSign == 'R')
                           outcome = "Rock crushes scissor. Computer wins";
                     else if(playerSign =='P' && computerSign == 'S')
                            outcome = "Scissors cuts paper. Computer wins";
                     else
                         outcome ="Tie";
                     
                     
       
       return outcome;
    }
    
    
    
}
