import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(600,600);
}
public void draw()
{
  ears();
  face();
}

public void face()
{
	fill(255);
	ellipse(300,300,300,300);
	fill(0);
	ellipse(240,260,80,50);
	ellipse(360,260,80,50);
	ellipse(300,320,45,25);
	fill(255);
	ellipse(250,260,30,30);
	ellipse(370,260,30,30);
	strokeWeight(8);
	line(300,320,300,350);
	line(280,350,320,350);
}
public void ears()
{
	fill(5);
    ellipse(210,200,90,90);
    ellipse(390,200,90,90);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
