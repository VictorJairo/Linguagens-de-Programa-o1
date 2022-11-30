package Atendimento;

public class IdAnimal {
    private String Nome;
    private String Especie;
    private String Raca;
    private String Sexo;
    private int Idade;
    private float Peso;
    private String Pelagem;
    private String Procedencia;

    public IdAnimal(String nome, String especie, String raca, String sexo, int idade, float peso, String pelagem, String procedencia) {
        Nome = nome;
        Especie = especie;
        Raca = raca;
        Sexo = sexo;
        Idade = idade;
        Peso = peso;
        Pelagem = pelagem;
        Procedencia = procedencia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public String getPelagem() {
        return Pelagem;
    }

    public void setPelagem(String pelagem) {
        Pelagem = pelagem;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String procedencia) {
        Procedencia = procedencia;
    }
}
