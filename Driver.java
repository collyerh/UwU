public class Driver{
    public static void main(String []args){
        Ball[] ballArray = new Ball[3];
        GameArena mainArena = new GameArena(2000,2000);   
        ballArray[0] = new Ball(420,69,100,"BLUE");
        ballArray[1] = new Ball(666,1920,100,"RED");
        ballArray[2] = new Ball(1820,1000,100,"GREEN");
        mainArena.addBall(ballArray[0]);
        mainArena.addBall(ballArray[1]);
        mainArena.addBall(ballArray[2]);
        while(true){
            for(int i = 0; i<3; i++){ 
                ballArray[i].setXPosition((ballArray[i].getXPosition()+ballArray[i].getxEdge()));
                ballArray[i].setYPosition((ballArray[i].getYPosition()+ballArray[i].getyEdge()));

                if (ballArray[i].getXPosition() == 0 || ballArray[i].getXPosition() == 2000){
                    ballArray[i].flipx();
                }
                if (ballArray[i].getYPosition() == 0 || ballArray[i].getYPosition() == 2000){
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