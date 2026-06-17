import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;       //Provides Swing GUI components like JFrame, JButton, etc.
import java.awt.*;         //Provides classes for colors, layouts, graphics, and other GUI utilities.
import java.io.File;
import java.awt.event.*;   //Provides classes for event handling.

class TicTacToe
{
    static JFrame frm;
    static JButton b1, b2;

    public static void main(String [] args)
    {
        frm = new JFrame("Sanjukta");
        frm.setSize(500, 500);      //Method called to set the size of Frame
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminates the program when X button is clicked.
        frm.setLocationRelativeTo(null); //Makes the frame appear at the center of the screen

        ImageIcon img = new ImageIcon("pic.jpg");
        JLabel lbl = new JLabel(img);   //Creates a label containing the image.
        frm.setContentPane(lbl);        //Makes the image label the entire content area of the frame.

        //Play the music
        try
        {
            File mymusic = new File("welcome.wav"); //File Object for the wav file
            AudioInputStream as = AudioSystem.getAudioInputStream(mymusic); //Converts the WAV file into an audio stream.
            Clip clp = AudioSystem.getClip(); //Creates an audio clip object.
            clp.open(as);
            clp.start(); //Starts playing the music
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

        frm.setLayout(new FlowLayout()); //Arranges components in a row

        b1 = new JButton("Submit"); //Creates Submit button
        b2 = new JButton("Reset");  //Creates Reset button

        frm.add(b1); //Adds Submit button to frame
        frm.add(b2); //Adds Reset button to frame

        MyListener ml = new MyListener(); //Creates Listener class object

        b1.addActionListener(ml); //Registers listener with Submit button
        b2.addActionListener(ml); //Registers listener with Reset button

        frm.setResizable(false); //To make the frame non-resizable
        frm.setVisible(true);    //Method called to make the frame visible on the screen
    }
}

class MyListener implements ActionListener
{
    public void actionPerformed(ActionEvent ae) //This method is automatically called whenever a registered button is clicked.
    {
        if(ae.getActionCommand().equals("Submit"))
        {
            JOptionPane.showConfirmDialog(
                TicTacToe.frm,
                "Data Saved Successfully!"
            ); //Displays a confirmation dialog box
        }

        else if(ae.getSource() == TicTacToe.b2)
        {
            JOptionPane.showMessageDialog(
                TicTacToe.frm,
                "Data Reset Successfully!"
            ); //Displays a message dialog box
        }
    }
}