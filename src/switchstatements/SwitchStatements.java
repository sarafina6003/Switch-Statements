/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatements;

/**
 *
 * @author nyawira
 */
public class SwitchStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char grade = 'B';
        
        switch(grade){
            case 'A':
            System.out.println("You got an A.");
            break;
            
            case 'B':
            System.out.println("You got a B.");
            break;
            
            case 'C':
            System.out.println("You got a C.");
            break;
            
            default:
                System.out.println("You got an F.");
        }
    }    
}
