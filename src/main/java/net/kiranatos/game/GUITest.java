package net.kiranatos.game;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest {
    
    private static JLabel lab;
    
    public void makeWindow ()
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pan = new JPanel();
        lab = new JLabel();
        pan.add(lab);
        lab.setText("Test");
        
        
        
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setVisible(true);			
        frame.setContentPane(pan);        
    }
    
    public void setLabel(String str){
        String s = lab.getText().replaceAll("<html>", "").replaceAll("</html>", "");
       lab.setText("<html>"+s+"<br>"+str+"</html>");
    }
    
}

//<html>dddddddd<br> rrrrrrrrrrr</html>