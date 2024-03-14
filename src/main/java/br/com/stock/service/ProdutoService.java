package br.com.stock.service;

import br.com.stock.model.Produto;
import br.com.stock.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private ProductRepository productRepository;

    public List<Produto> getAllProdutos() {
        return productRepository.findAll();
    }

    public Object cadastrar(Produto produto) {
    }


    public void atualizar(Produto produto) {
        Produto produtoEscolhido = productRepository.findById(produto.getId());
        produtoEscolhido.setNome(produto.getNome());
    }
}
