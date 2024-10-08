package pe.edu.upeu.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
