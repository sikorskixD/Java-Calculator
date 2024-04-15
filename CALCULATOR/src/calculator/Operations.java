/*

 */
package calculator;

import javax.swing.*;

public class Operations 
{// start class
    
    public static double CalcMod(double x,double y)
    {// start CalcMod
        double R;
        R= x % y;
        return R;
    }// end CalcMod
    
    public static void CalcSqr(double x)
    {// start CalcSqr
        double result;
        result = Math.sqrt(x);
        JOptionPane.showMessageDialog(null,"The square root of " + x + " is " + result);
    
    }// end CalcSqr
    
    public static void CalcSqr(double x, double y)
    {// start CalcSqr
        double result;
        result = Math.sqrt(x);
        JOptionPane.showMessageDialog(null,"The square root of " + x + " is " + result);
        
        result = Math.sqrt(y);
        JOptionPane.showMessageDialog(null,"The square root of " + y + " is " + result);
    
    }// end CalcSqr
    
    public static double CalcMult(double x,double y)
    {// start CalcMult
        double res;
        res = x * y;
        return res;
       
    }// end CalcMult
    
    public static void CalcDiv(double x,double y)
    {// start CalcDiv
        double re;
        re = x/y;
        JOptionPane.showMessageDialog(null,"The dividation of " + x + " and " + y + " is " + re);
    }// end CalcDiv
}// end class
