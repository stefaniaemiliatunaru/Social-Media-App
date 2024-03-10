package TemaTest;

public class Utilizator {
    public String numeUtilizator;
    private String parolaUtilizator;
    public String[] urmariti = new String[10000];
    public int numarUrmariti;
    public String[] urmaritori = new String[10000];
    public int numarUrmaritori;
    public int[] idPostariCreate = new int[10000];
    public int numarPostariCreate;
    public int[] idComentariiCreate = new int[10000];
    public int numarComentariiCreate;
    public int[] idMediaApreciat = new int[10000];
    public int numarMediaApreciat;
    public int cuanteDeAprecieri = 0;
    public String getParola() {
        return parolaUtilizator;
    }
    public void setParola(String parolaUtilizator) {
        this.parolaUtilizator = parolaUtilizator;
    }
}
