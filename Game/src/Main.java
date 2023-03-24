import java.util.Scanner;
import java.util.*;
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


        World world = new World(10,5);
        //                    parem klõps -> refactor -> extract method
        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);
        // MITTE java.lang import
        // saatke printMap sisse hoopis character ja if/else asemel funktsiooni sees forEach
        List<Character> characters = new ArrayList<>(Arrays.asList(player, orc, dragon));

        Item sword = new Item(10,1,"Mõõk", world.width, world.height);
        Item hammer = new Item(5,3,"Haamer", world.width, world.height);
        Item boot = new Item(1,10,"Saabas", world.width, world.height);

        // import! java.util.List
        // import: java.util.ArrayList
        //                              import: java.util.Arrays
        // List --> muudetav
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer, boot));

//        Item[] items1 = {sword, hammer, boot};
        // Array -> ei ole muudetav (read-only)

        world.printMap(world.width, world.height,
                player.xCoordinate, player.yCoordinate, player.symbol,
                dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                orc.xCoordinate, orc.yCoordinate, orc.symbol, items);
        String input = scanner.nextLine();

        // Kaardil liikumine
        //for (; !input.equals("end");)
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinate, player.yCoordinate, player.symbol,
                    dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                    orc.xCoordinate, orc.yCoordinate, orc.symbol, items);
            System.out.println();
            for (Item i : items) {
                if (i.xCoordinate == player.xCoordinate && i.yCoordinate == player.yCoordinate) {
                    player.item = i;
                    System.out.println("Korjasid eseme: " + player.item.name);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }


}