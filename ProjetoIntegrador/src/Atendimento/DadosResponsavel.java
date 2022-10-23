package Atendimento;

public class DadosResponsavel {
    private String Nome;
    private String Endereco;
    private int TelefoneFixo;
    private int Celular;
    private int Uf;
    private int Cpf;
    private String Cidade;

    public DadosResponsavel(String nome, String endereco, int telefoneFixo, int celular, int uf, int cpf, String cidade) {
        this.Nome = nome;
        this.Endereco = endereco;
        this.TelefoneFixo = telefoneFixo;
        this.Celular = celular;
        this.Uf = uf;
        this.Cpf = cpf;
        this.Cidade = cidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getTelefoneFixo() {
        return TelefoneFixo;
    }

    public void setTelefoneFixo(int telefoneFixo) {
        TelefoneFixo = telefoneFixo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }

    public int getUf() {
        return Uf;
    }

    public void setUf(int uf) {
        Uf = uf;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int cpf) {
        Cpf = cpf;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }
}


