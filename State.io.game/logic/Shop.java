package logic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Shop implements ActionListener {
  JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;
    
  public Shop() {
    f = new JFrame("Shop");
        f.setBackground(Color.green);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
       ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images.jpg"));
       Image i3 = img.getImage().getScaledInstance(900, 700,Image.SCALE_DEFAULT);
       ImageIcon icc3 = new ImageIcon(i3);
       id15.setIcon(icc3);

        id8 = new JLabel("Shop");
        id8.setBounds(20,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.YELLOW);
        id15.add(id8);
        f.add(id15);

        String branch[] = {"Score History","Buy 20 soldiers","More Power","Add Coundry"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,250,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        String m = (String)c2.getSelectedItem();
        
        if(m .equals("buy 20 soldiers")){
          f.setVisible(false);
        //  new ProfessorHomepage().setVisible(true);
        }else if(m.equalsIgnoreCase("Set Player Color")){
          f.setVisible(false);
        }else if(m.equalsIgnoreCase("Score History")){
          new ScorePanel().setVisible(true);;
          f.setVisible(false);
        }
  }
  public static void main(String[] args) {
    new Shop();
  }
  
}
