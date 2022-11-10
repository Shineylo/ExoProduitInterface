import java.time.LocalDate;

public class Tomate extends Produit implements Perissable{
    private LocalDate dateRecolte;

    public Tomate(String nom, double prix,LocalDate dateRecolte) {
        super(nom, prix);
        this.dateRecolte = dateRecolte;
    }

    @Override
    public LocalDate getPeremption() {
        return this.dateRecolte.plusDays(5);
    }
}
