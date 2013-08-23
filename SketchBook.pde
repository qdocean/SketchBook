
import controlP5.*;

ControlP5 cp5;

float Thickness = 1;
Slider slider;

//int toolVar , colorVar;
void setup()
{
  size(displayWidth,displayHeight);
  background(255); 
  
  cp5 = new ControlP5(this);
  
  cp5.addSlider("Thickness")
     .setPosition(10,5)
     .setSize(displayWidth-20,15)
     .setRange(0,10)
     .setValue(1)
     .setLabelVisible(false)
     ;
     fill(0);
     rect(0,0,displayWidth,25);
}



void draw()
{
  strokeWeight (Thickness) ;
  line( pmouseX , pmouseY , mouseX , mouseY );
  // transmit because this gets called again and again in a loop
}








