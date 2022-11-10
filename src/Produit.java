import java.util.Scanner;

public abstract class Produit implements Achat{
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public void Acheter(Produit produit) {
        if(produit instanceof Perissable){
            System.out.println(((Perissable) produit).getPeremption());
        }
        if(produit instanceof AgeLegal){
            Scanner scn = new Scanner(System.in);
            System.out.println("Rentrez votre age");
            ((AgeLegal) produit).estAutorise(Integer.parseInt(scn.nextLine()));
        }
    }
}
