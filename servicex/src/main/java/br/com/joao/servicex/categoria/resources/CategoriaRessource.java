package br.com.joãoherique.app.servicex.categoria.resourced;

import br.com.joãoherique.servicex.servicex.domain.Categoria;


@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

    @AutoWired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria){
    Categoria novaCategoria = categoriaService.criarCategoria(categoria);
        return new ResponseEntity<>(novaCategoria, HttpStatus.CREATED)
    }

}