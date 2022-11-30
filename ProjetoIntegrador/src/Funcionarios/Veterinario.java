package Funcionarios;

public class Veterinario {
    private int DataDeAdmissao;
    private int CRMV;
    private float Salario;
    private String Nome;

    public Veterinario(int dataDeAdmissao, int CRMV, float salario, String nome) {
        DataDeAdmissao = dataDeAdmissao;
        this.CRMV = CRMV;
        Salario = salario;
        Nome = nome;
    }

    public int getDataDeAdmissao() {
        return DataDeAdmissao;
    }

    public void setDataDeAdmissao(int dataDeAdmissao) {
        DataDeAdmissao = dataDeAdmissao;
    }

    public int getCRMV() {
        return CRMV;
    }

    public void setCRMV(int CRMV) {
        this.CRMV = CRMV;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
