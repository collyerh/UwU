import java.util.Scanner;
import java.util.Random;

public class Test1{
    
    public static void main(String []args){

    GameArena mainArena = new GameArena(1000,1000);
    Ball ball1 = new Ball(10,10,10,"YELLOW");
    ball1.setSize(100);
    ball1.setXPosition(500);
    ball1.setYPosition(500);


    Rectangle rectangle1 = new Rectangle(100,100,100,100,"RED");
    rectangle1.setXPosition(50);
    rectangle1.setYPosition(50);

    mainArena.addRectangle(rectangle1);
    mainArena.addBall(ball1);

    boolean hg = mainArena.spacePressed();

    while(true) {

    double current = ball1.getXPosition();
    mainArena.pause();
    ball1.setXPosition(current + 1);

    if(ball1.getXPosition() == 1000) {

        ball1.setXPosition(0);

    }

    }

    
}
}