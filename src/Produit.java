public abstract class Produit implements Achat{
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public void Acheter() {

    }
}
