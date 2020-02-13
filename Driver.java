import java.util.Scanner;
import java.util.Random;

public class Driver{
    public static void main(String []args){
        System.out.println("Enter number of balls:");
        Scanner Reader = new Scanner(System.in);
        int yeet = Reader.nextInt();

        Random rand = new Random();
        Ball[] ballArray = new Ball[yeet];
        GameArena mainArena = new GameArena(1000,1000);

        for(int i = 0; i<yeet; i++){
            ballArray[i] = new Ball(500,500,100,"BLUE", rand.nextInt(360));
            mainArena.addBall(ballArray[i]);
        }   
        // ballArray[0] = new Ball(420,69,100,"BLUE");
        // ballArray[1] = new Ball(666,920,100,"RED");
        // ballArray[2] = new Ball(820,990,100,"GREEN");
        // mainArena.addBall(ballArray[0]);
        // mainArena.addBall(ballArray[1]);
        // mainArena.addBall(ballArray[2]);
        while(true){
            for(int i = 0; i<3; i++){ 
                ballArray[i].setXPosition((ballArray[i].getXPosition()+ballArray[i].getxEdge()));
                ballArray[i].setYPosition((ballArray[i].getYPosition()+ballArray[i].getyEdge()));

                if (ballArray[i].getXPosition() == 0 || ballArray[i].getXPosition() == 1000){
                    ballArray[i].flipx();
                }
                if (ballArray[i].getYPosition() == 0 || ballArray[i].getYPosition() == 1000){
                    ballArray[i].flipy();
                }
            }
        try
        {
            Thread.sleep(1);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        }
    }
}