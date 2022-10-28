//Hi all! This program displays the national flag of Romania! I loved creating this flag hope you guys enjoy it!
package GUI;


import java.awt.*;
import javax.swing.*;

public class Flag {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame("Flag Example");
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    theGUI.setSize(300,300);
    theGUI.setVisible(true);

      
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    panel.setSize(100, 300);
    panel.setVisible(true);
    theGUI.add(panel);
      
    JPanel panel2= new JPanel();
    panel2.setBackground(Color.RED);
    panel2.setSize(200, 300);
    panel2.setVisible(true);
    theGUI.add(panel2);

    JPanel panel3= new JPanel();
    panel3.setBackground(Color.YELLOW);
    panel3.setSize(200, 300);
    panel3.setVisible(true);
    theGUI.add(panel3);

    
  }
}
