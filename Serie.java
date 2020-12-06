public class Serie extends Cinema {

    private int temporadas;
    private int episodiosPorTemporada;

    public Serie() {

    }

    public Serie(
        String idiomaAudio,
        String idiomaLegenda,
        boolean estaPausado,
        String nome,
        int temporadas,
        int episodiosPorTemporada)
    {
        this.idiomaAudio = idiomaAudio;
        this.idiomaLegenda = idiomaLegenda;
        this.estaPausado = estaPausado;
        this.nome = nome;
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public String exibirDetalhes() {
        String detalhes = this.nome + " " + this.temporadas + " temporadas. " + this.episodiosPorTemporada + " por temporada.";
        System.out.println(detalhes);
        return detalhes;
    }  
}