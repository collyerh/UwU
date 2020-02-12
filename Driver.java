public class Driver{
    public static void main(String []args){
        GameArena mainArena = new GameArena(1000,1000);   
        Ball player = new Ball(500,500,100,"BLUE");
        mainArena.addBall(player);
        
        while(true){
            if(player.getXPosition()<1000){
                player.setXPosition((player.getXPosition()+1));
            }
            else{
                player.setXPosition(0);
            }
        }
    }
}