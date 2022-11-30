package Anamnese;

public class AnamneseGeral {
    private String QueixaPrincipal;
    private String HistoricoMedicoPregresso;
    private String Alimentacao;
    private String Contactantes;
    private String Vacinacao;
    private String Vermifugacao;
    private String AmbienteEmQueVive;

    public AnamneseGeral(String queixaPrincipal, String historicoMedicoPregresso, String alimentacao, String contactantes, String vacinacao, String vermifugacao, String ambienteEmQueVive) {
        QueixaPrincipal = queixaPrincipal;
        HistoricoMedicoPregresso = historicoMedicoPregresso;
        Alimentacao = alimentacao;
        Contactantes = contactantes;
        Vacinacao = vacinacao;
        Vermifugacao = vermifugacao;
        AmbienteEmQueVive = ambienteEmQueVive;
    }

    public String getQueixaPrincipal() {
        return QueixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        QueixaPrincipal = queixaPrincipal;
    }

    public String getHistoricoMedicoPregresso() {
        return HistoricoMedicoPregresso;
    }

    public void setHistoricoMedicoPregresso(String historicoMedicoPregresso) {
        HistoricoMedicoPregresso = historicoMedicoPregresso;
    }

    public String getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }

    public String getContactantes() {
        return Contactantes;
    }

    public void setContactantes(String contactantes) {
        Contactantes = contactantes;
    }

    public String getVacinacao() {
        return Vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        Vacinacao = vacinacao;
    }

    public String getVermifugacao() {
        return Vermifugacao;
    }

    public void setVermifugacao(String vermifugacao) {
        Vermifugacao = vermifugacao;
    }

    public String getAmbienteEmQueVive() {
        return AmbienteEmQueVive;
    }

    public void setAmbienteEmQueVive(String ambienteEmQueVive) {
        AmbienteEmQueVive = ambienteEmQueVive;
    }
}
