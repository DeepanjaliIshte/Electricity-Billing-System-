# Electricity-Billing-System-

<h2>Splash Class</h2>
<h5>
The Splash class displays an animated splash screen that grows in size over a short period.<br>
It uses Java Swing components (JFrame, JLabel, ImageIcon) to create and display the window.<br>
The splash screen is shown for 7 seconds before it disappears.<br>
The animation and timing are handled using a loop and a separate thread.<br>
</h5>
<br>

<h2>Login Class</h2>
<h5>
  The Login class creates a graphical user interface (GUI) for logging into an application. It allows users to input their username, password, and select their role (Admin or Customer). The class handles login authentication, and provides options to cancel or sign up.<br></h5>

Key Components :
<h4>Instance Variables: </h4>
  <h5> JButton for login, cancel, and signup actions.<br>
    JTextField for username and password inputs.<br>
    Choice for selecting the user type (Admin or Customer).</h5>

<h4>Constructor:</h4>
<h5>Sets up the JFrame window with a title, background color, and null layout for absolute positioning.<br>
Adds labels, text fields, choice menu, and buttons to the window with specified positions and sizes.<br>
Adds images to buttons and positions them appropriately.<br>
Sets the window size, location, and visibility.</h5>

<h4>Action Event Handling:</4>
<h5>Implements the ActionListener interface to handle button click events.<br>
Login Button: Retrieves user inputs, constructs an SQL query, and verifies credentials from the database. If valid, opens a new Project window; otherwise, shows an error message.<br>
Cancel Button: Closes the login window.<br> 
Signup Button: Opens a new Signup window. </h5>

<h4>Main Method:</h4>
<h5>Creates an instance of the Login class to display the login window.</h5> <br>
