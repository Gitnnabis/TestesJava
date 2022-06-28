import entity.Cliente;
import entity.ContaCorrente;
import service.Servico;

public class Main {
    public static void main(String[] args) {

        Servico servico = new Servico();

        //banco fake
        Cliente cli1 = new Cliente();
        cli1.setNome("Matheus Cunha");
        cli1.setCpf("040.060.050-53");
        cli1.setEmail("matheus.closer@hotmail.com");
        cli1.setIdade(12);

        Cliente cli2 = new Cliente();
        cli1.setNome("Tamara");
        cli1.setCpf("040.060.040-53");
        cli1.setEmail("tamara.closerfc@hotmail.com");
        cli1.setIdade(6);

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setCliente(cli1);
        cc1.setAgencia("001");
        cc1.setnConta("4050");
        cc1.setSaldo(50);

        ContaCorrente cc2 = new ContaCorrente();
        cc2.setCliente(cli2);
        cc2.setAgencia("002");
        cc2.setnConta("5050");
        cc2.setSaldo(60);

        servico.transferencia(cc1, cc2, 20);

        }
}
