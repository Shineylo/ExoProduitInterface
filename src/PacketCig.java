public class PacketCig extends Produit implements AgeLegal{
    private int nbrCig;

    public PacketCig(String nom, double prix,int nbrCig) {
        super(nom, prix);
        this.nbrCig = nbrCig;
    }

    @Override
    public boolean estAutorise(int age) {
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
}
