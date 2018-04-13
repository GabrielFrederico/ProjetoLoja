package br.com.satc.objeto;

import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente Cliente;
    private ArrayList<Produto> produto = new ArrayList<>();
    private float totalAPagar;
    private char status;

    public Venda(int id, Cliente Cliente, char status) {
        this.id = id;
        this.Cliente = Cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public float getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(float totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
}
