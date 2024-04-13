public class Funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public String getNome()  {return nome;}

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()){
            throw new Exception("Informe o nome do funcionario!");
        } else{
            this.nome = nome;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "******";
    }

    public void setSenha(String senha) throws Exception{
        if(senha.isEmpty()){
            throw new Exception("Informe a senha!");
        } else {
            this.senha = senha;
        }

    }
    public void acessar(){}

    public void mostrar(){
        System.out.println("Nome: " + getNome() + "\nTelefone: " + getTelefone());
    }
}
