public class Escola {
    public static void main(String[] args) {
        Aluno Thiago = new Aluno();
		Thiago.setNome("Thiago");
        Thiago.setIdade(19);
		
		System.out.println("O aluno " + Thiago.getNome() + " tem " + Thiago.getIdade() + " anos ");
    }
}
