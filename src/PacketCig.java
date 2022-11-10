public class PacketCig extends Produit implements AgeLegal{
    private int nbrCig;

    public PacketCig(String nom, double prix,int nbrCig) {
        super(nom, prix);
        this.nbrCig = nbrCig;
    }

    @Override
    public boolean estAutorise(int age) {
        if(age>=18){
            System.out.println("Vous avez l'age");
            return true;
        }else{
            System.out.println("Vous n'avez pas l'age");
            return false;
        }
    }
}
