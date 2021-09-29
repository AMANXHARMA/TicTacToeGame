package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.UIManager.*;

class design implements ActionListener
{
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
     public static int count=0;
     boolean win=false;
     String str;
    void createFrame()
    {
        try
        {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    jf=new JFrame("TicTacToe");
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(3);
    jf.setLayout(new GridLayout(3,3));

    jb1=new JButton();
    jb2=new JButton();
    jb3=new JButton();
    jb4=new JButton();
    jb5=new JButton();
    jb6=new JButton();
    jb7=new JButton();
    jb8=new JButton();
    jb9=new JButton();

    jf.add(jb1);
    jb1.addActionListener(this);
    jf.add(jb2);
    jb2.addActionListener(this);
    jf.add(jb3);
    jb3.addActionListener(this);
    jf.add(jb4);
    jb4.addActionListener(this);
    jf.add(jb5);
    jb5.addActionListener(this);
    jf.add(jb6);
    jb6.addActionListener(this );
    jf.add(jb7);
    jb7.addActionListener(this);
    jf.add(jb8);
    jb8.addActionListener(this);
    jf.add(jb9);
    jb9.addActionListener(this);



    jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        if (count % 2 == 0) {
            str = "X";
        }
        else
        {
            str = "O";
        }
        if (e.getSource() == jb1) {
            jb1.setText(str);
            jb1.setFont(new Font("Arial",1,50));
            jb1.setEnabled(false);
        }
        if (e.getSource() == jb2) {
            jb2.setText(str);
            jb2.setFont(new Font("Arial",1,50));
            jb2.setEnabled(false);
        }
        if (e.getSource() == jb3) {
            jb3.setText(str);
            jb3.setFont(new Font("Arial",1,50));
            jb3.setEnabled(false);
        }
        if (e.getSource() == jb4) {
            jb4.setText(str);
            jb4.setFont(new Font("Arial",1,50));
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5)
        {
            jb5.setText(str);
            jb5.setFont(new Font("Arial",1,50));
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6)
        {
            jb6.setText(str);
            jb6.setFont(new Font("Arial",1,50));
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7)
        {
            jb7.setText(str);
            jb7.setFont(new Font("Arial",1,50));
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8)
        {
            jb8.setText(str);
            jb8.setFont(new Font("Arial",1,50));
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9)
        {
            jb9.setText(str);
            jb9.setFont(new Font("Arial",1,50));
            jb9.setEnabled(false);
        }
        win();
        whoWins();
    }
    void win()
    {
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!="")
        {
            win=true;
        }
        if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb4.getText()!="")
        {
            win=true;
        }
        if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb7.getText()!="")
        {
            win=true;
        }
        if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText()!="")
        {
            win=true;
        }
        if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText()!="")
        {
            win=true;
        }
        if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText()!="")
        {
            win=true;
        }
        if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb1.getText()!="")
        {
            win=true;
        }
        if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb3.getText()!="")
        {
            win=true;
        }
        else
        {
            win=false;
        }
    }
    void whoWins()
    {
        if(win)
        {
            JOptionPane.showMessageDialog(jf, str + "wins");
          restart();
        }
        else if(win==false && count==9)
        {
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restart();
        }

    }
    void restart()
    {
        int i=JOptionPane.showConfirmDialog(jf,"Do you want to restart the game");
        if(i==0)
        {
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");
            count=0;
            jb1.setEnabled(true);
            jb2.setEnabled(true);
            jb3.setEnabled(true);
            jb4.setEnabled(true);
            jb5.setEnabled(true);
            jb6.setEnabled(true);
            jb7.setEnabled(true);
            jb8.setEnabled(true);
            jb9.setEnabled(true);
            str="";

        }
        if(i==1)
        {
            System.exit(0);
        }
        else
        {
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        design d=new design();
        d.createFrame();


    }
}
