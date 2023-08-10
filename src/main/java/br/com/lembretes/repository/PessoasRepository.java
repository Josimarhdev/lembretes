package br.com.lembretes.repository;

import br.com.lembretes.entity.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoasRepository extends JpaRepository<Pessoas, Long> {

    Pessoas findByNome(String nome);



}
