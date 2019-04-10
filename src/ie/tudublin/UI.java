package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();

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
		loadResistor();
		printColours();
	}

	public void loadColours()
	{
		Table table = new loadTable("colours.csv", "header");

		for (TableRow Row : table.rows())
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

	public void loadResistor()
	{
		Table resistors = new loadTable("resistor.csv", "header");

		for (TableRow Row : table.rows())
		{
			Resistor r = new Resistor();
		}
	}
	
	public void draw()
	{			

	}
}
