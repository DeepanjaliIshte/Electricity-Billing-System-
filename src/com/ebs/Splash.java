package com.ebs;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.lang.Thread;

public class Splash extends JFrame implements Runnable
		/* Declares the Splash class. It extends JFrame, meaning it inherits all the
		 * properties and behaviors of a JFrame, making it a window. It also implements
		* Runnable, meaning it can be run on a separate thread. */
{
	private Thread t;
	// constructor
	public Splash() 
	{
		ImageIcon imgicon=new ImageIcon(ClassLoader.getSystemResource("img/elect.jpg"));	//Loads an image from the resources using the ClassLoader. The image path is "img/elect.jpg"
		Image img=imgicon.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT); //Scales the loaded image to 730x550 pixels, maintaining the default scaling algorithm.
		ImageIcon icon=new ImageIcon(img);	//Creates a new ImageIcon object with the scaled image.
		JLabel image=new JLabel(icon);	//Creates a JLabel and sets the ImageIcon as its icon, effectively displaying the image.
		add(image); 	//Adds the JLabel (with the image) to the JFrame
		
		 setVisible(true);
		 //Makes the frame visible on the screen.
		 
	        int x = 1;	// Initializes a variable x to 1, used for incremental size adjustments.
	        for (int i = 2; i < 600; i+=4, x+=1) //Starts a loop that will run from 2 to 600, incrementing i by 4 and x by 1 in each iteration.
	        {
	            setSize(i + x, i);	//Sets the size of the frame, gradually increasing its width and height.
	            setLocation(700 - ((i + x)/2), 400 - (i/2)); //Centers the frame on the screen as it grows.
	            try 
	            {
	                Thread.sleep(5);
	            }
	            catch (Exception e) 
	            {
	                e.printStackTrace();
	            }
	            //try and catch block Pauses the loop for 5 milliseconds to create a smooth animation effect. Catches and prints any exceptions that occur.
	        }
	        
	        t = new Thread(this);  //initializes the thread t with the current object (this), which implements Runnable.
	        t.start(); // Starts the thread, which calls the run() method.

	        
	        setVisible(true); //Ensures the frame remains visible (though this line is somewhat redundant here).
	    }
	    
	    public void run() //Defines the run() method from the Runnable interface.
	    {
	        try {
	            Thread.sleep(7000);//Pauses the thread for 7 seconds (7000 milliseconds), keeping the splash screen visible for this duration.
	            setVisible(false);//Hides the splash screen after the delay.
	            
	           // login frame	
	           new Login(); //Placeholder for initializing a new login frame after the splash screen is hidden.
	        }
	        catch (Exception e) //Catches and prints any exceptions that occur.
	        {
	            e.printStackTrace();
	        }
	        
	    }
	public static void main(String[] args) 
	{
		new Splash();	// Creates a new instance of the Splash class, which triggers the constructor and starts the splash screen animation.
	}
}
