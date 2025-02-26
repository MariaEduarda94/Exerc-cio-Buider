package atv3;
public class RelatorioBuilder {
    private String titulo;
    private String corpo;
    private String rodape;
    public RelatorioBuilder setTitulo(String titulo){
        this.titulo = titulo;
        return this;
    }
    public RelatorioBuilder setCorpo(String corpo){
        this.corpo = corpo;
        return this;
    }
    public RelatorioBuilder setRodape(String rodape){
        this.rodape = rodape;
        return this;
    }
    public Relatorio build(){
        return new Relatorio(this);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getCorpo() {
        return corpo;
    }
    public String getRodape() {
        return rodape;
    }
}
