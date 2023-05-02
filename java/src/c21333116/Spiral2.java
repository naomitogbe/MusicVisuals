package c21333116;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.*;


public class Spiral2 extends PApplet {


//Minim minim;
//AudioPlayer player;
//BeatDetect beat;

float angle = 0;
float[] offsets = new float[6];

public void setup() {
  
  colorMode(HSB, 360, 100, 100);
  background(0);
  noFill();
  strokeWeight(1);
  strokeCap(SQUARE);

  //minim = new Minim(this);
  //player = minim.loadFile("boysaliar.mp3");
  //beat = new BeatDetect(player.bufferSize(), player.sampleRate());

  //player.play();
}

public void settings(){

    size(1250, 500);
}

public void draw() {
  background(0);
  translate(width / 2, height / 2);

  //beat.detect(player.mix);

  //if (beat.isOnset()) {
    //angle += 0.02;
  //}

  float r1 = 150;
  float r2 = 50;
  float d = 100;

  float x = (r1 - r2) * cos(angle) + d * cos((r1 - r2) * angle / r2);
  float y = (r1 - r2) * sin(angle) - d * sin((r1 - r2) * angle / r2);

  float[] waveforms = {
    sin((float) (angle * 1.01)),
    sin((float) (angle * 1.53)),
    sin((float) (angle * 2.11)),
    sin((float) (angle * 3.01)),
    sin((float) (angle * 4.03)),
    sin((float) (angle * 5.01))
  };

  float[] waveformOffsets = {
    map(sin((float) (angle * 0.9)), -1, 1, -10, 10),
    map(sin((float) (angle * 1.1)), -1, 1, -10, 10),
    map(sin((float) (angle * 1.3)), -1, 1, -10, 10),
    map(sin((float) (angle * 1.5)), -1, 1, -10, 10),
    map(sin((float) (angle * 1.7)), -1, 1, -10, 10),
    map(sin((float) (angle * 1.9)), -1, 1, -10, 10)
  };

  for (int i = 0; i < 6; i++) {
    stroke(map(waveforms[i], -1, 1, 0, 360), 80, 100);
    float r = r2 * (i + 1);
    ellipse(x + waveformOffsets[i], y + waveformOffsets[(i + 3) % 6], r * 2 * waveforms[i], r * 2 * waveforms[i]);
    lerp(40, i, 20);
  }

  angle += 0.01;
}

}
