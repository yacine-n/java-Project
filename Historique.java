import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Historique extends JApplet implements ActionListener
{
	static JFrame frame;
	static JPanel panel;

	JLabel ltitre;
	JLabel llab1;
	JLabel ltitre1;
	JLabel histoire;
	JLabel hist;
	JLabel hist1;

	JButton rtour;

	 GridLayout gl;

	 public Historique()
	 {
	 	panel = new JPanel();
		frame = new JFrame("KnowledgeOnWeb");
		frame.getContentPane().add(panel);

		gl = new GridLayout();
        gl.setColumns(2);
        gl.setRows(10);
        //gl.setHgap(5); Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        //gl.setVgap(5); Cinq pixels d'espace entre les lignes (V comme Vertical) 
        panel.setLayout(gl);

        ltitre = new JLabel("KnowledgeOnWeb", JLabel.CENTER);
		ltitre.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 40));

		llab1 = new JLabel(" ");

		ltitre1 = new JLabel("A la découverte de KnowledgeOnWeb: ", JLabel.LEFT);
		ltitre1.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 25));

        histoire = new JLabel("KnowledgeOnWeb est une université de premier rang aux Eats Unis, créée en 1964 avec seulement trois facultés et ", JLabel.LEFT);
		histoire.setFont(new Font("Helvetica", Font.ITALIC, 20));

		hist = new JLabel("entrée sur la dispense de services éducatifs excellents et pertinents. A l'heure actuelle, elle compte plus de 25facultés ", JLabel.LEFT);
		hist.setFont(new Font("Helvetica", Font.ITALIC, 20));

		hist1 = new JLabel("dispensant un programme de deuxiéme et troisiéme cycles. ", JLabel.LEFT);
		hist1.setFont(new Font("Helvetica", Font.ITALIC, 20));

		rtour = new JButton("Retour");
		rtour.addActionListener(this);

		panel.add(ltitre);
		panel.add(llab1);
		panel.add(ltitre1);
		panel.add(histoire);
		panel.add(hist);
		panel.add(hist1);
		panel.add(rtour);
	 }

	 public void actionPerformed(ActionEvent ae)
	 {
	 	Object source = ae.getSource();

       if (source == rtour) 
       {
          
       }
	 }

	public static void main(String args[])
	{
		Historique ob;
		ob = new Historique();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}