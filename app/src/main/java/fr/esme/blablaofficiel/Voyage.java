package fr.esme.blablaofficiel;

public class Voyage {

    private String depart, arrive, date;

    public Voyage(String depart, String arrive, String date){
        this.depart=depart;
        this.arrive=arrive;
        this.date=date;
    }

    public String getDepart(){return depart;}
    public String getArrive(){return arrive;}
    public String getDate(){return date;}

    public void setDepart(String depart){this.depart=depart;}
    public void setArrive(String arrive){this.arrive=arrive;}
    public void setDate(String date){this.date=date;}

}
