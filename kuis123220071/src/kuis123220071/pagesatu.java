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



public class pagesatu extends JFrame implements ActionListener{

    JLabel header = new JLabel("SELAMAT DATANG");
    JLabel labelkendaraan = new JLabel("PILIH KENDARAAN");
    JRadioButton pilihmobil = new JRadioButton("Mobil", true);
    JRadioButton pilihmotor = new JRadioButton("Motor");

    JButton lanjut = new JButton("Lanjut");

    pagesatu() {
        setVisible(true);
        setSize(480, 480);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        add(labelkendaraan);
        add(pilihmobil);
        add(pilihmotor);
        add(lanjut);

        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(20, 20, 440, 24);
        ButtonGroup pilihkendaraan = new ButtonGroup();
        pilihkendaraan.add(pilihmobil);
        pilihkendaraan.add(pilihmotor);

        labelkendaraan.setBounds(20, 216, 440, 12);
        pilihmobil.setBounds(14, 232, 128, 32);
        pilihmotor.setBounds(224, 232, 128, 32);

        lanjut.setBounds(14,280,452,36);
        lanjut.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
   
    String jeniskendaraan = pilihmobil.isSelected()? "mobil" : "motor";
    if (jeniskendaraan == "mobil"){
        new pageduamobil();
    } else {
        new pageduamotor();
    }
    }

}
/**
 *
 * @author Lab Informatika
 */
