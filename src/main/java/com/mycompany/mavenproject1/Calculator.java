/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Calculator {
    //method of addition
            public double add(double num1, double num2 ){
                return num1 + num2;
            }
            
            //method of subtracton
             public double subtract (double num1, double num2 ){
                return num1 - num2;
            }
            
             //method of multipication
             public double multiply (double num1, double num2 ){
                return num1 * num2;
            }
             
            //method of division
              public double divide(double num1, double num2 ){
                if (num2!= 0){
                  return num1 /num2;
                  }else{
                    JOptionPane.showMessageDialog(null, "can not divide zero");
                    return 0;
                          }
              }
}
