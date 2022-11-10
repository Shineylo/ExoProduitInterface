import java.util.Scanner;

public abstract class Produit implements Achat{
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean acheter(){
        if(this instanceof Perissable){
            System.out.println(((Perissable) this).getPeremption());
        }
        if(this instanceof AgeLegal){
            Scanner scn = new Scanner(System.in);
            System.out.println("Rentrez votre age");
            return ((AgeLegal) this).estAutorise(Integer.parseInt(scn.nextLine()));
        }
        return false;
    }

    @Override
    public void acheter(Produit produit){}

}
