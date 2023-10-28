package logic;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GamePanel extends JFrame implements ActionListener{
  JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JTextField t2;
    String y[][] = new String[20][13];
    int i=0, j=0;
    GamePanel(ArrayList<String> numbers){
        super("Game");
        setSize(660,650);
        setLocationRelativeTo(null);;
        setLayout(null);
        
        b3 = new JButton(numbers.get(0));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(100, 90, 150 ,30);
        add(b3);
        
        b1 = new JButton(numbers.get(1));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(300, 90, 150 ,30);
        add(b1);
        
        b2 = new JButton(numbers.get(2));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(100, 140, 150 ,30);
        add(b2);
        
        
        b4 = new JButton(numbers.get(3));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(300, 140, 150 ,30);
        add(b4);
        
        b9 = new JButton(numbers.get(4));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(100, 190, 150 ,30);
        add(b9);
        
        b10 = new JButton(numbers.get(5));
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(300, 190, 150 ,30);
        add(b10);

        b8 = new JButton(numbers.get(6));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(100, 240, 150 ,30);
        add(b8);

        b7 = new JButton(numbers.get(7));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(300, 240, 150 ,30);
        add(b7);

        b6 = new JButton(numbers.get(8));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(100, 290, 150 ,30);
        add(b6);

        b5 = new JButton(numbers.get(9));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(300, 290, 150 ,30);
        add(b5);

        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        System.out.println("1");
        //   switch (t2.getText()) {
            //     case "1":
                    
            //         break;
            //     case "2":
                    
            //         break;
            //     case "3":
                        
            //         break;
            //     case "4":
                         
            //         break;
            //     case "5":
                         
            //         break;
            //     case "6":
                             
            //         break;
            //     case "7":
                             
            //         break;
            //     case "8":
                              
            //         break;
            //     case "9":
                              
            //         break;
            //     case "10":
                                  
            //           break;
            //     default:
            //         break;
             // }
    
        if(ae.getSource() == b1){
          
                this.setVisible(false);
                //new StudentDetails().setVisible(true);
    
        }else if(ae.getSource() == b2){
            //new AddStudent().f.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            //new UpdateStudent().setVisible(true);
            this.setVisible(false);
        }}
        public static void main(String[] args) {
          ArrayList<String> t = new ArrayList<>(10);
          t.add("1");
          t.add("8");
          t.add("9");
          t.add("6");
          t.add("7");
          t.add("4");
          t.add("5");
          t.add("3");
          t.add("2");
          t.add("10");
          new GamePanel(t).setVisible(true);
        }
}
