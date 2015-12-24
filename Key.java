import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Key extends JPanel 
{
	public Rectangle character; 
	public int charHeight = 24; 
	public int charWidth = 36; 
	public boolean right = false; 
	public boolean left = false; 
	public boolean mouseActive = false; 
	public Point mouse; 

	public Key(Display f, Image i)
	
	{
		
		character = new Rectangle(180, 180,charWidth, charHeight );
		f.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{


				if(e.getKeyCode() == KeyEvent.VK_D);
				{
					mouseActive = false; 
					right = true; 
					
				
				}
				if(e.getKeyCode() == KeyEvent.VK_A)
				{
					mouseActive = false; 
					left = true; 
					
				}
				if(e.getKeyCode() == KeyEvent.VK_M)
				{
					mouseActive = true; 
				}

			}
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_D)
				{
					right = false; 
				}
				if(e.getKeyCode() == KeyEvent.VK_A)
				{
					left = false; 
				}
				
			}

		});
		f.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e)
			{
				mouse = new Point(e.getX(), e.getY() -25); 
				if(mouseActive)
				{
					character.x = mouse.x; 
					character.y = mouse.y; 
				}
				repaint(); 
			}
		}); 
		
		f.addMouseListener(new MouseAdapter()
				{
			public void mouseClicked(MouseEvent e)
			{
				mouse = new Point(e.getX(), e.getY()-25);
				if(e.getButton() == MouseEvent.BUTTON1&& !mouseActive)
				{
					character.x = mouse.x; 
							character.y = mouse.y; 
				}
				repaint(); 
			}
				});
		}
	

	public void paintComponent(Graphics g)
	{
		if(Main.f.i.imagesLoaded)
		{
		
		super.paintComponent(g);
		this.setBackground(Color.CYAN);
		g.setColor(Color.MAGENTA);
		g.fillRect(character.x, character.y, character.width, character.height);
		
		if(right)
		{
			character.x += 1; 
		}
		if(left)
		{
			character.x -= 1; 
		}
		
	g.drawImage(Main.f.i.bg, 0, 0, 600, 400, null); 
		repaint();
	}

}
}
