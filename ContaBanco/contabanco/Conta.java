package contabanco;

public class Conta {

//  ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo; 
    private boolean status;


    //  METODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }   
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
           System.out.println("Conta não pode ser fechada porque ainda tem dinheiro."); 
        } else if(this.getSaldo() <  0 ) {
           System.out.println("Conta não pode ser fechada pois tem debito.");
        } else {
           this.setStatus(false); 
           System.out.println("Conta fechada com sucesso.");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {     // --> essa linha equivale a (saldo == true)
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta Fechada.");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossivel sacar CONTA FECHADA.");
        }
    }
    public void pagarMensal(){
        float v = 0 ;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {  
                v = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }

    //  METODOS ESPECIAIS
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
        
        //  this.saldo = 0f;
        //  this.status = false;
    }

    
    
    public void setnumConta(int numConta){
        this.numConta = numConta;
    }

    public Integer getnumConta(){
        return this.numConta;
    }

    public void setTipo(String tipo){ 
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }
	
}
