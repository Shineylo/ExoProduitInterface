import java.util.ArrayList;
import java.util.HashMap;

public class Magasin {
    private String nom;
    private HashMap<String, ArrayList<Produit>> listeProduit = new HashMap<String, ArrayList<Produit>>();

    public Magasin(String nom) {
        this.nom = nom;
    }

    public void ajouter(Produit produit){
        if(!this.listeProduit.containsKey(produit.getNom())) {
            ArrayList<Produit> stock = new ArrayList<Produit>();
            stock.add(produit);
            this.listeProduit.put(produit.getNom(), stock);
            System.out.println("Article crée dans la base de données");
        }else{
            ArrayList<Produit> stock = this.listeProduit.get(produit.getNom());
            stock.add(produit);
            System.out.println(this.listeProduit.get(produit.getNom()).size());
            System.out.println("Article ajouté dans le stock");
        }
    }

    public void acheter(Produit produit) {
        if(this.listeProduit.containsKey(produit.getNom()) && this.listeProduit.get(produit.getNom()).size()>0){
            if(produit.acheter()) {
                System.out.println(this.listeProduit.get(produit.getNom()).size());
                this.listeProduit.get(produit.getNom()).remove(0);
                System.out.println("Produit Acheté");
                System.out.println(this.listeProduit.get(produit.getNom()).size());
            }else{
                System.out.println("Impossible d'acheter");
            }
        }
    }
}
