import java.time.LocalDate;

public class Biere extends Produit implements Perissable,AgeLegal{
    private float tauxAlcool;
    private LocalDate dateProduction;

    public Biere(String nom, double prix,float tauxAlcool) {
        super(nom, prix);
        this.tauxAlcool = tauxAlcool;
        this.dateProduction = LocalDate.now();
    }

    @Override
    public LocalDate getPeremption() {
        return this.dateProduction.plusMonths(5);
    }

    @Override
    public boolean estAutorise(int age) {
        if(age>=16){
            System.out.println("Vous avez l'age");
            return true;
        }else{
            System.out.println("Vous n'avez pas l'age");
            return false;
        }
    }
}
