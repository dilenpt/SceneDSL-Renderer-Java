import java.awt.*;

class Text extends Image {
    private Point location;
    private String text;

    // Constructor that initializes the text color, location, and text content
    public Text(Color color, Point location, String text) {
        super(color);
        this.location = location;
        this.text = text;
    }

    // Draws the text using the Graphics object
    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics); // Set the text color
        graphics.drawString(text, location.x, location.y); // Draw the text at the specified location
    }
}