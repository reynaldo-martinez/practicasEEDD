
package Entidades;

public abstract class Horarios {
    private String Dia1;
    private String Horario1;
    private String Dia2;
    private String Horario2;

    public Horarios(String Dia1, String Horario1, String Dia2, String Horario2) {
        this.Dia1 = Dia1;
        this.Horario1 = Horario1;
        this.Dia2 = Dia2;
        this.Horario2 = Horario2;
    }

    public String getDia1() {
        return Dia1;
    }

    public void setDia1(String Dia1) {
        this.Dia1 = Dia1;
    }

    public String getHorario1() {
        return Horario1;
    }

    public void setHorario1(String Horario1) {
        this.Horario1 = Horario1;
    }

    public String getDia2() {
        return Dia2;
    }

    public void setDia2(String Dia2) {
        this.Dia2 = Dia2;
    }

    public String getHorario2() {
        return Horario2;
    }

    public void setHorario2(String Horario2) {
        this.Horario2 = Horario2;
    }
    
}
