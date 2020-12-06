public class Main {
    public static void main(String args[]) {
        Filme filmao = new Filme();
        filmao.executar();
        filmao.pausar();
        filmao.executar();
        filmao.pausar();
        filmao.executar();
        filmao.mudarAudio();
        filmao.mudarAudio();
        filmao.mudarLegenda();
        filmao.mudarLegenda();
        filmao.mudarAudio();
        filmao.mudarLegenda();
        filmao.exibirDetalhes();

        Serie serie1 = new Serie();
        serie1.executar();
        serie1.pausar();
        serie1.executar();
        serie1.pausar();
        serie1.executar();
        serie1.mudarAudio();
        serie1.mudarAudio();
        serie1.mudarLegenda();
        serie1.mudarLegenda();
        serie1.mudarAudio();
        serie1.mudarLegenda();
        serie1.exibirDetalhes();
    }
}