package example;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    MyVisual mv;
    float cy = 0;

    public WaveForm(MyVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height / 2;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            //a stroke is what im having

            mv.line(i, cy, i, mv.width);
            //mv.line(i, cy, cy + cy * mv.getAudioBuffer().get(i), i ); super man S
            //mv.line(i, cy, i, cy + cy * mv.getAudioBuffer().get(i) );
            //mv.line(i, cy, i + mv.width, cy + cy * mv.getAudioBuffer().get(i) );
            //mv.line(i, mv.width, i, cy + cy * mv.getAudioBuffer().get(i) ); //cone thing
        }
    }
}