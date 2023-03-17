public class Main {
    public static void main(String[] args) {
        String lause = "Tere, maailm!";
        int nihe = 1;
        String cipherLause = Cipher.nihuta(lause, nihe);
        System.out.println("Algse lause \"" + lause + "\" nihutatud lauseks nihe " + nihe + " korral: ");
        System.out.println(cipherLause);
    }
}