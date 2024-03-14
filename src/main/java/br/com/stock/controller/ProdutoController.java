package br.com.stock.controller;

import br.com.stock.model.Produto;
import br.com.stock.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
private ProdutoService service;

@GetMapping
    public List<Produto> Listar(){
        return service.getAllProdutos();
}

@PostMapping
    public String cadastrarProduto(@RequestBody Produto produto){
         service.cadastrar(produto);
         return "cadastrado";
}

@PutMapping
    public String editarProduto( @RequestBody Produto produto){
    service.atualizar(produto);
    return "produto alterado";
}

}
