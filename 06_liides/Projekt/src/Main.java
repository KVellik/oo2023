public class Main {
    public static void main(String[] args) {
        IsikukoodEE ee1 = new IsikukoodEE("Karl", "50001029996");
        System.out.println(ee1.getSugu());
        IsikukoodEE ee2 = new IsikukoodEE("Karl", "30303039914");
        System.out.println(ee2.getSugu());
        IsikukoodEE ee3 = new IsikukoodEE("Karl", "30303039816");
        System.out.println(ee3.getSugu());
        IsikukoodEE ee4 = new IsikukoodEE("Karl", "50701019992");
        System.out.println(ee4.getSugu());
    }
}