public class Computador {
    public static void main(String[] args) {
        
        MensagemPadrao mp = null;


		String appEscolhido="fb"; 
		
		if(appEscolhido.equals("fb"))
			mp = new Facebook();
		else if(appEscolhido.equals("insta"))
			mp = new Instagram();

		mp.enviarMensagem();
		mp.receberMensagem();
	}
}
