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

        int playerXCoordinate = 3; // täisarvuline number
        int playerYCoordinate = 3;
        int dragonXCoordinate = 6;
        int dragonYCoordinate = 2;
        int orcXCoordinate = 5;
        int orcYCoordinate = 1;


        // algväärtus    kuni    iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if (playerXCoordinate == x && playerYCoordinate == y){
                        System.out.print("X");
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y) {
                        System.out.print("D");
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}