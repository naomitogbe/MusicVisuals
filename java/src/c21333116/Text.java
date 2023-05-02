package c21333116;

import ie.tudublin.Visual;
import processing.core.*;

public class Text extends Visual {

    PFont font;

    public void settings() {
        size(1200, 800, P3D);
    }

    public void setup() {
        font = createFont("Arial", 100, true);
        textFont(font);
    }

    public void draw() {
        background(0);

        // Set up camera position
        camera(width/2, height/2, 600, width/2, height/2, 0, 0, 1, 0);

        // Set up text properties
        fill(255);
        stroke(255);
        textSize(200);
        textAlign(CENTER, CENTER);

        // Create a new PGraphics object for 3D text
        PGraphics pg = createGraphics(width, height, P3D);

        // Render the text to the PGraphics object
        pg.beginDraw();
        pg.textFont(font);
        pg.text("Boys a liar", width/2, height/2);
        pg.endDraw();

        // Draw the PGraphics object to the screen as a texture-mapped shape
        beginShape(QUADS);
        texture(pg);
        vertex(0, 0, 0, 0, 0);
        vertex(width, 0, 0, pg.width, 0);
        vertex(width, height, 0, pg.width, pg.height);
        vertex(0, height, 0, 0, pg.height);
        endShape();
    }

}
