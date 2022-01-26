public class Client {
    private int id;
    private String nom;
    private String prenom;
    private Compte compte;

    public Client(int id,String nom,String prenom){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
    public Client(){}
    public int getId() {
        return id;
    }
    public Compte getCompte() {
        return compte;
    }
    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setId(int id) {
        this.id = id;
    }

}