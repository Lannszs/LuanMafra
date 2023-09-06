package Models;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
    
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public boolean validaDocumento(String documento) {
        // VALIDA UM CPF
        return true;
    }

    

}
