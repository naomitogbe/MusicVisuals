package example;
//import processing.core.*;
import ie.tudublin.*;

public class Heart extends Visual{

  public void settings(){

    size(400, 400);
  }

  public void draw(){
    background(0);

    translate(width/2, height/2);

    noFill();
    stroke(255);
    beginShape();
    for (float a = 0; a < TWO_PI; a+= 0.01){
      float r = 10;
      float x = r * 16 * pow(sin(a), 3);
      float y = -r * (13 * cos(a) - 5 * cos(2 * a) - 2 * cos(3 * a) - cos(4 * a));
      vertex(x, y);
    }
    endShape();
  }
  
}
