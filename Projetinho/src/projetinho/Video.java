package projetinho;
public class Video implements AcoesVideo{ // Usa-se 'implements' e não extends pois os metodos não são implementados na 'interface -> "AcoesVideo"'
    //ATRIBUTOS
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //METODOS ESPECIAIS
    public Video(String titulo){
        this.titulo = titulo;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.views = 0;
        this.avaliacao = 1;
    }
    
    public String getTitulo(){
        return titulo; 
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova;
        nova = (int) (this.avaliacao + avaliacao) / this.views;
        
        this.avaliacao = nova;
    }
    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    @Override 
    public void play(){
        this.reproduzindo = true;
    }
    
    @Override
    public void pouse(){
        this.reproduzindo = false;
    }
    
    @Override
    public void like(){
        this.setCurtidas(getCurtidas() + 1);
        // same
        // this.curtidas = curtidas + 1;
        // this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
