
public class RegraEmprestimoAluno implements IRegraEmprestimo {

	@Override
	public boolean verificaEmprestimo(Usuario usuario, Livro livro) {
		
		
		for(Emprestimo emprestimo : usuario.getEmprestimosAtuais()) {
			if (emprestimo.getExemplar().getLivro() == livro) {
				return false;
			}
		}
		
		if (!livro.getExemplares().isEmpty()) {
			if(!usuario.verificaDevedor()) {
				if(usuario.getEmprestimosAtuais().size() <= usuario.getTempoEmprestimo()) {
					if (livro.getReservas().size() < livro.getExemplares().size()) {
						for(Reserva reserva : livro.getReservas()) {
							if (reserva.getUsuario() == usuario) {
								Console.falhaEmprestimoReservaAberta();

								return false;
							}
						}
						return true;
					}
					else {
						for( Reserva reserva : livro.getReservas()) {
							if (reserva.getUsuario() == usuario) {
								return true;
							}
						}
					}
				}
			}
			Console.falhaEmprestimoUsuairoDevedor();
			return false;
		}
		Console.falhaEmprestimoSemExemplar();
		return false;
	}

    

}