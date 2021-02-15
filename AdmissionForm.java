//GridBag divise un conteneur en une grille de cellules de taille égale

import java.awt.*;
import javax.swing.*;

/*
<applet code ="AdmissionForm.class" width = 500 height = 300>
</applet>
*/

public class AdmissionForm extends JApplet
{
	/**Declaring the variable*/
	JPanel panel; 

	JLabel ltitle;
	JLabel lt1;
	JLabel letude;
	JLabel lecole;
	JLabel lt2;
	JLabel lnom;
	JLabel ladd;
	JLabel lcite;
	JLabel letat;
	JLabel lcode;
	JLabel lpays;
	JLabel lt3;
	JLabel lcp;
    JLabel lindic;
    JLabel lnum;
    JLabel lt4;
    JLabel lcp1;
    JLabel lindic1;
    JLabel lnum1;
    JLabel lmail;
    JLabel lsexe;
    //JLabel ldate;
    JLabel lstatut;

    JTextField tetude;
    JTextField tecole;
	JTextField tnom;
	JTextField tadd;
    JTextField tcite;
	JTextField tetat;
	JTextField tcode;
    JTextField tpays;
	JTextField tcp;
	JTextField tindic;
	JTextField tnum;
	JTextField tcp1;
	JTextField tindic1;
	JTextField tnum1;
	JTextField tmail;
	//JTextField tdate;


	JRadioButton rang;
	JRadioButton b1;
	JRadioButton b2;
	ButtonGroup bg;
	
	JRadioButton b3;
	JRadioButton b4;
	JRadioButton b5;
	JRadioButton b6;
	ButtonGroup statut;

	/**JComboBox mois;
	JComboBox jour;
	JComboBox année;*/

	JButton submit;
	JButton reset;

	GridBagLayout g;
	GridBagConstraints gbc;

	public void init()
	{
        /**Initializing the layout variables*/

        g = new GridBagLayout();
        gbc = new GridBagConstraints();
        panel = (JPanel)getContentPane();
        panel.setLayout(g);

        ltitle = new JLabel("Formulaire Inscription");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 1; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(ltitle, gbc);
        panel.add(ltitle);

        lt1 = new JLabel("Inscription Pour: ");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 2; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lt1, gbc);
        panel.add(lt1);

        //Adding the controls for Programme Niveau d'Etude
        letude = new JLabel("Programme Niveau d'Etude: ");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 3; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(letude, gbc);
        panel.add(letude);

        tetude = new JTextField(5); //5 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 3; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tetude, gbc);
        panel.add(tetude);


