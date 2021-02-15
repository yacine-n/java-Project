import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddImage 
{

 public static void main(String[] args) 
 {
  
     //Création de JFrame
     JFrame frame = new JFrame("Accueil");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(530,600);
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);
     
     //URL de l'image
     String imgUrl="image.png";
     
     ImageIcon icone = new ImageIcon(imgUrl);
  
     //Création de JLabel avec un alignement gauche
     JLabel jlabel = new JLabel(icone, JLabel.LEFT);
     
  
     //ajouter les deux JLabel a JFrame
     frame.getContentPane().add(jlabel);
     
     frame.validate();
 }
}