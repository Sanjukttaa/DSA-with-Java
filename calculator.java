import javax.swing.*;      //Provides Swing GUI components like JFrame, JButton, JTextField etc.
import java.awt.*;         //Provides layout managers and GUI utilities.
import java.awt.event.*;   //Provides classes and interfaces for event handling.

class Calculator
{
    // Static variables so they can be accessed from MyListener class.
    static JFrame frm;
    static JButton b1, b2, b3;
    static JTextField t1, t2, t3;

    public static void main(String [] rk)
    {
        // Creates a JFrame (window) object.
        JFrame frm = new JFrame("Sanjukta");

        // Sets the size of the frame.
        frm.setSize(1000, 600);

        // Closes the program when the user clicks the X button.
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Places the frame at the center of the screen.
        frm.setLocationRelativeTo(null);

        // Sets FlowLayout for arranging components left to right.
        frm.setLayout(new FlowLayout());

        // Creates buttons for different operations.
        b1 = new JButton("ADD");
        b2 = new JButton("SUBTRACT");
        b3 = new JButton("RESET");

        // Creates text fields.
        t1 = new JTextField("First Number");
        t2 = new JTextField("Second Number");
        t3 = new JTextField("RESULT");

        // Adds text fields to the frame.
        frm.add(t1);
        frm.add(t2);
        frm.add(t3);

        // Adds buttons to the frame.
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);

        // Creates an object of MyListener class.
        MyListener ml = new MyListener();

        // Registers the listener with all buttons.
        b1.addActionListener(ml);
        b2.addActionListener(ml);
        b3.addActionListener(ml);

        // Prevents the frame from being resized.
        frm.setResizable(false);

        // Makes the frame visible on the screen.
        frm.setVisible(true);
    }
}



// Listener class that handles button click events.
class MyListener implements ActionListener
{
    // This method automatically executes whenever a registered button is clicked.
    public void actionPerformed(ActionEvent ae)
    {
        // Checks whether the clicked button is ADD.
        if(ae.getActionCommand().equals("ADD"))
        {
            // Retrieves text entered in first text field.
            String first = Calculator.t1.getText();

            // Retrieves text entered in second text field.
            String second = Calculator.t2.getText();

            // Converts Strings into integers and adds them.
            int result =
                Integer.parseInt(first) +
                Integer.parseInt(second);

            // Displays the result in the third text field.
            Calculator.t3.setText("" + result);
        }

        // Checks whether the clicked button is SUBTRACT.
        else if(ae.getActionCommand().equals("SUBTRACT"))
        {
            // Code for subtraction can be written here.
        }

        // Checks whether the clicked button is RESET.
        else if(ae.getActionCommand().equals("RESET"))
        {
            // Clears the first text field.
            Calculator.t1.setText(null);

            // Clears the second text field.
            Calculator.t2.setText(null);

            // Clears the result text field.
            Calculator.t3.setText(null);
        }
    }
}    

