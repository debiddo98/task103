package com.dionedavid;

import javax.swing.*;

/**
 * @author Dione David P. Layosa / BSCS IV-A / 1st Sem A.Y. 2024 - 2025
 * @since 21 October 2024
 * Description:
 * This is for an activity for IS101. Rule-Based Expert Systems.
 * This program is a simple Java Program that takes user input
 * and outputs a pc configuration based on the user's needs.
 */

public class Main extends JFrame{
    private JPanel MainPanel;
    private JButton minimizeBtn;
    private JButton closeBtn;

    public Main(){
        // Create the frame
        JFrame frame = new JFrame();
        frame.setTitle("Dione's PC Configuration Expert System");
        frame.setUndecorated(true);
        frame.setContentPane(MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);

        // Set the frame to be centered on the screen
        frame.setLocationRelativeTo(null);

        // Makes the frame draggable
        //This makes the frame draggable
        FrameDragListener frameDragListener = new FrameDragListener(frame);
        frame.addMouseListener(frameDragListener);
        frame.addMouseMotionListener(frameDragListener);

        frame.pack();
        frame.setVisible(true);

        //Button Functions
        minimizeBtn.addActionListener(e -> frame.setState(JFrame.ICONIFIED));
        closeBtn.addActionListener(e -> System.exit(0));

        System.out.printf("Hello and welcome!");
    }



    public static void main(String[] args) {
        // Set the look and feel to the system's look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Instantiate the Main class
        new Main();


    }
}