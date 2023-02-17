public class Dragon {

    int xCoordinate;
    int yCoordinate;
    char symbol;

    //constructor
    public Dragon(int worldWidth, int worldHeight){
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'D';
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
}
