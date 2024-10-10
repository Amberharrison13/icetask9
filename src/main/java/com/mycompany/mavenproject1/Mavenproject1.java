/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */

public class Mavenproject1 {

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        double num1=Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
        double num2=Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
        
       int choice;
       do{
           String menu= "Choose an operation:\n"
                        +"1. Addition\n"
                        +"2. Subtraction\n"
                        +"3. Multiplication\n"
                        +"4. Division\n"
                        +"0. Exit";
          choice= Integer.parseInt(JOptionPane.showInputDialog(menu));
            
          switch(choice){
              case 1:
          JOptionPane.showInputDialog(null,"Result:"+ calculator.add(num1, num2));
          break;
          
              case 2:
            JOptionPane.showInputDialog(null,"Result:"+ calculator.subtract(num1, num2));
            break;
            
              case 3:
            JOptionPane.showInputDialog(null,"Result:"+ calculator.multiply(num1, num2));
            break;
            
              case 4:
            JOptionPane.showInputDialog(null,"Result:"+ calculator.divide(num1, num2));
            
           
       }
          
       } while(choice !=0);

    }
}
