public class Map{
    private int noRectangles = 1;
    private Rectangle map[] = new Rectangle[noRectangles];

    public Map(GameArena g){
        //top left pixel is the x pos and y pos
        map[0] = new Rectangle(1000, 1000, 10, 10, "BLUE");
        for(int i=0; i<noRectangles; i++){
            g.addRectangle(map[i]);
        }
    }
}