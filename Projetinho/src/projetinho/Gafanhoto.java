package projetinho;
public class Gafanhoto extends Pessoa {
    //ATRIBUTOS
    private String login;
    private int totAssistido;

    
    public Gafanhoto(String nome, int idade, String sexo , String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //METODOS ESPECIAIS
    
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    
    public int getTotAssistido(){
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido){
        this.totAssistido = totAssistido;
    }
    
    //METODOS
    public void viuMaisUm(){
        this.totAssistido ++;
    } 

    // O 'super' abaixo irá chamar o toString da superClasse 'Pessoa'
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }

   
    
    
    
}
