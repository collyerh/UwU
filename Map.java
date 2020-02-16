public class Map{
    private int noRectangles = 19;
    private Rectangle map[] = new Rectangle[noRectangles];

    public Map(GameArena g){
        //top left pixel is the x pos and y pos (window size 700x900) (ball size 40)

        //this is all fucked its not centered vertically but you get the idea
        map[0] = new Rectangle(0, 890, 700, 10, "BLUE");
        map[1] = new Rectangle(0, 0, 700, 10, "BLUE");
        map[2] = new Rectangle(0, 0, 10, 300, "BLUE");
        map[3] = new Rectangle(690, 0, 10, 300, "BLUE");
        map[4] = new Rectangle(0, 600, 10, 300, "BLUE");
        map[5] = new Rectangle(690, 600, 10, 300, "BLUE");
        map[6] = new Rectangle(340, 10, 20, 120, "BLUE");
        map[7] = new Rectangle(70, 70, 10, 10, "BLUE");
        map[8] = new Rectangle(10, 290, 10, 10, "BLUE");
        map[9] = new Rectangle(0, 415, 20, 10, "BLUE");
        map[10] = new Rectangle(0, 475, 20, 10, "BLUE");
        map[11] = new Rectangle(680, 290, 10, 10, "BLUE");
        map[12] = new Rectangle(680, 475, 20, 10, "BLUE");
        map[13] = new Rectangle(680, 415, 20, 10, "BLUE");
        map[14] = new Rectangle(680, 600, 10, 10, "BLUE");
        map[15] = new Rectangle(10, 600, 10, 10, "BLUE");
        map[16] = new Rectangle(340, 180, 20, 120, "BLUE");
        map[17] = new Rectangle(340, 710, 20, 120, "BLUE");
        map[18] = new Rectangle(340, 530, 20, 120, "BLUE");
        //map[2] = new Rectangle(325, 410, 50, 10, "BLUE"); //5px gap either side
        //map[3] = new Rectangle(325, 480, 50, 10, "BLUE");
        for(int i=0; i<noRectangles; i++){
            g.addRectangle(map[i]);
        }
    }
}