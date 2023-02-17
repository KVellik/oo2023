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


        World world = new World();
        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);


        world.printMap(world.width, world.height,
                player.xCoordinate, player.yCoordinate, player.symbol,
                dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                orc.xCoordinate, orc.yCoordinate, orc.symbol);
        String input = scanner.nextLine();

        // Kaardil liikumine
        //for (; !input.equals("end");)
        while (!input.equals("end")){
            player.move(input);
            world.printMap(world.width, world.height,
                    player.xCoordinate, player.yCoordinate, player.symbol,
                    dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                    orc.xCoordinate, orc.yCoordinate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }
}