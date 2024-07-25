# Electricity-Billing-System-

<h2>Splash Class</h2>
<h6>
The Splash class displays an animated splash screen that grows in size over a short period.<br>
It uses Java Swing components (JFrame, JLabel, ImageIcon) to create and display the window.<br>
The splash screen is shown for 7 seconds before it disappears.<br>
The animation and timing are handled using a loop and a separate thread.<br>
</h6>
<br>

<h2>Login Class</h2>
<h6>
  The Login class creates a graphical user interface (GUI) for logging into an application. It allows users to input their username, password, and select their role (Admin or Customer). The class handles login authentication, and provides options to cancel or sign up.<br></h6>

Key Components :
<h4>Instance Variables: </h4>
  <h6> JButton for login, cancel, and signup actions.<br>
    JTextField for username and password inputs.<br>
    Choice for selecting the user type (Admin or Customer).</h6>

<h4>Constructor:</h4>
<h6>Sets up the JFrame window with a title, background color, and null layout for absolute positioning.<br>
Adds labels, text fields, choice menu, and buttons to the window with specified positions and sizes.<br>
Adds images to buttons and positions them appropriately.<br>
Sets the window size, location, and visibility.</h6>

<h4>Action Event Handling:</4>
<h6>Implements the ActionListener interface to handle button click events.<br>
Login Button: Retrieves user inputs, constructs an SQL query, and verifies credentials from the database. If valid, opens a new Project window; otherwise, shows an error message.<br>
Cancel Button: Closes the login window.<br> 
Signup Button: Opens a new Signup window. </h6>

<h4>Main Method:</h4>
<h6>Creates an instance of the Login class to display the login window.</h6> <br>

<h2>Signup class </h2>
<h6>The Signup class is a Java Swing-based GUI application that allows users to create a new account. It provides options for users to sign up either as an Admin or as a Customer. The class extends JFrame and implements ActionListener to handle button click events.</h6>

Key Components
Instance Variables

<h6>JButton create, back: Buttons for creating an account and going back to the login screen.
Choice accountType: Dropdown menu to select the account type (Admin or Customer).
JTextField meter, username, name, password: Text fields for meter number, username, name, and password input.</h6>

<h4>Constructor (Signup)</h4>
<h6>Sets the frame bounds, background color, and layout.<br>
Creates a JPanel with a titled border to hold the form elements.<br>
Adds labels and text fields for username, meter number, name, and password.<br>
Adds focus and item listeners to handle specific interactions.<br>
Adds buttons for creating an account and going back.<br>
Adds an image to the panel for visual enhancement.<br>
Sets the visibility of the frame.
<h4>Event Handling (actionPerformed method)</h4>
Handles the click events for the create and back buttons.
<h5>Create Button:</h5>
Retrieves user inputs and constructs an SQL query to insert or update the database based on the account type.<br>
Executes the SQL query and displays a success message.<br>
Navigates back to the login screen.
<h5>Back Button:</h5>
Navigates back to the login screen without making any changes.

<h4>Main Method</h4>
Creates an instance of the Signup class to display the signup form.
Detailed Explanation

<h4>Constructor</h4>

Sets up the main frame with size, background color, and layout. <br>
Creates and configures a panel to hold the form elements.<br>
Adds labels and text fields for user inputs, positioning them within the panel.<br>
Adds a focus listener to the meter number field to fetch and display the name associated with the meter number.<br>
Adds an item listener to the account type choice to show/hide the meter number field based on the selected account type.<br>
Adds buttons for creating an account and navigating back, with action listeners attached.<br>
Adds an image for visual appeal and sets the frame's visibility.<br>

<h4>Event Handling</h4>
The actionPerformed method handles actions based on the source of the event (create or back button).<br>
For the create button, it constructs and executes an SQL query to either insert a new record (for Admin) or update an existing record (for Customer) in the login table.<br>
Displays a message indicating successful account creation and navigates back to the login screen.<br>
For the back button, it simply navigates back to the login screen.<br>

<h4>Main Method</h4>
The main method initializes the signup form by creating an instance of the Signup class.</h6>
