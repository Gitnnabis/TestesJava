package entity;

public class ContaCorrente {
    Cliente cliente;
    double saldo;
    String agencia;
    String nConta;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                ", agencia='" + agencia + '\'' +
                ", nConta='" + nConta + '\'' +
                '}';
    }
}
