public class RegraEmprestimoProfessor implements IRegraEmprestimo {

    @Override
    public boolean verificaEmprestimo(Usuario usuario, Livro livro) {
        if(livro.getExemplares().size() >0){
            if(!usuario.verificaDevedor()){
                return true;
            }
            else{
                Console.falhaEmprestimoSemExemplar();
            }
        }else{
            Console.falhaEmprestimoSemExemplar();
            
        }
        return false;
    }

}
