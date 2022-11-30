package Anamnese;

public class ExameFisico {
    private String Postura;
    private String NivelDeConsciencia;
    private int EscoreCorporal;
    private float Temperatura;
    private float FrequenciaRespiratoria;
    private float FrequenciaCardiaca;
    private int TempoDePreenchimentoCapilar;
    private int Pulso;
    private String Hidratacao;
    private String LinfonodosSubmand;
    private String LinfPreEscapulares;
    private String LinfPopliteos;
    private String LinfInguinais;
    private String MucosaOcular;
    private String MucosaOral;
    private String MucosaPenianaVulvar;
    private String MucosaAnal;

    public ExameFisico(String postura, String nivelDeConsciencia, int escoreCorporal, float temperatura, float frequenciaRespiratoria, float frequenciaCardiaca, int tempoDePreenchimentoCapilar, int pulso, String hidratacao, String linfonodosSubmand, String linfPreEscapulares, String linfPopliteos, String linfInguinais, String mucosaOcular, String mucosaOral, String mucosaPenianaVulvar, String mucosaAnal) {
        Postura = postura;
        NivelDeConsciencia = nivelDeConsciencia;
        EscoreCorporal = escoreCorporal;
        Temperatura = temperatura;
        FrequenciaRespiratoria = frequenciaRespiratoria;
        FrequenciaCardiaca = frequenciaCardiaca;
        TempoDePreenchimentoCapilar = tempoDePreenchimentoCapilar;
        Pulso = pulso;
        Hidratacao = hidratacao;
        LinfonodosSubmand = linfonodosSubmand;
        LinfPreEscapulares = linfPreEscapulares;
        LinfPopliteos = linfPopliteos;
        LinfInguinais = linfInguinais;
        MucosaOcular = mucosaOcular;
        MucosaOral = mucosaOral;
        MucosaPenianaVulvar = mucosaPenianaVulvar;
        MucosaAnal = mucosaAnal;
    }


    public String getPostura() {
        return Postura;
    }

    public void setPostura(String postura) {
        Postura = postura;
    }

    public String getNivelDeConsciencia() {
        return NivelDeConsciencia;
    }

    public void setNivelDeConsciencia(String nivelDeConsciencia) {
        NivelDeConsciencia = nivelDeConsciencia;
    }

    public int getEscoreCorporal() {
        return EscoreCorporal;
    }

    public void setEscoreCorporal(int escoreCorporal) {
        EscoreCorporal = escoreCorporal;
    }

    public float getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(float temperatura) {
        Temperatura = temperatura;
    }

    public float getFrequenciaRespiratoria() {
        return FrequenciaRespiratoria;
    }

    public void setFrequenciaRespiratoria(float frequenciaRespiratoria) {
        FrequenciaRespiratoria = frequenciaRespiratoria;
    }

    public float getFrequenciaCardiaca() {
        return FrequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(float frequenciaCardiaca) {
        FrequenciaCardiaca = frequenciaCardiaca;
    }

    public int getTempoDePreenchimentoCapilar() {
        return TempoDePreenchimentoCapilar;
    }

    public void setTempoDePreenchimentoCapilar(int tempoDePreenchimentoCapilar) {
        TempoDePreenchimentoCapilar = tempoDePreenchimentoCapilar;
    }

    public int getPulso() {
        return Pulso;
    }

    public void setPulso(int pulso) {
        Pulso = pulso;
    }

    public String getHidratacao() {
        return Hidratacao;
    }

    public void setHidratacao(String hidratacao) {
        Hidratacao = hidratacao;
    }

    public String getLinfonodosSubmand() {
        return LinfonodosSubmand;
    }

    public void setLinfonodosSubmand(String linfonodosSubmand) {
        LinfonodosSubmand = linfonodosSubmand;
    }

    public String getLinfPreEscapulares() {
        return LinfPreEscapulares;
    }

    public void setLinfPreEscapulares(String linfPreEscapulares) {
        LinfPreEscapulares = linfPreEscapulares;
    }

    public String getLinfPopliteos() {
        return LinfPopliteos;
    }

    public void setLinfPopliteos(String linfPopliteos) {
        LinfPopliteos = linfPopliteos;
    }

    public String getLinfInguinais() {
        return LinfInguinais;
    }

    public void setLinfInguinais(String linfInguinais) {
        LinfInguinais = linfInguinais;
    }

    public String getMucosaOcular() {
        return MucosaOcular;
    }

    public void setMucosaOcular(String mucosaOcular) {
        MucosaOcular = mucosaOcular;
    }

    public String getMucosaOral() {
        return MucosaOral;
    }

    public void setMucosaOral(String mucosaOral) {
        MucosaOral = mucosaOral;
    }

    public String getMucosaPenianaVulvar() {
        return MucosaPenianaVulvar;
    }

    public void setMucosaPenianaVulvar(String mucosaPenianaVulvar) {
        MucosaPenianaVulvar = mucosaPenianaVulvar;
    }

    public String getMucosaAnal() {
        return MucosaAnal;
    }

    public void setMucosaAnal(String mucosaAnal) {
        MucosaAnal = mucosaAnal;
    }
}
