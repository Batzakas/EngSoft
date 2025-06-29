
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
	
	private static Repositorio instancia;
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Livro> livros = new ArrayList<Livro>();
	
	private Repositorio() {};
	
	public static Repositorio obterInstancia() {
		if (instancia == null)
			instancia = new Repositorio();
		return instancia;
	}
	
	public Usuario obterUsuarioPorCodigo(String codigo) {
	    for (Usuario usuario : usuarios) {
	        if (usuario.getCodigo().equals(codigo)) {
	            return usuario;
	        }
	    }
	    return null;
	}
	
	public Livro obterLivroPorCodigo(String codigo) {
		for (Livro livro : livros) {
			if (livro.getCodigo().equals(codigo)) {
				return livro;
			}
		}
		return null;
	}

}