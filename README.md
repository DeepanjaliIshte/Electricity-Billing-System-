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

<h2>--------Conn class--------</h2>
<h6>The Conn class is a utility class for establishing a connection to a MySQL database and creating a Statement object to execute SQL queries.</h6>

Key Components
<h4>Instance Variables</h4>
<h6>Connection c: Stores the connection to the database.<br>
Statement s: Used to execute SQL statements.</h6>

<h4>Constructor (Conn)</h4>
<h6>Establishes a connection to the MySQL database using DriverManager.getConnection with the provided URL, username, and password.<br>
Initializes the Statement object s using the connection c.</h6>
  
<h4>Exception Handling</h4>
<h6>The constructor throws SQLException, which must be handled by any class that instantiates Conn.</h6>


<h2>--------Project class--------</h2>
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

<h2>--------CustomerDetails class--------</h2>
<h6>The CustomerDetails class is a GUI application built using Java Swing to display and print customer details from a database. It extends JFrame and implements the ActionListener interface.</h6>
Key Components
<h4>Instance Variables</h4>
<h6>Choice meternumber, cmonth: (not used in the current implementation but likely intended for filtering).
JTable table: Displays customer details in a table format.<br>
JButton search, print: Buttons for search and print actions (only print is used in the current implementation).</h6>

<h4>Constructor (CustomerDetails)</h4>
<h6>Sets up the JFrame properties: title, size, and location.<br>
Initializes the JTable to display customer details.<br>
Connects to the database using the Conn class and executes a SQL query to retrieve customer details.<br>
Uses DbUtils.resultSetToTableModel to populate the JTable with the query results.<br>
Adds the table to a JScrollPane and adds it to the JFrame.<br>
Adds a "Print" button and sets up its action listener.<br>
Makes the JFrame visible.</h6>

<h4>Action Listener (actionPerformed)</h4>
<h6>Handles the print action for the table. When the "Print" button is clicked, it prints the contents of the table.</h6>

<h4>Main Method</h4>
<h6>Creates an instance of CustomerDetails, triggering the GUI to display.</h6>

<h2>--------CalucalteBill Class--------</h2>
The CalculateBill class is a GUI application for calculating and managing electricity bills. It extends JFrame and implements the ActionListener interface to handle user interactions.

Key Components
<h4>Instance Variables</h4>

<h6>JTextField tfname, tfaddress, tfstate, tfunits, tfemail, tfphone: (unused in the current implementation but intended for additional customer details).<br>
JButton next, cancel: Buttons for submitting and canceling.<br>
JLabel lblname, labeladdress: Labels to display customer name and address.<br>
Choice meternumber, cmonth: Dropdowns for meter number and month selection.<br>
JTable table: (not used in the current implementation).</h6>

<h4>Constructor (CalculateBill)</h4>
<h6>Sets up the JFrame properties: size, location, and background color.<br>
Initializes a JPanel with a null layout for custom component positioning.<br>
Adds various JLabel and JTextField components for user inputs and displays.<br>
Populates the Choice component for meter numbers with data from the customer table.<br>
Adds an ItemListener to update customer details when the meter number changes.<br>
Adds a Choice component for selecting the month.<br>
Adds "Submit" and "Cancel" buttons with associated action listeners.<br>
Adds an image to the west of the frame.<br>
Configures layout and visibility of the frame.</h6>
  
<h4>Action Listener (actionPerformed)</h4>
<h5>Submit Button (next):</h5>
<h6>Retrieves selected meter number, units consumed, and month.<br>
Calculates the total bill based on unit cost and other charges from the tax table.<br>
Inserts the calculated bill into the bill table with the status "Not Paid".<br>
Displays a confirmation message and hides the current window.</h6>
<h4>Cancel Button:</h4>
<h6>Closes the current window.</h6>
<h4>Main Method</h4>
<h6>Creates an instance of CalculateBill, triggering the GUI to display.</h6>

<h2>--------BillDetails Class--------</h2>
The BillDetails class extends JFrame and is used to display bill details in a table format. Here's a summary of the key components and functionality:

<h4>Constructor (BillDetails(String meter)):</h4>
<h5>Size and Location:</h5><h6> Sets the window size to 700x650 pixels and positions it at (400, 150) on the screen.</h6>
<h5>Background:</h5><h6> Sets the background color of the content pane to white.</h6>
<h5>Table Initialization:</h5><h6> Creates a JTable to display data.</h6>
Database Query:<h6> Establishes a connection to the database using the Conn class (presumed to be defined elsewhere). It queries the bill table for records where the meter_no matches the provided meter value.</h6>
<h5>ResultSet to Table Model:</h5><h6> Uses DbUtils.resultSetToTableModel(rs) to convert the ResultSet into a table model for the JTable.</h6>
<h5>Scroll Pane:<h5> <h6>Wraps the JTable in a JScrollPane to handle large data sets and adds it to the frame.</h6>
<h5>Visibility:</h5> <h6> Sets the frame to be visible.</h6>

<h4>Main Method (main(String[] args)):</h4>
<h6>Creates an instance of BillDetails with an empty string for the meter number, which likely won't display any data unless a valid meter number is provided.</h6>
  
<h6>Note: This code relies on an external Conn class for database connection and DbUtils for converting ResultSet to a table model. </h6>

<h2>--------MeterInfo Class--------</h2>
<h6>The MeterInfo class is a Swing-based GUI for inputting and submitting meter information. </h6>

Key Components
<h4>Class Declaration and Constructor:</h4>
<h5>MeterInfo(String meternumber):</h5> <h6>The constructor initializes the frame and sets up the GUI components.</h6>
<h5>Frame Properties:</h5> <h6>Sets the size (700x500 pixels) and location (400, 200) of the window.</h6>
<h5>Panel (JPanel p):</h5><h6> Uses a JPanel with a null layout manager to position components manually and sets its background color.</h6>

<h4>GUI Components:</h4>
<h5>Labels (JLabel):</h5> <h6>Display static text and meter information.</h6>
<h5>Text Fields (JTextField): <h6>Used for entering various meter details. (Though JTextField instances are defined, they are not used in the current code.)</h6>
<h5>Choice (Choice):</h5><h6> Dropdown menus for selecting meter location, type, phase code, and bill type.</h6>
<h5>Buttons (JButton):</h5><h6> A "Submit" button that triggers the action event.</h6>

<h4>Layout and Appearance:</h4>
<h5>Heading:</h5><h6> A JLabel displaying "Meter Information" at the top of the panel.<br>
<h5>Image:</h5><h6> An ImageIcon added to the left side of the frame for visual enhancement.<br>
<h5>Background:</h5> <h6>Sets the background color of the content pane to white.</h6>

<h4>Action Handling:</h4>
<h5>actionPerformed(ActionEvent ae):</h5><h6> Handles the "Submit" button click:
Retrieves values from the Choice components and constructs an SQL query to insert the data into the meter_info table.<br>
Uses a Conn class to execute the SQL update query.<br>
Displays a success message and hides the window upon successful submission.<br>
Catches and prints any exceptions that occur during database operations.</h6>

<h4>Main Method:</h4>
<h6>main(String[] args): Creates an instance of MeterInfo with an empty string for the meter number, which will not display actual data unless a valid meter number is provided.</h6>

<h2>--------ViewCustomer Class--------</h2>
<h2>--------UpdateCustomer Class--------</h2>
<h2>--------PayBill Class--------</h2>
<h2>--------Paytm Class--------</h2>
<h2>--------GenerateBIll Class--------</h2>