        //Adding the controls Ecole
        lecole = new JLabel("Ecole: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 4; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lecole, gbc);
        panel.add(lecole);

        tecole = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 4; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tecole, gbc);
        panel.add(tecole);


      
        lt2 = new JLabel("Détails Personnels: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 5; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lt2, gbc);
        panel.add(lt2);


        lnom = new JLabel("Nom: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 6; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lnom, gbc);
        panel.add(lnom);

        tnom = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 6; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tnom, gbc);
        panel.add(tnom);


        ladd = new JLabel("Adresse: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 7; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(ladd, gbc);
        panel.add(ladd);

        tadd = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 7; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tadd, gbc);
        panel.add(tadd);

        lcite = new JLabel("Cite: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 8; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lcite, gbc);
        panel.add(lcite);

        tcite = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 8; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tcite, gbc);
        panel.add(tcite);

        letat = new JLabel("Etat: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 9; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(letat, gbc);
        panel.add(letat);

        tetat = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 9; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tetat, gbc);
        panel.add(tetat);


        lcode = new JLabel("Code Postal: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 10; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lcode, gbc);
        panel.add(lcode);

        tcode = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 10; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tcode, gbc);
        panel.add(tcode);


        lpays = new JLabel("Pays: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 11; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lpays, gbc);
        panel.add(lpays);

        tpays = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 11; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tpays, gbc);
        panel.add(tpays);


        lt3 = new JLabel("Telephone (domicile): ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 12; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lt3, gbc);
        panel.add(lt3);

        lcp = new JLabel("Code Pays: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 13; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lcp, gbc);
        panel.add(lcp);

        tcp = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 13; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tcp, gbc);
        panel.add(tcp);

        lindic = new JLabel("Indicatif Régional: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 14; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lindic, gbc);
        panel.add(lindic);

        tindic = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 14; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tindic, gbc);
        panel.add(tindic);

        lnum = new JLabel("Numero Telephone: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 15; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lnum, gbc);
        panel.add(lnum);

        tnum = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 15; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tnum, gbc);
        panel.add(tnum);


        lt4 = new JLabel("Telephone (Bureau): ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 16; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lt4, gbc);
        panel.add(lt4);

        lcp1 = new JLabel("Code Pays: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 17; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lcp1, gbc);
        panel.add(lcp1);

        tcp1 = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 17; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tcp1, gbc);
        panel.add(tcp1);

        lindic1 = new JLabel("Indicatif Régional: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 18; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lindic1, gbc);
        panel.add(lindic1);

        tindic1 = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 18; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tindic1, gbc);
        panel.add(tindic1);

        lnum1 = new JLabel("Numero Telephone: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 19; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lnum1, gbc);
        panel.add(lnum1);

        tnum1 = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 19; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tnum1, gbc);
        panel.add(tnum1);

        lmail = new JLabel("Adresse E-mail: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 20; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lmail, gbc);
        panel.add(lmail);

        tmail = new JTextField(30); //30 est le nbre de colonnes
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 20; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(tmail, gbc);
        panel.add(tmail);


        lsexe = new JLabel("Sexe: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 21; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lsexe, gbc);
        panel.add(lsexe);

        b1 = new JRadioButton("Feminin");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 22; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(b1, gbc);
        panel.add(b1);

        b2 = new JRadioButton("Masculin");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 23; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(b2, gbc);
        panel.add(b2);

        bg = new ButtonGroup();
        /**gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 23; //la colonne de la zone d'affichage supérieur gauche du composant
        //g.setConstraints(bg, gbc);*/
        bg.add(b1);
        bg.add(b2);



        lstatut = new JLabel("Statut Citoyen: ");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 24; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lstatut, gbc);
        panel.add(lstatut);

        b3 = new JRadioButton("Citoyen U.S");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 25; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(b3, gbc);
        panel.add(b3);

        b4 = new JRadioButton("Résident Permanent");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 26; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(b4, gbc);
        panel.add(b4);

        b5 = new JRadioButton("N'est pas Citoyen");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 27; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(b5, gbc);
        panel.add(b5);

        b6 = new JRadioButton("Refus de l'Etat");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 28; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(b6, gbc);
        panel.add(b6);

        statut = new ButtonGroup();
        /**gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 3; //la colonne de la zone d'affichage supérieur gauche du composant
        //g.setConstraints(statut, gbc);*/
        statut.add(b3);
        statut.add(b4);
        statut.add(b5);
        statut.add(b6);
        



        //Adding the controls for Sexe
        /**lAppPosition = new JLabel("Position");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 4; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(lAppPosition, gbc);
        panel.add(lAppPosition);

        cbAppPosition = new JComboBox(); 
        //Adding the combo box elements to combo box 
        cbAppPosition.addItem("Executive");
        cbAppPosition.addItem("Manager");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10,0,0,30); //l'espace minimum entre les composants et les bords de la zone d'affichage, (coordonnées du haut , gauche et droite 0,0,0 par défaut)
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 4; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(cbAppPosition, gbc);
        panel.add(cbAppPosition);*/


        JButton submit = new JButton("Continuer");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 0; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 33; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(submit, gbc);
        panel.add(submit);

        JButton reset = new JButton("Reset");
        gbc.ipady = 2; //lespace minimum ajouté au coté vertical d'un composant
        gbc.ipadx = 2;  //lespace minimum ajouté au coté horizontal d'un composant
        gbc.gridx = 1; //la ligne de la zone d'affichage supérieur gauche du composant
        gbc.gridy = 33; //la colonne de la zone d'affichage supérieur gauche du composant
        g.setConstraints(reset, gbc);
        panel.add(reset);
	}  

}