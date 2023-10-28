package logic;

import javax.swing.*;

import main.Menu;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ScorePanel extends JFrame implements ActionListener{

    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = { "Scores"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    ScorePanel(){
        super("Scores");
        setSize(260,490);
        setLocation(200,200);
        setLayout(null);
        
        b1 = new JButton("back to menu");
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.darkGray);
        b1.setBounds(18, 360, 200 ,50);
        add(b1);
        
        b1.addActionListener(this);
        
        
        // try{
        //   //  Connection c1  = new Connection();
        //     String s1 = "select * from teacher";
        //     //ResultSet rs  = c1.statement.executeQuery(s1);
        //     while(rs.next()){
        //         y[i][j++]=rs.getString("name");
        //         y[i][j++]=rs.getString("course");
        //         y[i][j++]=rs.getString("dept");
        //         y[i][j++]=rs.getString("emp_id");
        //         i++;
        //         j=0;
        //     }
            //read from the file and add to new row
            String path = "scors.txt";
try {
    FileReader fr = new FileReader(path);
    BufferedReader br = new BufferedReader(fr);
    String line = br.readLine();
    while(line != null) {
        System.out.println(line);
        line = br.readLine();
        y[i++][j]= line;
    }
    br.close();
} catch (Exception ex) {
}
            t1 = new JTable(y,x);
            
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        
    
        if(ae.getSource() == b1){
           new Menu();
           
        }
    }
    public static void main(String[] args) {
      new ScorePanel().setVisible(true);
      
    }
  
}