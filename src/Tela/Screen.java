package Tela;

import javax.swing.*;
import java.awt.*;

public class Screen {
    public Screen(){
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(800, 500);
        jf.setTitle("Lo Banco™");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.getContentPane().setBackground(new Color (200,30,50));


        JLabel bank = new JLabel();
        bank.setText("Lo Bank");
        bank.setForeground(Color.BLACK);
        bank.setBounds(330, 100, 400, 50); // Define posição e tamanho do JLabel
        bank.setFont(new Font("Arial", Font.BOLD, 30)); // Define a fonte do JLabel
        jf.add(bank);

        JLabel by = new JLabel();
        by.setText("By: Saipee");
        by.setForeground(new Color(0xA29F9F));
        by.setBounds(725, 427, 500, 50);
        by.setFont(new Font("Arial", Font.BOLD, 10));
        jf.add(by);

        Font font = new Font("Arial", Font.BOLD, 20);
        Color colorP = new Color(0x8304A0);
        Color colorB = new Color(0x070000);


        JButton sign = new JButton();
        sign.setText("Sign Up");
        sign.setBounds(100,250,250,70);
        sign.setForeground(colorP);
        sign.setBackground(colorB);
        sign.setFont(font);

        jf.add(sign);


        JButton login = new JButton();
        login.setText("Login");
        login.setBounds(400,250,250,70);
        login.setForeground(colorP);
        login.setBackground(colorB);
        login.setFont(font);

        jf.add(login);

    }

}
