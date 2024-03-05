package br.com.joãoherique.app.servicex.domain.Servico;

import br.com.joãoherique.servicex.servicex.domain.Servico;
import jakarta.persistence.*;
import lombok.Data;

import java.util.list;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="servicos")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (nome = "id_servico")
    private Integrer idServico;
    @Column (nome = "nome_servico")
    private String nomeServico;
    @Column (nome = "valor_servico")
    private double valor;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
}