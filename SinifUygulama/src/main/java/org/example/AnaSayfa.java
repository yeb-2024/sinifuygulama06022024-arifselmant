package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa  implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("Profile göster");
    AnaSayfa(){
        button.setBounds(200,200,100,50);
        button.setFocusable(false);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Tıklandı");

        if (e.getSource() == button){


            frame.dispose();
            ProfilSayfa profilSayfa = new ProfilSayfa();

        }
    }
}
