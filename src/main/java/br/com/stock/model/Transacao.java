package br.com.stock.model;

import java.time.LocalDate;

//TODO missing idUsuario and idProdutoEstoque
public class Transacao {
    private int id;
    private int idUsuario;
    private int idProdutoEstoque;
    private int volume;
    private char tipo;
    private LocalDate data;
}
