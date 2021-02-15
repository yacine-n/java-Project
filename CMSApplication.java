import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CMSApplication extends JApplet implements ActionListener
{
	static JFrame frame;
	static JPanel panel;
	JLabel ltit;
	JLabel llab;
	JTextArea para;
	JButton admi;
	JButton user;
	

	public CMSApplication()
	{
		
		panel = new JPanel();
		frame = new JFrame("KnowledgeOnWeb");
		frame.getContentPane().add(panel);
		
		ltit = new JLabel("KnowledgeOnWeb", JLabel.CENTER);
		ltit.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 40));

		llab = new JLabel(" ");

		para = new JTextArea();
		para.setText("ghhjjjkk");
	
		admi = new JButton("Administrateur");
		admi.addActionListener(this);

		user = new JButton("Utilisateur");
		user.addActionListener(this);


		panel.add(ltit);
		panel.add(llab);
		panel.add(para);
		panel.add(admi);
		panel.add(user);
	}

	public void actionPerformed(ActionEvent ae)
    {
    	Object source = ae.getSource();

       if (source == admi) 
       {
          Entre ap = new Entre();
       }
       else
       {
       	MenuUser mu = new MenuUser();
       }
    
    }

	public static void main(String args[])
	{
		CMSApplication bs;
		bs = new CMSApplication();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}