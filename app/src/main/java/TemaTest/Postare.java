package TemaTest;

public class Postare implements Likeable {
    static int generareId = 1;
    public void resetGenerareId() {
        generareId = 1;
    }
    public int idPostare;
    public String continutPostare;
    public String creatorPostare;
    public String dataPostare;
    public String[] utilizatoriApreciatori  = new String[10000];
    public int numarApreciatori;
    public int[] idComentariiAdaugate = new int[10000];
    public int numarComentariiAdaugate;

    public void utilizatorDaLike(Object u, Object m) {
        ((Utilizator)u).idMediaApreciat[((Utilizator) u).numarMediaApreciat] = ((Postare)m).idPostare;
        ((Utilizator)u).numarMediaApreciat++;
        ((Postare)m).utilizatoriApreciatori[((Postare)m).numarApreciatori] = ((Utilizator)u).numeUtilizator;
        ((Postare)m).numarApreciatori++;
    }

    public Postare() {
        this.idPostare = generareId;
        generareId++;
    }
}
