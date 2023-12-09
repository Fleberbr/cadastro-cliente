package br.com.portfolio.elton.cadastrocliente.view.repository;


import br.com.portfolio.elton.cadastrocliente.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //O spring cria um instancia desse repositorio, que terá conexão do BD.
public interface ClienteRepository extends JpaRepository<Pessoa, Integer> {

}
