package ie.tudublin;

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
		main.cube();
		//main.rot();			
	}
}