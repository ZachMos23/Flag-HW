package PaintApp;
  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class ColorButton extends JButton{
  //instance variables
  private String name;
  private Color color;
  public static Random rand = new Random();
  //construcor
  public ColorButton(){
      this.name="try me";
      this.color=new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    
      this.setBackground(this.color);
      this.setText(this.name);
    
}
  public Color getColor(){
    return color;
  }
}