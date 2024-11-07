/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays_2d;

import javax.swing.JOptionPane;

/**
 *
 * @author YUVEEKA.B
 */
public class Arrays_2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //This is a 2D array 
        // 3 rows and 3 columns
        
      /*  int[ ][ ] numbers = {  {1, 2, 3},   {4, 5, 6}, {7, 8, 9}  };
        
        // Access and print elements
        for (int i = 0; i < numbers.length; i++) { // prints out the rows
            
            for (int j = 0; j < numbers[i].length; j++) { //prints out the columns
                
                System.out.print(numbers[i][j]+" "+" ");
            }
            System.out.println("");//move to the next row
        }
        */
      
      
         // Creating a 2D array with 3 rows and 4 columns
         
         int [ ][ ] numbers = new int [3][4]; //spcify the size of the 2d array 
         
         //initialise the array values 
         
         numbers[0][0 ]=55;
         numbers[0][1]=33;
         numbers[0][2]=13;
         numbers[0][3]=14;
         
         
          numbers[1][0]=16;
          numbers[1][1]=17;
          numbers[1][2]=18;
          numbers[1][2]=44;
          
          
          numbers[2][0]=66;
          numbers[2][1]=67;
          numbers[2][2]=68;
          numbers[2][3]=69;
        //access and print all elements using the for loop
          for (int i = 0; i < numbers.length; i++) { // prints out the rows
            
            for (int j = 0; j < numbers[i].length; j++) { //prints out the columns
                
                System.out.print(numbers[i][j]+" "+" ");
            }
            System.out.println("");//move to the next row
            
          
           //System.out.println(numbers[1][2]); prints a specific number 
       //    JOptionPane.showMessageDialog(null, "This is a element at a specific index value" + numbers[1][2]);
             
          }
          
    }
}
    


     


    



