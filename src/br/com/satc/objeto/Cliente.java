package br.com.satc.objeto;

import java.util.Date;

public class Cliente extends Pessoa {
    private int id,idade;
    private Date dataCadastro;
    private char status;

    public Cliente(int id, int idade, Date dataCadastro, char status, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.id = id;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    
}