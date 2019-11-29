/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
public class HelloGUI {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame(" HelooGUI ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program akan berhenti jika ditutup
            frame.setSize(600, 300);//lebar tinggi windows
            frame.setLocation(200, 200);//x,y tampilan pada windows
            frame.setVisible(true);// untuk menampilkan frame
    }
}