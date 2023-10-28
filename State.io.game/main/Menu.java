package main;


import javax.swing.*;

import logic.EnterOrder;
import logic.RandomGame;
import logic.Setting;
import logic.Shop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JButton EnterOrderGame,Random,createGameBtn,joinGameBtn,settingBtn,ShopBtn;
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
        buttonPanel = new JPanel();
        buttonPanel.setBounds(0,0,1200,800);
        buttonPanel.setLayout(null);
        buttonPanel.setOpaque(false);
        initButtons();
        layers.add(buttonPanel);
        setVisible(true);
    }

    private void initButtons() {
        EnterOrderGame = new JButton("Enter Order");
        EnterOrderGame.setFocusable(false);
        EnterOrderGame.setBounds(430,100,300,40);
        EnterOrderGame.setBackground(Color.PINK);
        buttonPanel.add(EnterOrderGame);

        Random = new JButton("start Random game");
        Random.setFocusable(false);
        Random.setBounds(430,200,300,40);
        Random.setBackground(Color.PINK);
        buttonPanel.add(Random);

        createGameBtn = new JButton("create game");
        createGameBtn.setFocusable(false);
        createGameBtn.setBounds(430,300,300,40);
        createGameBtn.setBackground(Color.PINK);
        buttonPanel.add(createGameBtn);


        joinGameBtn = new JButton("join game");
        joinGameBtn.setFocusable(false);
        joinGameBtn.setBounds(430,400,300,40);
        joinGameBtn.setBackground(Color.PINK);
        buttonPanel.add(joinGameBtn);


        settingBtn = new JButton("settings");
        settingBtn.setFocusable(false);
        settingBtn.setBounds(430,500,300,40);
        settingBtn.setBackground(Color.PINK);
        buttonPanel.add(settingBtn);

        
        ShopBtn = new JButton("Shop");
        ShopBtn.setFocusable(false);
        ShopBtn.setBounds(430,600,300,40);
        ShopBtn.setBackground(Color.PINK);
        buttonPanel.add(ShopBtn);

        Random.addActionListener(this);
        EnterOrderGame.addActionListener(this);
        createGameBtn.addActionListener(this);
        joinGameBtn.addActionListener(this);
        settingBtn.addActionListener(this);
        ShopBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Random){
            SwingUtilities.invokeLater(() -> {
                RandomGame.main(null);
            });

            dispose();
        }
        else if(e.getSource() == createGameBtn){
        //    Server server = new Server();
        //    try {
        //   //  server.start();
        // } catch (IOException e1) {
        //     // TODO Auto-generated catch block
        //     e1.printStackTrace();
        // }
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    dispose();
                }
            });

        }
        else if (e.getSource()== EnterOrderGame){
            /**
             * if the game started start the gameLoop and show the gui
             */
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    EnterOrder.main(null);
                    dispose();
                }
            });
        }
        else if (e.getSource() == settingBtn){
            SwingUtilities.invokeLater(() -> {
                new Setting().setVisible(true);
            });

            dispose();
        }else if (e.getSource()== ShopBtn){
            new Shop();
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
    }

    public static void main(String[] args) {
      new Menu();
    }
}
