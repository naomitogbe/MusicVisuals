package ie.tudublin;

import c21333116.YASC;
import c21333116.textie;

import javax.swing.JFrame;


import c21333116.Spiral2;
import example.Spiral;
import c21333116.Text;
import example.CubeVisual;
import example.Heart;
import example.MyVisual;
import example.RotatingAudioBands;

public class Main
{	

	public void cube()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}
	public void rot()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());		
	}
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}


	public void spiral()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Spiral());		
	}

	public void spiral2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Spiral2());		
	}





	/*public void heart()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Heart());		
	}*/
	public static void main(String[] args)
	{
		Main main = new Main();
		//main.startUI();	
		//main.heart();

		//main.startUI();	

		//main.cube();
		//main.rot();			

		//main.cube();
		//main.rot();			
		//yasc();
		//main.spiral();
		main.spiral2();
	
	}
	
	}
