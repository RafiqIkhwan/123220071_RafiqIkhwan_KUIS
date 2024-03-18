/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis123220071;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class pageduamobil extends JFrame implements ActionListener {

    JLabel header = new JLabel("SELAMAT DATANG");
    JLabel labelnama = new JLabel("nama");
    JLabel labelnohp = new JLabel("nomer hp");
    JTextField inputnama = new JTextField();
    JTextField inputnohp = new JTextField();
    JLabel labelmobil = new JLabel("pilih mobil");
    JRadioButton suzuki = new JRadioButton("suzuki", true);
    JRadioButton honda = new JRadioButton("honda");
    JRadioButton mitsubishi = new JRadioButton("mitsubishi");
    JButton lanjut = new JButton("Lanjut");

    pageduamobil() {
        setVisible(true);
        setSize(480, 480);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        add(labelnama);
        add(inputnama);
        add(inputnohp);
        add(labelnohp);
        add(suzuki);
        add(honda);
        add(mitsubishi);
        add(lanjut);

        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(20, 20, 440, 24);
        ButtonGroup pilihmobil = new ButtonGroup();
        pilihmobil.add(suzuki);
        pilihmobil.add(honda);
        pilihmobil.add(mitsubishi);
        labelnama.setBounds(20, 84, 440, 12);
        inputnama.setBounds(18, 100, 440, 32);
        labelnohp.setBounds(20, 150, 440, 12);
        inputnohp.setBounds(18, 166, 440, 32);
        

        labelmobil.setBounds(20, 216, 440, 12);
        suzuki.setBounds(14, 232, 128, 32);
        honda.setBounds(224, 232, 128, 32);
        mitsubishi.setBounds(444, 232, 128, 32);

        lanjut.setBounds(14, 280, 452, 36);
        lanjut.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
            String nama = inputnama.getText();
            String nohp = inputnohp.getText();
            String jeniskendaraan = suzuki.isSelected() ? "suzuki" : "honda";
            if(nama.isEmpty()){
            
            }
            new pagetiga();
        
            
        }

       
    }
}
