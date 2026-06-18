import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

class LoginPage{
    static JFrame frame;
    static JButton submit, reset;
    static JTextField user;
    static JPasswordField password;
    static JComboBox <String> type;
    static JLabel title;
   
    public static void main(String [] args){
	JFrame frame = new JFrame( "My Application");
	frame.setSize(700, 700);		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	frame.setLocationRelativeTo(null);
	frame.getContentPane().setBackground(Color.CYAN);
	frame.setLayout(null);


	//Create Fonts

	Font heading = new Font(Font.SERIF, 1, 40);
	Font normal = new Font(Font.MONOSPACED, 1, 24);

	//Create Components

	submit = new JButton("Submit");		
	reset = new JButton("Reset");
	user = new JTextField("User Name");
	user.setFont(normal);
	password = new JPasswordField();
	password.setFont(normal);

	title = new JLabel("Student Management System");
	title.setFont(heading);
	title.setForeground(Color.RED);

	String [] types = { "-- Select Type --", "Admin", "Student", "Guest"};
	type = new JComboBox<String>(types);
	type.setFont(normal);

	frame.add(title);			title.setBounds(100, 50, 500, 80);
	frame.add(user);			user.setBounds(150, 180, 400, 50 );
	frame.add(password);		password.setBounds(150, 250, 400, 50 );
	frame.add(type);			type.setBounds(150, 320, 400, 50 );

	frame.add(submit);		submit.setBounds(200, 390, 135, 50);
	frame.add(reset);			reset.setBounds(350, 390, 135, 50);

	submit.addActionListener( 
				(ae) -> { 		new HomePage(); 
							frame.setVisible(false);
					    }  );

	frame.setVisible(true);
   }
}


class HomePage
{
    static JFrame home;
   
    HomePage()
    {
	JFrame home = new JFrame( "Home Page");
	home.setSize(700, 700);		
	home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	home.setLocationRelativeTo(LoginPage.frame);
	home.getContentPane().setBackground(Color.YELLOW);
	home.setLayout(null);
	home.setVisible(true);
   }
}