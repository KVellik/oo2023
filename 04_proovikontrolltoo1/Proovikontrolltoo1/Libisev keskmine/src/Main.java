public class Main {
    public static void main(String[] args) {
        System.out.println(aritmKeskmine(3, 4, 5));
        System.out.println(aritmKeskmine(5, 64, 43));
    }

    private static double aritmKeskmine(double arv1, double arv2, double arv3){
        return (arv1 + arv2 + arv3) / 3;
    }
}