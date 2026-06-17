import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;       //Provides Swing GUI components like JFrame, JButton, etc.
import java.awt.*;         //Provides classes for colors, layouts, graphics, and other GUI utilities.
import java.io.File;

class TicTacToe
{
    public static void main(String [] args){

	JFrame frm = new JFrame( "Sanjukta");
	frm.setSize(600, 600);		//method called to set the size of Frame
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When the user clicks the X (close) button, the program terminates completely.
	frm.setLocationRelativeTo(null);	//To make the frame appear at the center of Screen	
	
	Color clr = new Color(255, 255, 153);
	frm.getContentPane().setBackground(clr);	
	frm.setTitle("Tic Tac Toe");		//To update the title of the Frame

	ImageIcon img = new ImageIcon("pic.jpg");
	JLabel lbl = new JLabel(img);
	frm.setContentPane(lbl);

	//Play the music
	
    try{
	File mymusic = new File("welcome.wav");		//File Object for the wav file
	AudioInputStream as = AudioSystem.getAudioInputStream(mymusic);
	Clip clp = AudioSystem.getClip();
	clp.open(as);
	clp.start();
	}
    catch(Exception ex) { System.out.println(ex); }
	frm.setResizable(false);     //To make the frame non-resizable
	frm.setVisible(true);   //Method called to make the frame Visible on the screen
    }
}