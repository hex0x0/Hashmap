import java.util.Date;

public class LogEntry {
    private String nome;
    private Date moment;

  
    public LogEntry(String nome, Date moment) {
        this.nome = nome;
        this.moment = moment;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String toString(){
        return "[NOME] = " + this.nome + " [MOMENT] = " + this.moment;
    }
    

}
