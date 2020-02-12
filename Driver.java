public class Driver{
    public static void main(String []args){
        GameArena mainArena = new GameArena(2000,2000);   
        Ball player = new Ball(420,169,100,"BLUE");
        mainArena.addBall(player);
        boolean xEdge = true;
        boolean YEdge = true; 
        while(true){
            if (xEdge == true){
                player.setXPosition((player.getXPosition()+1));
            }
            else{
                player.setXPosition((player.getXPosition()-1));
            }
            if (YEdge == true){
                player.setYPosition((player.getYPosition()+1));
            }
            else{
                player.setYPosition((player.getYPosition()-1));
            }
            if (player.getXPosition() == 100 || player.getXPosition() == 1900){
                xEdge = !xEdge;
            }
            if (player.getYPosition() == 100 || player.getYPosition() == 1900){
                YEdge = !YEdge;
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