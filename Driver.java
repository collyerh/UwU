public class Driver{
    public static void main(String []args){
        int scale = 1; //also change the scale variable in Rectangle.java
        Ball pacman = new Ball(350*scale,450*scale,40*scale,"YELLOW");
        GameArena mainArena = new GameArena(700*scale,900*scale);
        mainArena.addBall(pacman);
        mainArena.setLevel();
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
                if(pacman.getXPosition() == 0){
                    pacman.setXPosition(700*scale);
                }
                pacman.setXPosition(pacman.getXPosition()-(5*scale));
            }
            if(direction == "right"){
                if(pacman.getXPosition() == 700*scale){
                    pacman.setXPosition(0);
                }
                pacman.setXPosition(pacman.getXPosition()+(5*scale));
            }
            if(direction == "up"){
                if(pacman.getYPosition() == 0){
                    pacman.setYPosition(900*scale);
                }
                pacman.setYPosition(pacman.getYPosition()-(5*scale));
            }
            if(direction == "down"){
                if(pacman.getYPosition() == 900*scale){
                    pacman.setYPosition(0);
                }
                pacman.setYPosition(pacman.getYPosition()+(5*scale));
            }
        }
    }
}