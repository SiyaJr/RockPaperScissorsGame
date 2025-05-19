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
public interface GameInterface {
    
    public char generateSign();
    public String determineOutcome(char playerSign,char computerSign);
}
