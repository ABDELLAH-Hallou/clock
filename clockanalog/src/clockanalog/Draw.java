package clockanalog;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Calendar;
import javax.swing.*;
public class Draw extends JPanel implements ActionListener
{
//transform les lignes
		AffineTransform M = new AffineTransform();
		AffineTransform S = new AffineTransform();
//constructor
		Draw()
		{
				JLabel l;
//add image
				ImageIcon img = new ImageIcon("C:\\Users\\Man\\eclipse-workspace\\clockanalog\\bin\\clockanalog\\clock.png");
				l=new JLabel("",img,JLabel.CENTER);
				l.setBounds(0, 0, 500, 500);
				add(l);
//timer pour action listener
				Timer time = new Timer(1000,this);
				time.start();
		}
		public void paint(Graphics g)
		{
				super.paint(g);
				g.translate(317, 229);
//affecter la forme line à un objet
				Shape m = new Line2D.Float(0, 0, 0, -100);
				Shape s = new Line2D.Float(0, 0, 0, -160);
//returner les coordonnees d'un ligne
				s = S.createTransformedShape(s);
				m = M.createTransformedShape(m);
//draw
				((Graphics2D)g).draw(s);
				((Graphics2D)g).draw(m);
		}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
//get time right now
				int minute = Calendar.getInstance().get(Calendar.MINUTE);
				int second = Calendar.getInstance().get(Calendar.SECOND);
//Angle des minutes et des seconds
				M.setToRotation(Math.PI*minute/30f);
				S.setToRotation(Math.PI*second/30f);
//mise à jour
				repaint();
		}
		
}