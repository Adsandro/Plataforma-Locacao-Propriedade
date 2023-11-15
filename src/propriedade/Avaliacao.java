package propriedade;

public class Avaliacao{
    private Propriedade propriedade;
    private float pontuacao;
    private String comentario;

    public Avaliacao(Propriedade propriedade, float pontuacao, String comentario){
        this.propriedade = propriedade;
        this.pontuacao = pontuacao;
        this.comentario = comentario;
    }

}
