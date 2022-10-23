package Agendamento;

public class Agendamento {
    private String DiaDaConsulta;
    private String HoraDaConsulta;
    private String Motivo;

    public Agendamento(String diaDaConsulta, String horaDaConsulta, String motivo) {
        DiaDaConsulta = diaDaConsulta;
        HoraDaConsulta = horaDaConsulta;
        Motivo = motivo;
    }

    public String getDiaDaConsulta() {
        return DiaDaConsulta;
    }

    public void setDiaDaConsulta(String diaDaConsulta) {
        DiaDaConsulta = diaDaConsulta;
    }

    public String getHoraDaConsulta() {
        return HoraDaConsulta;
    }

    public void setHoraDaConsulta(String horaDaConsulta) {
        HoraDaConsulta = horaDaConsulta;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }
}
