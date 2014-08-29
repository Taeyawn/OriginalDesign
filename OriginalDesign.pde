void setup()
{
	size(600,600);
}
void draw()
{
  ears();
  face();
}

void face()
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
void ears()
{
	fill(5);
    ellipse(210,200,90,90);
    ellipse(390,200,90,90);
}