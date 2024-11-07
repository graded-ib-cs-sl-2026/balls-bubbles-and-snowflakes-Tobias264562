

class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
    private Sketch s;
   
    private float radius;
    private float x;
    private float y;
    
    private float xSpeed;
    
    private float ySpeed;
   
    private int fillColor;

    

    public Snowflake(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 150;
        y = 150;
        xSpeed = 0;
        ySpeed = 4;
        fillColor = s.color(180,180, 255);
        
    }
    
    public void setColors(int fill) {
        
        fillColor = fill;
    }

    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
    }
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }
}

