import javax.swing.JFrame;

public class Main 
{
	public static Display f = new Display(); 
	public static int width = 600; 
	public static int height = 400; 
	public static void main(String[] args)
	{
		f.setSize(width,height); 
		f.setResizable(true); 
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Food Game");
		f.setLocationRelativeTo(null);
		f.setAlwaysOnTop(true);
	}


}

