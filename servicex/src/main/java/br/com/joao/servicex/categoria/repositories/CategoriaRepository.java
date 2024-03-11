package br.com.joãoherique.app.servicex.domain.Categoria;

import br.com.joãoherique.servicex.servicex.domain.Categoria;
import org.springframework.data.jpa.repository.JPArepository;
import org.springframework.stereotype.Repository;

@Repository{
    public interface CategoriaRepository extends JpaRepository<Categoria, integer > {
}
    }

