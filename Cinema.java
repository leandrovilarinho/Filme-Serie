public abstract class Cinema implements Video {
    protected boolean iniciado;
    protected int duracao;
    protected String idiomaAudio;
    protected String idiomaLegenda;
    protected String nome;
    protected boolean estaPausado;

    public Cinema() {

    }

    public Cinema(boolean iniciado, int duracao, String idiomaAudio, String idiomaLegenda, boolean estaPausado, String nome) {
        this.iniciado = iniciado;
        this.duracao = duracao;
        this.idiomaAudio = idiomaAudio;
        this.idiomaLegenda = idiomaLegenda;
        this.nome = nome;
        this.estaPausado = estaPausado;
    }

    public void executar() {
        if (this.iniciado && this.estaPausado) {
            System.out.println("O vídeo está executando.");
        } else if (!this.iniciado) {
            System.out.println("Você começou a assistir " + this.nome);
            this.iniciado = true;
        }
        this.estaPausado = false;
    }

    public void pausar() {
        System.out.println("O vídeo foi pausado.");
        this.estaPausado = true;
    }
    
    public void mudarAudio() {
        String msg = "Português (Brasil)";
        if (this.idiomaAudio == "Português (Brasil)") {
            msg = "Inglês (Original)";
            this.idiomaAudio = msg;
        } else if (this.idiomaAudio == "Inglês (Original)") {
            msg = "Português (Brasil)";
            this.idiomaAudio = msg;
        } else {
            this.idiomaAudio = msg;
            msg = "Audio inválido.";
        }
        System.out.println(msg);
    }

    public void mudarLegenda() { 
        String msg = "Português (Brasil)";
        if (this.idiomaLegenda == "Português (Brasil)") {
            msg = "Sem legenda";
            this.idiomaLegenda = msg;
        } else if (this.idiomaLegenda == "Sem legenda") {
            this.idiomaLegenda = msg;
            msg = "Português (Brasil)";
        } else {
            this.idiomaLegenda = msg;
            msg = "Legenda inválida.";
        }
        System.out.println(msg);
    }
    public String exibirDetalhes() {
        System.out.println("Exibindo detalhes... ");
        return " ";
    }
    
}
