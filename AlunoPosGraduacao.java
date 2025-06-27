

public class AlunoPosGraduacao extends Usuario {
	private static int tempoEmprestimo = 5;
	//private static int limiteEmprestimo = 3;
	public AlunoPosGraduacao(String codigo, String nome) {
		super(codigo, nome);
	}
	@Override
	public int getTempoEmprestimo() {
		return AlunoPosGraduacao.tempoEmprestimo;
	}
	
	/*
	public int getLimiteEmprestimo() {
		return AlunoPosgraduacao.limiteEmprestimo;
	}
	*/
	

}
