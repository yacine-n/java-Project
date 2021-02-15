import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;
//implements ActionListener

/*<applet code = "Entre.class" width = 300 height = 200>
</applet>*/

public class Entre extends JApplet 
{
    JPanel panel; 
	JLabel lname;
	JLabel lpass;

	JButton valider;
	JButton reset;
	JButton retour;

	JTextField tname;
    JTextField tpass;

    GridBagLayout g;
	GridBagConstraints gbc;

	public void init()
	{
		 g = new GridBagLayout();
        gbc = new GridBagConstraints();
        panel = (JPanel)getContentPane();
        panel.setLayout(g);

        //Adding the controls for Applicant ID
        lname = new JLabel("Nom d'utilisateur");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 1; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lname, gbc);
        panel.add(lname);

        tname = new JTextField(5); //5 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 1; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tname, gbc);
        panel.add(tname);


        lpass = new JLabel("Mot de Passe");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 2; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lpass, gbc);
        panel.add(lpass);

        tpass = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 2; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tpass, gbc);
        panel.add(tpass);


        JButton valider = new JButton("Valider");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 5; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(valider, gbc);
        panel.add(valider);
        //valider.addActionListener(this);

        JButton reset = new JButton("Reset");
        gbc.ipady = 1; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 6; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(reset, gbc);
        panel.add(reset);
       // reset.addActionListener(this);

        JButton retour = new JButton("Retour");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 7; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(retour, gbc);
        panel.add(retour);
       // retour.addActionListener(this);
	}
}