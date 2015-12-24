import java.awt.Color;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Image.*;
import javax.swing.*;


public class Image extends JPanel
{
private static final long serialVersionUID = 1L; 
public int w = Main.width;  
public int h = Main.height; 
public Image bg; 
public boolean imagesLoaded = false; 

public Image()
{
	this.setBackground(Color.BLACK);

loadImage(); 
}

public void loadImage()

{
	
	bg = new ImageIcon(getClass().getResource("smile.png")).getImage(); 
	imagesLoaded = true; 
	repaint(); 
}


}
