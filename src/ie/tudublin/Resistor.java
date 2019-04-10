package ie.tudublin;

public class Resistor
{
    public int r;
    public int g;
    public int b;
    UI ui;

    public Resistor(UI ui)
    {
        // r = this.r;
        // g = this.g;
        // b = this.b;
        ui = this.ui;
    }

    public void render()
	{
        int centre = 150;
		int middle = ui.width / 2;
        int girth = 50;
        

		ui.stroke(0);
		ui.line(middle - 50, centre, middle - 100, centre);
		ui.line(middle + 50, centre, middle + 100, centre);

		ui.line(middle - 50, centre + girth, middle + 50, centre + girth);
		ui.line(middle - 50, centre - girth, middle + 50, centre - girth);

		ui.line(middle - 50, centre + girth, middle - 50, centre - girth);
		ui.line(middle + 50, centre + girth, middle + 50, centre - girth);

		//fill();
		ui.rect(middle - 40, centre - girth, 15, 100);
		ui.rect(middle - 20, centre - girth, 15, 100);
		ui.rect(middle, centre - girth, 15, 100);
	}

}