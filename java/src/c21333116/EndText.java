package c21333116;

import processing.core.PApplet;

public class EndText extends PApplet {
  String textToMove = "Boy's a Liar";
  int yPos = 0;
  
  public void settings() {
    size(600, 400);
  }
  
  public void draw() {
    background(0); // Set background color to black
    fill(255); // Set text color to white
    textAlign(CENTER, CENTER);
    textSize(32);
    text(textToMove, width/2, yPos);
    
    // Move the text downwards by 2 pixels
    yPos += 2;
    
    // Reset the text position when it goes beyond the screen
    if (yPos > height) {
      yPos = 0;
    }
  }
  
  public static void main(String[] args) {
    PApplet.main(EndText.class);
  }
}