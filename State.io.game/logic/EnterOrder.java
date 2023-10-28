package logic;

import javax.swing.*;


import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class EnterOrder extends JFrame implements ActionListener{
    ArrayList<String> numbers = new ArrayList<>();
    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<String> numbers) {
        this.numbers = numbers;
    }

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1;

    EnterOrder(){

        setSize(1100,1200);
        setLocationRelativeTo(null);
        setLayout(null);

        l1 = new JLabel("Enter Position Numbers");
        l1.setFont(new Font("", Font.BOLD, 40));
        l1.setBounds(50,0,500,100);
        add(l1);

        l2 = new JLabel("1) player"
        +" 2,3)Adequate"
        +" 4,5)Fighter");
        l2.setFont(new Font("serif", Font.BOLD, 40));
        l2.setBounds(50,45,2000,100);
        add(l2);

        l3 = new JLabel("6,7)Resistant"
          +" 8,9,10)Shooter");
        l3.setFont(new Font("serif", Font.BOLD, 40));
        l3.setBounds(50,110,2000,60);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(50,200,200,20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(50,230,200,20);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(50,260,200,20);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        add(t7);

        t8 = new JTextField();
        t8.setBounds(50,290,200,20);
        add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        add(t9);

        t10 = new JTextField();
        t10.setBounds(50,320,200,20);
        add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        add(t11);

        b1 = new JButton("Submit");
        b1.setBounds(50,360,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                numbers.add(t2.getText());
                numbers.add(t3.getText());
                numbers.add(t4.getText());
                numbers.add(t5.getText());
                numbers.add(t6.getText());
                numbers.add(t7.getText());
                numbers.add(t8.getText());
                numbers.add(t9.getText());
                numbers.add(t10.getText());
                numbers.add(t11.getText());
            
              
                
                JOptionPane.showMessageDialog(null,"Enjoy the game with your desired order");
                new GamePanel(numbers);
              //   this.setVisible(false);

            }
        }catch(Exception e){}
        new GamePanel(numbers);
        System.out.println(numbers);
    }

    public static void main(String[] args){
        new EnterOrder().setVisible(true);
    }
}

