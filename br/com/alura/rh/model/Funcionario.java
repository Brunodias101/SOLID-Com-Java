package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public String getNome() {
        return dadosPessoais.getNome();
    }

    public String getCpf() {
        return dadosPessoais.getCpf();
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

    public BigDecimal getSalario() {
        return dadosPessoais.getSalario();
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

}
