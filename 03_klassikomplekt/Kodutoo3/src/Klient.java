public class Klient {
    int isikukood;
    String email;
    double raha;


    public Klient(int isikukood, String email, double raha) {
        this.isikukood = isikukood;
        this.email = email;
        this.raha = raha;
    }

    public int getIsikukood(){
        return isikukood;
    }

    public String getEmail(){
        return email;
    }
}
