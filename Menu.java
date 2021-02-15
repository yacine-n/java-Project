import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 

public class Menu extends JApplet implements ActionListener
{
    static JFrame frame;
	static JPanel panel;

	JLabel ltit;
	JLabel llab;
	
	
	JButton programmes;
	JButton criteres;
    JButton progress;
    JButton rapport;
    JButton retour;

    GridLayout gl1;

    public Menu()
    {
    	panel = new JPanel();
		frame = new JFrame("KnowledgeOnWeb");
		frame.getContentPane().add(panel);

		gl1 = new GridLayout();
        gl1.setColumns(2);
        gl1.setRows(10);
        //gl.setHgap(5); Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        //gl.setVgap(5); Cinq pixels d'espace entre les lignes (V comme Vertical) 
        panel.setLayout(gl1);

		ltit = new JLabel("KnowledgeOnWeb", JLabel.CENTER);
		ltit.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 25));

		llab = new JLabel(" ");

		
		programmes = new JButton("Nos Programmes");
		programmes.addActionListener(this);

		criteres = new JButton("Critéres de Sélection");
		criteres.addActionListener(this);

		progress = new JButton("Progression del'éléve");
		progress.addActionListener(this);

		rapport = new JButton("Rapport");
		rapport.addActionListener(this);

		retour = new JButton("Retour");
		retour.addActionListener(this);

		panel.add(ltit);
		panel.add(llab);
		
		panel.add(programmes);
		panel.add(criteres);
		panel.add(progress);
		panel.add(rapport);
		panel.add(retour);
    }

    public void actionPerformed(ActionEvent ae)
    {
    	Object source = ae.getSource();

       if (source == programmes) 
       {
          
       }
       else if (source == criteres)
       {

       }
       else if (source == progress)
       {
       	
       }
       else if (source == rapport)
       {
       	
       }
       else
       {

       }
    }

    public static void main(String args[])
	{
		Menu mn;
		mn = new Menu();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

}