/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.brick;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        gamebrick gamebricK = new gamebrick();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamebricK);
    }
    
}
