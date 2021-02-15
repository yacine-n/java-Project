import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Critere extends JApplet implements ActionListener
{
	static JFrame frame;
	static JPanel panel;

	JLabel ltitre;
	JLabel llab1;
	JLabel ltitre1;
	JLabel crt1;
	JLabel crt2;
	JLabel crt3;
	JLabel crt4;

	JButton rtour;

	 GridLayout gl;

	 public Critere()
	 {
	 	panel = new JPanel();
		frame = new JFrame("KnowledgeOnWeb");
		frame.getContentPane().add(panel);

		gl = new GridLayout();
        gl.setColumns(2);
        gl.setRows(8);
        //gl.setHgap(5); Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        //gl.setVgap(5); Cinq pixels d'espace entre les lignes (V comme Vertical) 
        panel.setLayout(gl);

        ltitre = new JLabel("KnowledgeOnWeb", JLabel.CENTER);
		ltitre.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 40));

		llab1 = new JLabel(" ");

		ltitre1 = new JLabel("Nos criteres d'Admission: ", JLabel.CENTER);
		ltitre1.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 25));    

		crt1 = new JLabel(".Avoir une licence ou un diplome equivalent d'un collége et d'une université aux usa", JLabel.LEFT);
		crt1.setFont(new Font("Helvetica", Font.ITALIC, 20));

		crt2 = new JLabel(".La qualité des résultats obtenus pour les cours du premier bloc annuel et aux examens", JLabel.LEFT);
		crt2.setFont(new Font("Helvetica", Font.ITALIC, 20));

		crt3 = new JLabel(".Le degré de motivation de l’étudiant", JLabel.LEFT);
		crt3.setFont(new Font("Helvetica", Font.ITALIC, 20));

        crt4 = new JLabel(".Les projets présentés par l'étudiant dans son dossier et lors de l'entretien laissent entrevoir.", JLabel.LEFT);
		crt4.setFont(new Font("Helvetica", Font.ITALIC, 20));


		rtour = new JButton("Retour");
		rtour.addActionListener(this);

		panel.add(ltitre);
		panel.add(llab1);
		panel.add(ltitre1);
		panel.add(crt1);
		panel.add(crt2);
		panel.add(crt3);
		panel.add(crt4);
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
		Critere ob;
		ob = new Critere();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}