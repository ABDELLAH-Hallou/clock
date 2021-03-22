package clockanalog;
import javax.swing.*;
public class Clock extends JFrame
{
	Clock() 
	{	
		setTitle("clock");
		setBounds(500, 150, 650, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new Draw());
		setResizable(false);
		setVisible(true);
	}
	

    
}
