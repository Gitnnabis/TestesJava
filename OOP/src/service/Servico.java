package service;

import entity.Cliente;
import entity.ContaCorrente;

public class Servico {
    public void transferencia(ContaCorrente quemEnvia, ContaCorrente quemRecebe, double valor){
        quemEnvia.setSaldo(quemEnvia.getSaldo() - valor);
        quemRecebe.setSaldo(quemRecebe.getSaldo() + valor);
    }
}
