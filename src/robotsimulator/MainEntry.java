package robotsimulator;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import robotsimulator.gui.MainApplet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;

public class MainEntry {

	/**
	 * Main entry point for the program- added to allow creating runnable .jar files. 
	 * Just creates and runs MainApplet.
	 * Props to: http://stackoverflow.com/questions/14506704/how-to-generate-jar-file-with-no-main-method
	 * @param args
	 */
	
	//File paths
	//public static String resourcePath = System.getProperty("user.dir") + "/Resources";
	public static String resourcePath = "";
	public static String codePath = resourcePath + "/Code";
	public static String loadoutPath = resourcePath + "/Loadouts";
	public static String mazePath = resourcePath + "/Mazes";
	
	//Robot image
	public static ImageIcon robotSprite;
	
	//Reference to code service
	//@WebServiceRef(wsdlLocation="http://venus.eas.asu.edu/WSRepository/eRobotic/DataService/Service.svc?wsdl")
	
	public static void main(String[] args) 
	{
		MainApplet m = new MainApplet();
		m.init();
		m.start();
		
		JFrame window = new JFrame("Robot Simulator");
		window.setContentPane(m);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);	
		
	}

}
