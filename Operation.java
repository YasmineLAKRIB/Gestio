import java.sql.Date;

public class Operation {
    private Date date;
    private String type;
    private double montant;
    private Compte compte;
    
    public Operation(){}
    public Operation(Date date,String type,double montant,Compte compte){
        this.date=date;
        this.type=type;
        this.montant=montant;
        this.compte=compte;
    }
    public void versement(Double montant){
        Compte cpt=new Compte();
        cpt.setSolde((cpt.getSolde())+montant);
        
    }
    public Compte getCompte() {
        return compte;
    }
    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void retarait(double montant){
        Compte cpt1=new Compte();
        cpt1.setSolde((cpt1.getSolde())-montant);
    }
 
    
}