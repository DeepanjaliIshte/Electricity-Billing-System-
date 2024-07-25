# Electricity-Billing-System-

<h2>--------Splash Class--------</h2>
<h6>
The Splash class displays an animated splash screen that grows in size over a short period.<br>
It uses Java Swing components (JFrame, JLabel, ImageIcon) to create and display the window.<br>
The splash screen is shown for 7 seconds before it disappears.<br>
The animation and timing are handled using a loop and a separate thread.<br>
</h6>
<br>

<h2>--------Login Class--------</h2>
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

<h2>--------Signup class-------- </h2>
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
Sets the visibility of the frame.</h6>

<h4>Event Handling (actionPerformed method)</h4>
<h6>Handles the click events for the create and back buttons.</h6>
<h5>Create Button:</h5>
<h6>Retrieves user inputs and constructs an SQL query to insert or update the database based on the account type.<br>
Executes the SQL query and displays a success message.<br>
Navigates back to the login screen.</h6>
<h5>Back Button:</h5>
<h6>Navigates back to the login screen without making any changes.</h6>

<h4>Main Method</h4>
<h6>Creates an instance of the Signup class to display the signup form.</h6>

<h2>Project class</h2>
<h6>The Project class is the main GUI window for an application, designed to handle different user roles (Admin and Customer) and provide various functionalities through a menu bar. The class extends JFrame and implements ActionListener to handle user interactions.</h6>

<h4>Constructor (Project)</h4>
<h5>Initialization</h5>
<h6>Assigns the atype and meter variables.<br>
Maximizes the window using setExtendedState(JFrame.MAXIMIZED_BOTH).</h6>h6>
<h5>Background Image</h5>
<h6>Loads an image (elect1.jpg) and scales it to fit the frame.
Adds the image to a JLabel and then adds the label to the frame.</h6>
<h5>Menu Bar</h5>
<h6>Creates a JMenuBar and sets it as the frame's menu bar.<br>
Adds menus and menu items with icons, mnemonics, accelerators, and action listeners.<br>
Menus are customized based on the account type:<br>
Admin: Access to "Master" menu.<br>
Customer: Access to "Information", "User", and "Report" menus.<br>
Adds common menus like "Utility" and "Exit" for all users.</h6>
<h5>Layout and Visibility</h5>
<h6>Sets the layout to FlowLayout.<br>
Makes the frame visible.</h6>

<h4>Action Listener Method (actionPerformed)</h4>
<h6>Responds to menu item selections by performing specific actions:<br>
Opens different windows (e.g., NewCustomer, DepositDetails).<br>
Executes system commands for Notepad and Calculator.<br>
Hides the current window and opens the login window for "Exit".<br>
Opens specific user-related windows like PayBill and GenerateBill using the meter number.<br></h6>
<h4>Main Method</4>
<h6>Initializes the Project class with empty strings for atype and meter.</h6>
