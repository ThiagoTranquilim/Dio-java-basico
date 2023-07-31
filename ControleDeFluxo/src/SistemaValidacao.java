import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SistemaValidacao {
    public static void main(String[] args) {
        double baseSalario = 2000.00;

        selecaoCandidatos(baseSalario);
        imprimirCandidados();

        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","MÕNICA"};

		for(String candidato: candidatosSelecionados) {
			entrandoEmContato(candidato);
		}
    }

    static boolean atender() {
		return new Random().nextInt(3)==1;
	}

    static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}

    static void imprimirCandidados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","MÔNICA"};
        for(int i = 0; i < candidatos.length; i++){
            System.out.printf("O candidato de número %d, é o %s%n", i + 1, candidatos[i]);
        }
    }

    static void selecaoCandidatos(double baseSalario){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatoSelecionados = 0;
        int candidatoAtual = 0;

        while(candidatoSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s, solicitou este valor de salário %.2f%n", candidato, salarioPretendido);

            if(baseSalario >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado para a vaga%n", candidato);
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }
    
    static void analisarCandidato(double baseSalario, double salarioPretendido){

        if(baseSalario > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(baseSalario == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
