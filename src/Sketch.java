import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;
    private Snowflake sf1;
    private Snowflake sf2;
    private Snowflake sf3;
    private Snowflake sf4;
    private boolean isPaused = false;
    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);
        ball2 = new Ball(this,50,200,200,3,2);
        ball3 = new Ball(this,40,50,50,3,4);
        ball4 = new Ball(this,30,80,300,5,3);
        bubble1 = new Bubble(this);
        bubble2 = new Bubble(this,30, 50, 50, -3, -3);
        bubble3 = new Bubble(this,20,30,30,-4,-5);
        bubble4 = new Bubble(this,40,200,200,-3,-2);
        sf1 = new Snowflake(this);
        sf2 = new Snowflake(this,70,30,20,2,4);
        sf3 = new Snowflake(this,50,140,140,3,4);
        sf4 = new Snowflake(this,20,-20,-20,-3,2);

    }




    
    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {

/**
 * isPaused is a boolean variable that identifies wether its true or false that we pause the animation. S if true, G if false.
 * keyPressed is a boolean that’s true whenever any key is pressed, and false when no keys are pressed.
 */
        if (keyPressed) {
            if (key == 'S' || key == 's') {
                isPaused = true;
            } else if (key == 'G' || key == 'g') {
                isPaused = false; 
        }
    }

        if (!isPaused) {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball2.setColors(color(100,255,0),color(14, 222, 237));
        ball3.draw();
        ball3.move();
        ball3.setColors(color(200,0,20),color(0,0,0));
        ball4.draw();
        ball4.move();
        ball4.setColors(color(40,14,200),color(185, 237, 14));
        ball1.checkCollision(ball2);
        ball1.checkCollision(ball3);
        ball1.checkCollision(ball4);
        ball2.checkCollision(ball3);
        ball2.checkCollision(ball4);
        ball3.checkCollision(ball4);
        bubble1.draw();
        bubble1.move();
        bubble1.setColors(color(180,180,255,50),color(0,0,0));
        bubble2.draw();
        bubble2.move();
        bubble2.setColors(color(180,180,255,50),color(0,0,0));
        bubble3.draw();
        bubble3.move();
        bubble3.setColors(color(180,180,255,50),color(0,0,0));
        bubble4.draw();
        bubble4.move();
        bubble4.setColors(color(180,180,255,50),color(0,0,0));
        sf1.draw();
        sf1.move();
        sf2.draw();
        sf2.move();
        sf3.draw();
        sf3.move();
        sf4.draw();
        sf4.move();

        }
        
    }   
  


    

  
    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
