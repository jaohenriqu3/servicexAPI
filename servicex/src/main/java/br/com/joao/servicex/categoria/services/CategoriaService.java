package br.com.joãoherique.app.servicex.categoria.services;

import br.com.joãoherique.app.servicex.categoria.domain.Categoria;
import br.com.joãoherique.app.servicex.categoria.services.CategoriaService;
import org.springframework.beans.factory.annotation.AutoWired;
import org.springFramework.http.HttpStatus;
import org.springframework.stereotype.Services;
import org.springFramework.http.ResponsEntity;
import org.springFramework.web.bind.annotation.PostMapping;
import org.springFramework.web.bind.annotation.RequestBody;
import org.springFramework.web.bind.annotation.RequestMapping;
import org.springFramework.web.bind.annotation.RestController;

import Java.util.list;
import Java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    private Categoria criarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria)
    }

    public List<Categoria> listarCategoria(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarCategoria(Integer idCategoria){
        return categoriaRepository.findById(idCategoria)
    }

    public Categoris atualizarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria)
    }

    public void deletarCategoria(Integer idCategoria){
        categoriaRepository.deleteById(idCategoria)
    }
}
