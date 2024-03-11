package br.com.joãoherique.app.servicex.categoria.resourced;

import br.com.joãoherique.servicex.servicex.domain.Categoria;
import br.com.joãoherique.servicex.servicex.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    @Autowired
    private CategoriaService categoriaService;

    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria){

        Categoria novaCategoria = categoriaService.criarCategoria(categoria);
        return  new ResponseEntity<>(novaCategoria, HttpStatus.CREATED);
    }