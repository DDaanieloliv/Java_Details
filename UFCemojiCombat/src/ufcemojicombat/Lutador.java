package ufcemojicombat;
/**
 *
 * @author Mary
 */
public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates; 
    
    //METODOS PUBLICOS
    public void  apresentar() {
        System.out.println("--------------------------------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Origem " + this.getNacionalidade());
        System.out.println(this.getIdade() + "anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println("Ganhou " + getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empatou " + getEmpates());
    }
    public void status() {
        System.out.println("--------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    public void ganharLuta() {
       this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    //METODOS ESPECIAIS
    public  Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome; 
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.idade = idade;
        //this.peso = peso; Este comando não chamará a "Categoria" do Lutador porem ao usarmos o "setCategoria" isso sera possivel devido o seu codigo interno.
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome; 
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    private void setCategoria(){
        if (this.peso < 52.2) {
            this.categoria = "Invalida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    public String getCategoria() {
        return categoria;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    } 
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
