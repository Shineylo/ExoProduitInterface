public class Main {
    public static void main(String[] args) {
        Magasin YannFour = new Magasin("YannFour");
        Biere jupiler = new Biere("Jupiler",1.80,5.2f);

        YannFour.ajouter(jupiler);
        YannFour.ajouter(jupiler);

        YannFour.acheter(jupiler);
    }
}