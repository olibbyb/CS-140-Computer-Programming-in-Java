import java.awt.*;
import javax.swing.*;
public class JLandmarkFrame extends JFrame
{
	private JButton nb = new JButton("Mt. Rushmore");
	private JButton sb = new JButton("Alamo");
	private JButton eb = new JButton("Statue of Liberty");
	private JButton wb = new JButton("Golden Gate Bridge");
	private JButton cb = new JButton("North American Landmarks");
	private Container con = getContentPane();
	public JLandmarkFrame()
	{
		con.setLayout(new BorderLayout());
		con.add(nb, BorderLayout.NORTH);
		con.add(sb, BorderLayout.SOUTH);
		con.add(eb, BorderLayout.EAST);
		con.add(wb, BorderLayout.WEST);
		con.add(cb, BorderLayout.CENTER);
		setSize(900, 150);
	}
    public static void main(String[] args)
    {
    	JLandmarkFrame frame = new JLandmarkFrame();
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    
    
}