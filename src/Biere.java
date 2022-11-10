import java.time.LocalDate;

public class Biere extends Produit implements Perissable,AgeLegal{
    private LocalDate dateRecolte;

    public Biere(String nom, double prix,LocalDate dateRecolte) {
        super(nom, prix);
        this.dateRecolte = dateRecolte;
    }

    @Override
    public LocalDate getPeremption() {
        return this.dateRecolte.minusMonths(5);
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
