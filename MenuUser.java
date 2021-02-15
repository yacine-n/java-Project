import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuUser extends JApplet implements ActionListener
{
    static JFrame frame;
	static JPanel panel;

	JLabel ltitre;
	JLabel llab1;
	
	JButton histoire;
	JButton prog;
	JButton crit;
	JButton form1;
	JButton form2;
    JButton contacte;
    JButton ret;

    GridLayout gl;

    public MenuUser()
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
		ltitre.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 25));

		llab1 = new JLabel(" ");

		histoire = new JButton("Historique");
		histoire.addActionListener(this);

		prog = new JButton("Nos Programmes");
		prog.addActionListener(this);

		crit = new JButton("Critéres de Sélection");
		crit.addActionListener(this);

		form1 = new JButton("Formulaire d'admission");
		form1.addActionListener(this);

		form2 = new JButton("Formulaire Qualifications");
		form2.addActionListener(this);

		contacte = new JButton("Contact");
		contacte.addActionListener(this);

		ret = new JButton("Retour");
		ret.addActionListener(this);
	
        //this.setLayout(new GridLayout(8,2,5,5));

        

		panel.add(ltitre);
		panel.add(llab1);
		panel.add(histoire);
		panel.add(prog);
		panel.add(crit);
		panel.add(form1);
		panel.add(form2);
		panel.add(contacte);
		panel.add(ret);
    }

    public void actionPerformed(ActionEvent ae)
    {
    	Object source = ae.getSource();

       if (source == histoire) 
       {
          
       }
       else if (source == prog)
       {

       }
       else if (source == crit)
       {
       	
       }
       else if (source == form1)
       {
       	
       }
       else if (source == form2)
       {
       	
       }
       else if (source == contacte)
       {
       	
       }
       else
       {

       }
    }

    public static void main(String args[])
	{
		MenuUser obj;
		obj = new MenuUser();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

}