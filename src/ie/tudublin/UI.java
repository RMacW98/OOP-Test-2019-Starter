package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	//private ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	Resistor resistor;

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);


	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup()
	{
		loadColours();
		printColours();
		resistor = new Resistor(this);
		// loadResistor();
		// printResistor();
	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");

		for (TableRow row : table.rows())
		{
			Colour c = new Colour();
		}
	}

	public void printColours()
	{
		for (Colour c : colours)
		{
			System.out.println(c);
		}
	}

	public void findColours(int value)
	{

	}

	// public void loadResistor()
	// {
	// 	Table table = loadTable("resistors.csv", "header");

	// 	for (TableRow row : table.rows())
	// 	{
	// 		Resistor r = new Resistor();
	// 	}
	// }

	// public void printResistor()
	// {
	// 	for (Resistor r : resistors)
	// 	{
	// 		System.out.println(r);
	// 	}
	// }
	public int centre = 150;

	public void render()
	{
		int middle = width / 2;
        int girth = 50;
        

		stroke(0);
		line(middle - 50, centre, middle - 100, centre);
		line(middle + 50, centre, middle + 100, centre);

		line(middle - 50, centre + girth, middle + 50, centre + girth);
		line(middle - 50, centre - girth, middle + 50, centre - girth);

		line(middle - 50, centre + girth, middle - 50, centre - girth);
		line(middle + 50, centre + girth, middle + 50, centre - girth);

		fill(165, 42, 42);
		rect(middle - 40, centre - girth, 15, 100);
		fill(100, 100, 100);
		rect(middle - 20, centre - girth, 15, 100);
		fill(255, 255, 0);
		rect(middle, centre - girth, 15, 100);
	}


	public void draw()
	{
		for(int i = 0; i < 4; i++)
		{
			//resistor.render();
			render();
			centre = centre + 150;
		}	
		

	}
}
