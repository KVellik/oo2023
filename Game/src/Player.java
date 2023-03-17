public class Player {
    int xCoordinate; // täisarvuline number
    int yCoordinate;
    char symbol;
    Direction direction; // 3nda tunni teema
    // Ese: xCoordinaate, yCoordinate, tugevusest, kasutuskordadest, nimest
    Item item; // klassikomplekt   Player klassi sees on Item klass

    // constructor
    public Player(int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'X';
        this.direction = Direction.UP;
    }

    private static int getRandomCoordinate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) + 1);
        // returni järel tuleb täisarv
    }

    // public tähendab, et mõni teine klass saab ka seda funktsiooni välja kutsuda
    // private tähendab, et seda funktsiooni saab ainult sellest klassis kasutada
    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        } else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        } else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.yCoordinate > 1) {
            this.yCoordinate = this.yCoordinate - 1;
        } else if (direction.equals(Direction.DOWN) && this.yCoordinate < world.height-2) {
            this.yCoordinate = this.yCoordinate + 1;
        } else if (direction.equals(Direction.LEFT) && this.xCoordinate > 1) {
            this.xCoordinate = this.xCoordinate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.xCoordinate < world.width-2) {
            this.xCoordinate = this.xCoordinate + 1;
        }
    }
}