import java.time.LocalDate;

public class Biere extends Produit implements Perissable,AgeLegal{
    private float tauxAlcool;
    private LocalDate dateProduite;

    public Biere(String nom, double prix,float tauxAlcool) {
        super(nom, prix);
        this.tauxAlcool = tauxAlcool;
    }

    @Override
    public LocalDate getPeremption() {
        return this.dateProduite.plusMonths(5);
    }

    @Override
    public boolean estAutorise(int age) {
        if(age>=16){
            return true;
        }else{
            return false;
        }
    }
}
