import java.util.ArrayList;
import java.util.List;

public class Compte {
    private int id;
    private String numero;
    private double solde;
    private Client client;
    private List<Operation> operations = new ArrayList<Operation>();
    public Compte() { }
    public List<Operation> getOperations() {
        return operations;
    }
    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Compte(int id,String numero,double solde,Client client) {
        this.setId(id);
        this.setNumero(numero);
        this.solde=solde;
        this.client=client;
    }
    public double getSolde(){
        return solde;
    }
    public void setSolde(double solde){
        this.solde=solde;
    }
    public void addOperation(Operation op){
        operations.add(op);
        if(op.getType().equals("VERS"))
         solde=solde+op.getMontant();
        else if (op.getType().equals("RETR"))
                solde=solde-op.getMontant();
    }
}
