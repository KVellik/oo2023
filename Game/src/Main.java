import java.util.Scanner;

public class Main {

    //fori
    //sout
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        String sonaline = "Sõnaline muutuja";
//        char taheline = 's';
//        double komakohaga = 4231.213132;
//        float komakohaga2 = 23311.321312f;
//        boolean kahendvaartus = true; // 0 ja 1

        Scanner scanner = new Scanner(System.in);

        int worldWidth = 10;
        int worldHeight = 5;

        Player player = new Player(worldWidth, worldHeight);
        Dragon dragon = new Dragon(worldWidth, worldHeight);
        Orc orc = new Orc(worldWidth, worldHeight);

        String input = scanner.nextLine();

        // Kaardil liikumine
        //for (; !input.equals("end");)
        while (!input.equals("end")){
            player.move(input);
            printMap(worldWidth, worldHeight,
                    player.xCoordinate, player.yCoordinate, player.symbol,
                    dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                    orc.xCoordinate, orc.yCoordinate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }

    // Kaardi loomine
    private static void printMap(int worldWidth, int worldHeight, int playerXCoordinate, int playerYCoordinate, char playerSymbol, int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol, int orcXCoordinate, int orcYCoordinate, char orcSymbol) {
        //algväärtus  kuni  iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight -1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth -1) {
                    System.out.print("|");
                } else {
                    // parem klõps refactor ja veel midagi
                    printCharacters(playerXCoordinate, playerYCoordinate, playerSymbol,
                            dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                            orcXCoordinate, orcYCoordinate, orcSymbol, y, x);
                }
            }
        }
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastagi midagi
    private static void printCharacters(int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                                        int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                                        int orcXCoordinate, int orcYCoordinate, char orcSymbol, int mapY, int mapX) {
        if (playerXCoordinate == mapX && playerYCoordinate == mapY) {
            System.out.print(playerSymbol);
        } else if (dragonXCoordinate == mapX && dragonYCoordinate == mapY) {
            System.out.print(dragonSymbol);
        } else if (orcXCoordinate == mapX && orcYCoordinate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}