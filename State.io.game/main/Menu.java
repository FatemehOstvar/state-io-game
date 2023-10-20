//import com.sun.java.accessibility.util.SwingEventMonitor;
package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JButton startGameBtn,createGameBtn,joinGameBtn,settingBtn;
    Menu menuPanel;
    JLayeredPane layers;
    JPanel buttonPanel;
    public Menu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200,800));
        setPreferredSize(new Dimension(1200,800));

        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setTitle("menu");
        layers = getLayeredPane();
      ///  menuPanel = new MenuPanel();
        buttonPanel = new JPanel();
        buttonPanel.setBounds(0,0,1200,800);
        buttonPanel.setLayout(null);
        buttonPanel.setOpaque(false);
     //   menuPanel.setBounds(0,0,1200,800);
        initButtons();
        layers.add(buttonPanel);
      //  layers.add(menuPanel);
        setVisible(true);
    }

    private void initButtons() {
        startGameBtn = new JButton("start game");
        startGameBtn.setFocusable(false);
        startGameBtn.setBounds(430,200,300,40);
        startGameBtn.setBackground(Color.CYAN);
       // startGameBtn.setBorder(new RoundedBorder(10));
        buttonPanel.add(startGameBtn);

        createGameBtn = new JButton("create game");
        createGameBtn.setFocusable(false);
        createGameBtn.setBounds(430,300,300,40);
        createGameBtn.setBackground(Color.CYAN);
        //createGameBtn.setBorder(new RoundedBorder(10));
        buttonPanel.add(createGameBtn);


        joinGameBtn = new JButton("join game");
        joinGameBtn.setFocusable(false);
        joinGameBtn.setBounds(430,400,300,40);
        joinGameBtn.setBackground(Color.CYAN);
       // joinGameBtn.setBorder(new RoundedBorder(10));
        buttonPanel.add(joinGameBtn);


        settingBtn = new JButton("settings");
        settingBtn.setFocusable(false);
        settingBtn.setBounds(430,500,300,40);
        settingBtn.setBackground(Color.CYAN);
      //  settingBtn.setBorder(new RoundedBorder(10));
        buttonPanel.add(settingBtn);


        startGameBtn.addActionListener(this);
        createGameBtn.addActionListener(this);
        joinGameBtn.addActionListener(this);
        settingBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startGameBtn){
            SwingUtilities.invokeLater(() -> {

            });

            dispose();
        }
        else if(e.getSource() == createGameBtn){
           // Server server = new Server();
          //  server.start();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    dispose();
                }
            });

        }
        else if (e.getSource()== joinGameBtn){
            /**
             * if the game started start the gameLoop and show the gui
             */
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    dispose();
                }
            });
        }
        else if (e.getSource() == settingBtn){
            SwingUtilities.invokeLater(() -> {
               // new SettingsWindow();
            });

            dispose();
        }
    }

    public static void main(String[] args) {
      new Menu();
    }

}
