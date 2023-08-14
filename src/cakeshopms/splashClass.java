/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakeshopms;


public class splashClass {
    public static void main(String[] args)
    {
        splash sp = new splash();
        sp.setVisible(true);
        UserLogin h = new UserLogin();
        try {
            for(int i=0; i<=100; i++)
            {
                Thread.sleep(50);
                sp.lbl1.setText(Integer.toString(i));
                sp.Bar1.setValue(i);
                if(i==100)
                {
                    sp.setVisible(false);
                    h.setVisible(true);
                }
            }
        }catch(Exception e)
        {
            
        }
    }
}
