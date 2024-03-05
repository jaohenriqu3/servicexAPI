package br.com.joãoherique.app.servicex.domain.Categoria;

import br.com.joãoherique.servicex.servicex.domain.Categoria;
import jakarta.persistence.*;
import lombok.Data;


import java.util.list;

@Data
@Entity
@Table(nome = "Categoria")
public class Categoria (){
    @Id
    @GeneratedValue (strategy = GenerationType.Identy)
    @column (name = "id_categoria")
    private Integer idCategoria
    @column (name = "nome_categoria")
    private String nomeCategoria;
    @column (name = "servicos")
    @OneTomany(mappedBy = "categoria", cascade = cascadeType.ALL)
    private List<Servico> servicos;
}

    public Categoria(){

}