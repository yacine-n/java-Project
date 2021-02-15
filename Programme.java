import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Programme extends JApplet implements ActionListener
{
	static JFrame frame;
	static JPanel panel;
	//static JPanel pan1;

	JLabel ltitre;
	JLabel llab1;
	JLabel ltitre1;
	JLabel a; 
	JLabel b; 
	JLabel c; 
	JLabel d; 
	JLabel e; 
	JLabel f; 
	JLabel g; 
	JLabel h; 
	JLabel i; 
	JLabel j; 
	JLabel k; 
	JLabel l; 

    JButton form;
	JButton rtour;

	 GridLayout gl;

	 public Programme()
	 {
	 	panel = new JPanel();
	 	
		frame = new JFrame("KnowledgeOnWeb");
		frame.getContentPane().add(panel);

		/**pan1 = new JPanel();
	 	pan1.setLayout(new FlowLayout());
		frame.getContentPane().add(pan1);
		getContentPane().add(pan1);*/

		gl = new GridLayout();
        gl.setColumns(1);
        gl.setRows(17);
        //gl.setHgap(5); Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        //gl.setVgap(5); Cinq pixels d'espace entre les lignes (V comme Vertical) 
        panel.setLayout(gl);

        ltitre = new JLabel("KnowledgeOnWeb", JLabel.CENTER);
		ltitre.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 40));

		llab1 = new JLabel(" ");

		ltitre1 = new JLabel("Nos Programmes: ", JLabel.CENTER);
		ltitre1.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 25));

		a = new JLabel("-Aéronautique-Astronautique", JLabel.LEFT);
		a.setFont(new Font("Helvetica", Font.ITALIC, 20));

		b = new JLabel("-Sciences de la terre", JLabel.LEFT);
		b.setFont(new Font("Helvetica", Font.ITALIC, 20));

		c = new JLabel("-Physique appliquée", JLabel.LEFT);
		c.setFont(new Font("Helvetica", Font.ITALIC, 20));

		d = new JLabel("-Biochimie", JLabel.LEFT);
		d.setFont(new Font("Helvetica", Font.ITALIC, 20));

		e = new JLabel("-Education", JLabel.LEFT);
		e.setFont(new Font("Helvetica", Font.ITALIC, 20));

		f = new JLabel("-BioSciences", JLabel.LEFT);
		f.setFont(new Font("Helvetica", Font.ITALIC, 20));

		g = new JLabel("-Humanités et Sciences ", JLabel.LEFT);
		g.setFont(new Font("Helvetica", Font.ITALIC, 20));

		h = new JLabel("-Ingénierie et sciences appliquées", JLabel.LEFT);
		h.setFont(new Font("Helvetica", Font.ITALIC, 20));

		i = new JLabel("-Architecture", JLabel.LEFT);
		i.setFont(new Font("Helvetica", Font.ITALIC, 20));

		j = new JLabel("-Droit", JLabel.LEFT);
	    j.setFont(new Font("Helvetica", Font.ITALIC, 20));

		k = new JLabel("-Ecole d'infirmiére", JLabel.LEFT);
		k.setFont(new Font("Helvetica", Font.ITALIC, 20));

    	l = new JLabel("-Journalisme", JLabel.LEFT);
		l.setFont(new Font("Helvetica", Font.ITALIC, 20));

        form = new JButton("Remplir Formulaire");
        /**setLayout(null);
        form.setBouds(35,35,50,50);
        form.setPreferredSize(new Dimension(20, 20));*/
        form.addActionListener(this);

		rtour = new JButton("Retour");
		rtour.addActionListener(this);

		panel.add(ltitre);
		panel.add(llab1);
		panel.add(ltitre1);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(e);
		panel.add(f);
		panel.add(g);
		panel.add(h);
		panel.add(i);
		panel.add(j);
		panel.add(k);
		panel.add(l);
		//pan1.add(form);
		panel.add(form);
		panel.add(rtour);
	 }

	 public void actionPerformed(ActionEvent ae)
	 {
	 	Object source = ae.getSource();

       if (source == form) 
       {
          
       }
       else
       {

       }
	 }

	public static void main(String args[])
	{
		Programme pg;
		pg = new Programme();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}