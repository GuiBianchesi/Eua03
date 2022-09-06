
public class ContaPoupanca {
    String agencia;
    String numero;
    float saldo;
    float taxa;
    public ContaPoupanca() {
        //Método construtor vazio
    }
    /*Método construtor com atríbutos */
    public ContaPoupanca(String a, String n, float s, float t){
        agencia = a;
        numero = n;
        saldo = s;
        taxa = t;
    }
    /*Método sem retorno */
    void imprimeDados(){
System.out.println("*************");
System.out.println("Bem vindo ao Banco seu dinheiro");
System.out.println("Agencia: "+agencia);
System.out.println("Número: "+numero);
System.out.println("Saldo: "+saldo);
System.out.println("Taxa: "+taxa);
System.out.println("************");
    }
    /*Método sem retorno com paramêtro */
    void depositar(float valor){
        saldo = saldo +valor;

    }
    // Método com retorno sem paramêtros
float calcularRendimento(){
    float rendimento;
    rendimento = saldo *taxa/100;
    return rendimento;
}
}
