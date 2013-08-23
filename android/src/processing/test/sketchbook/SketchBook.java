package processing.test.sketchbook;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SketchBook extends PApplet {




ControlP5 cp5;

float Thickness = 1;
Slider slider;

//int toolVar , colorVar;
public void setup()
{
 
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



public void draw()
{
  strokeWeight (Thickness) ;
  line( pmouseX , pmouseY , mouseX , mouseY );
  // transmit because this gets called again and again in a loop
}









  public int sketchWidth() { return displayWidth; }
  public int sketchHeight() { return displayHeight; }
}
