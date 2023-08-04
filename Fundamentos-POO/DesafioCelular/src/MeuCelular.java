public class MeuCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.ligar();
        celular.iniciarCorreioVoz();
        celular.atender();

        celular.adicionarNovaAba();
        celular.atualizarPagina();
        celular.exibirPagina();

        celular.tocar();
        celular.pausar();
        celular.selecionarMusica();
    }
}
