package TemaTest;

public class Comentariu implements Likeable {
    static int generareId = 1;
    public void resetGenerareId() {
        generareId = 1;
    }
    public int idComentariu;
    public int idPostare;
    public String continutComentariu;
    public String autorComentariu;
    public String dataComentariu;
    public String[] utilizatoriApreciatori = new String[10000];
    public int numarApreciatori;
    public void utilizatorDaLike(Object u, Object m) {
        ((Utilizator)u).idMediaApreciat[((Utilizator) u).numarMediaApreciat] = -((Comentariu)m).idComentariu;
        ((Utilizator)u).numarMediaApreciat++;
        ((Comentariu)m).utilizatoriApreciatori[((Comentariu)m).numarApreciatori] = ((Utilizator)u).numeUtilizator;
        ((Comentariu)m).numarApreciatori++;
    }
    public Comentariu() {
        this.idComentariu = generareId;
        generareId++;
    }
}
