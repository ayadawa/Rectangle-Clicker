import javax.swing.*;
import java.awt.*;

public class Display extends JFrame
{
	public JPanel gp = (JPanel) getGlassPane();
	public Image i; 
	public Key k; 
	
	public Display()
	{
		
	i = new Image(); 
	gp.setVisible(true); 
	k = new Key(this, i);
	
	gp.setLayout(new GridLayout(1,1,0,0));
	this.setLayout(new GridLayout(1,1,0,0));
	
	gp.add(k);
	this.add(i);
	}
}
