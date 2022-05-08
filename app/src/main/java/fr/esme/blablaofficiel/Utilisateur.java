package fr.esme.blablaofficiel;

public class Utilisateur {
    private String numtel;
    private String prenom;
    private String nom;
    private String email;
    private String mdp;

    public Utilisateur(String email,String mdp){
        this.email=email;
        this.mdp=mdp;
    }

    public String getPrenom(){return prenom;}
    public String getNom(){return nom;}
    public String getTel(){return numtel;}
    public String getEmail() { return email; }

    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setNom(String nom){this.nom=nom;}
    public void setTel(String tel){this.numtel=tel;}
    public void setEmail(String email) {this.email = email;}
}
