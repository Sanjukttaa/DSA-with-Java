import javax.swing.*;
import java.awt.*;

class TicTacToe
{
    public static void main(String [] rk)
    {
	JFrame frm = new JFrame( "Sanjukta");
	frm.setSize(600, 600);		//method called to set the size of Frame
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							//setting the clopse button functionality
	frm.setLocationRelativeTo(null);	//To make the frame appear at the center of Screen	
	// frm.setResizable(false);     //To make the frame non-resizable
	frm.setVisible(true);		//Method called to make the frame Visible
	Color clr = new Color(153, 255, 153);
	frm.getContentPane().setBackground(clr);	
	frm.setTitle("Tic Tac Toe");		//To update the title of the Frame
    }
}