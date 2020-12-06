public class Filme extends Cinema {

    private int anoLancamento;

    public Filme () {

    }

    public Filme(String idiomaAudio, String idiomaLegenda, boolean estaPausado, String nome, int anoLancamento) {
        this.idiomaAudio = idiomaAudio;
        this.idiomaLegenda = idiomaLegenda;
        this.estaPausado = estaPausado;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String exibirDetalhes() {
        String detalhes = this.nome + " " + this.anoLancamento + ". Duração: " + this.duracao + "min";
        System.out.println(detalhes);
        return detalhes;
    }
}