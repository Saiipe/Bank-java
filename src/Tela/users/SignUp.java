package Tela.users;

import Tela.Screen;

import javax.swing.*;
import java.awt.*;

public class SignUp extends Screen{


    public SignUp(){
        JFrame sign = new JFrame();
        sign.setVisible(true);
        sign.setSize(800, 500);
        sign.setTitle("Lo Banco™");
        sign.setDefaultCloseOperation(sign.EXIT_ON_CLOSE);
        sign.setResizable(false);
        sign.setLocationRelativeTo(null);
        sign.setLayout(null);


        JLabel by = new JLabel();
        by.setText("By: Saipee");
        by.setForeground(new Color(0xA29F9F));
        by.setBounds(725, 427, 500, 50);
        by.setFont(new Font("Arial", Font.BOLD, 10));
        sign.add(by);



    }

}
