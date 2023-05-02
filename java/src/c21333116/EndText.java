package c21333116;

import processing.core.PApplet;

public class EndText extends PApplet {
  String textToMove = "Boy's a Liar pt.2";
  int yPos = 0;
  
  public void settings() {
    size(600, 400);
  }
  
  public void draw() {
    background(0);
    fill(255); 
    textAlign(CENTER, CENTER);
    textSize(32);
    text(textToMove, width/2, yPos);
    
    // Moves the text downwards by 2 pixels
    yPos += 2;
    
    // Resets the text position when it goes beyond the screen
    if (yPos > height) {
      yPos = 0;
    }
  }
  
  public static void main(String[] args) {
    PApplet.main(EndText.class);
  }
}