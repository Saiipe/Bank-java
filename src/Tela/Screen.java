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
