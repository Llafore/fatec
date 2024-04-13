public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private String idade;

    public Paciente(String nome, String cpf, String telefone, String genero, String idade) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()){
            throw new Exception("Informe o nome do paciente!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if(cpf.isEmpty()){
            throw new Exception("Informe o nome do paciente!");
        } else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    public void mostrar() {
        System.out.println( "Paciente{" +
                        "nome='" + nome + '\'' +
                        ", cpf='" + cpf + '\'' +
                        ", telefone='" + telefone + '\'' +
                        ", genero='" + genero + '\'' +
                        ", idade='" + idade + '\'' +
                        '}');

    }

    public void cadastrar(){}
    public void consultar(){}
}
