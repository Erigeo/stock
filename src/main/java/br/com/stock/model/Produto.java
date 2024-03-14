package br.com.stock.model;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private double precoCusto;
    private double precoVenda;


    public Produto(){

    }

    public Produto(Long id, String nome, String descricao, double precoCusto, double precoVenda){
        this.nome = nome;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
