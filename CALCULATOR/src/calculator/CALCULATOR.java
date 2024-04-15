/*
Adrian Sikorski
This project will allow a user to input two values
and perform mathematical operations on those values
*/
package calculator;

import javax.swing.*;

public class CALCULATOR 
{//start class

    
    
    public static void main(String[] args) 
    {//start main method
       Operations op = new Operations();
        
       double x,y;
       double result;
       int choice;
       String s1;
       
       String menu;
       
       
       menu = "1. Multiply\n2. Divide\n3. Mod\n4. Square root";
       
       s1 = JOptionPane.showInputDialog(menu);
       choice = Integer.parseInt(s1);
       
       s1 = JOptionPane.showInputDialog("Enter first number");
       x=Double.parseDouble(s1);
       
       s1 = JOptionPane.showInputDialog("Enter second number");
       y=Double.parseDouble(s1);
  
       //result = op.CalcMod(x,y);
       //JOptionPane.showMessageDialog(null, "the result of the mod is "+result);
       //op.CalcDiv(x,y);
      // op.CalcSqr(x,y); // call the CalcSqr method
      
      if ((choice>=1)&&(choice<=4))
          JOptionPane.showMessageDialog(null, "VALID CHOICE");
      else
          JOptionPane.showMessageDialog(null, "INVALID CHOICE");
      
       if (choice == 1)
       {
           result = op.CalcMult(x,y);
           JOptionPane.showMessageDialog(null, "the result of multiplocation is "+ result);
       }
       else 
       {
           JOptionPane.showMessageDialog(null, "you didn't choose multiply");
       }
       
       
       if (choice == 2)
       {
           result = op.CalcDiv(x,y);
           JOptionPane.showMessageDialog(null, "the result of division is "+ result);
       }
       
       if (choice == 3)
       {
           result = op.CalcMod(x,y);
           JOptionPane.showMessageDialog(null, "the result of mod is "+ result);
       }
       
       if (choice == 4)
       {
           result = op.CalcSqr(x,y);
           JOptionPane.showMessageDialog(null, "the result of square root is "+ result);
       }
       
       
       
       //double res = op.CalcMult(x,y);
       //JOptionPane.showMessageDialog(null,"The multiplication of " + x + " and " + y + " is " + res);
       
       
       
    }//end main method
    
}//end class
