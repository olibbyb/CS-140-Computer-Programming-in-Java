
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class JChangeSizeAndColor extends JFrame implements ActionListener
{
	public Random generator;
	public Random rn = new Random();
	public JLabel phrase, nn;
	public JButton click;
	JFrame frame;
	Font font = new Font("Serif", Font.ITALIC, 48);
	public JChangeSizeAndColor()
	{
		frame = new JFrame();
       frame.setTitle("Size and Color");
       generator = new Random();
       phrase = new JLabel("");
       JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(0,2));
       frame.add(phrase);
       nn = new JLabel("");
       click = new JButton("Click here");
       frame.setLayout(new GridLayout(3,1));
       frame.add(click);
       frame.add(panel);
       frame.add(nn);
       frame.setSize(500, 200);
       click.addActionListener(this);
       frame.setVisible(true);
       return;
	}
	public void actionPerformed(ActionEvent e)
   {
		phrase.setText("Hello");
		nn.setText("");
		int red = generator.nextInt(255);
		int green = generator.nextInt(255);
		int blue = generator.nextInt(255);
		Color color = new Color(red, green, blue);
		phrase.setForeground(color);
        nn.setFont(font);
   }

    public static void main(String[] args)
    {
		JChangeSizeAndColor jChangeSizeAndColor = new JChangeSizeAndColor();
    }
    
    
}