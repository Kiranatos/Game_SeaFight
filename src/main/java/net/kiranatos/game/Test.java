package net.kiranatos.game;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    
    public static void main(String[] args) {
        ReadFromFiles r = new ReadFromFiles();
        r.setFile("F:\\003_NetBeans\\MyProjects\\SeaFight\\proba2.txt");
        try {
            r.getListOfTheWords();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
