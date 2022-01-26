import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(22, "lakrib", "yasmine");
        Compte compte = new Compte(22, "A215", 6000.00,client);
        client.setCompte(compte);

        Operation op1=new Operation(new Date(2022-01-26), "VERS",500.00, compte);
        compte.addOperation(op1);
       
        Operation op2=new Operation(new Date(2022-01-28), "RETR",1500.00, compte);
        compte.addOperation(op2);
       
        Operation op3=new Operation(new Date(2022-02-03), "RETR",500.00, compte);
        compte.addOperation(op3);
        
        System.out.println("Client : "+client.getNom()+""+client.getPrenom()+"\tid : "+client.getId()+"");
        System.out.println("Compte : "+compte.getNumero());
        System.out.println("DATE \t\tTYPE\tMONTANT");
        System.out.println("_________________________________");
        for(Operation op : compte.getOperations()){
            System.out.println(op.getDate()+"\t"+op.getType()+"\t"+op.getMontant());
            System.out.println("_________________________________");
        }
        System.out.println("terminé ! , le nouveau solde est de "+compte.getSolde());
    }
}
 