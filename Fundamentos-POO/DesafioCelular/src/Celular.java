public class Celular implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando");
    }
    
    public void pausar(){
        System.out.println("Pausado");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }

    public void ligar(){
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

    public void exibirPagina(){
        System.out.println("Exibindo página");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizar página");
    }
}