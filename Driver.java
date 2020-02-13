public class Driver{
    public static void main(String []args){
        Ball flappy = new Ball(500,500,50,"YELLOW");
        GameArena mainArena = new GameArena(1000,1000);
        mainArena.addBall(flappy);
        String direction = "";

        while(true){
            mainArena.pause();
            if(mainArena.rightPressed()){
                direction = "right";
            }
            if(mainArena.leftPressed()){
                direction = "left";
            }
            if(mainArena.upPressed()){
                direction = "up";
            }
            if(mainArena.downPressed()){
                direction = "down";
            }
            if(direction == "left"){
                if(flappy.getXPosition() == 0){
                    flappy.setXPosition(1000);
                }
                flappy.setXPosition(flappy.getXPosition()-10);
            }
            if(direction == "right"){
                if(flappy.getXPosition() == 1000){
                    flappy.setXPosition(0);
                }
                flappy.setXPosition(flappy.getXPosition()+10);
            }
            if(direction == "up"){
                if(flappy.getYPosition() == 0){
                    flappy.setYPosition(1000);
                }
                flappy.setYPosition(flappy.getYPosition()-10);
            }
            if(direction == "down"){
                if(flappy.getYPosition() == 1000){
                    flappy.setYPosition(0);
                }
                flappy.setYPosition(flappy.getYPosition()+10);
            }
        }
    }
}