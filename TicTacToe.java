import javax.swing.*;       //Provides Swing GUI components like JFrame, JButton, etc.
import java.awt.*;         //Provides classes for colors, layouts, graphics, and other GUI utilities.

class TicTacToe
{
    public static void main(String [] args){

	JFrame frm = new JFrame( "Sanjukta");
	frm.setSize(600, 600);		//method called to set the size of Frame
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When the user clicks the X (close) button, the program terminates completely.
	frm.setLocationRelativeTo(null);	//To make the frame appear at the center of Screen	
	// frm.setResizable(false);     //To make the frame non-resizable
	frm.setVisible(true);		//Method called to make the frame Visible on the screen
	Color clr = new Color(255, 255, 153);
	frm.getContentPane().setBackground(clr);	
	frm.setTitle("Tic Tac Toe");		//To update the title of the Frame
    }
}