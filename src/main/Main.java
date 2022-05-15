package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JFrame este un container ce ne oferă posibilitatea să afișăm o fereastră pe ecran.
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fereastra se va închide la apăsarea butonului "X"
        window.setResizable(false);                            //dimensiunea ferestrei nu poate fi modificată
        window.setTitle("Future Engineer");                    //titlul jocului

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null);              //poziție nespecificată, fereastra va fi poziționată în centru
        window.setVisible(true);                         //fără această instrucțiune, fereastra nu ar fi vizibilă

        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
}