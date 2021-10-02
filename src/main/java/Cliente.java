public class Cliente {
    private String nome;
    private String sobrenome;
    private  int cpf;
    private Carro carroDoCliente;

    public Cliente(String nome, String sobrenome, int cpf, Carro carroDoCliente) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.carroDoCliente = carroDoCliente;
    }
    public String obterCliente(){
        return "Cliente{" +
                "Nome: "+ this.nome +  '\'' +
                ", Sobrenome: " + this.sobrenome +  '\'' +
                ", CPF: " + this.cpf + '\'' +
                ", modelo: '" + carroDoCliente.getModelo() + '\''+
                ", ano: '" + carroDoCliente.getAno() + '\'' +
                ", cor: '" + carroDoCliente.getCor() + '\'' +
                '}';
    }
}
