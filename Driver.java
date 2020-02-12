public class Driver{
    public static void main(String []args){
        GameArena mainArena = new GameArena(2000,2000);   
        Ball player = new Ball(420,169,100,"BLUE");
        mainArena.addBall(player);
        int xEdge = 1;
        int yEdge = 1; 
        while(true){
            player.setXPosition((player.getXPosition()+xEdge));
            player.setYPosition((player.getYPosition()+yEdge));

            if (player.getXPosition() == 0 || player.getXPosition() == 2000){
                xEdge *= -1;
            }
            if (player.getYPosition() == 0 || player.getYPosition() == 2000){
                yEdge *= -1;
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