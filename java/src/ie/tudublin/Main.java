package ie.tudublin;

import c21333116.YASC;
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
<<<<<<< HEAD
	}*/
=======
	}
	public static void yasc()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());
    }

>>>>>>> dfd3854bfd55dc8d52426519422be5b61965a018
	public static void main(String[] args)
	{
		Main main = new Main();
		//main.startUI();	
		//main.heart();

		//main.startUI();	
<<<<<<< HEAD
		main.cube();
		//main.rot();			
=======
		//main.cube();
		main.rot();			
		yasc();
>>>>>>> dfd3854bfd55dc8d52426519422be5b61965a018
	}
}