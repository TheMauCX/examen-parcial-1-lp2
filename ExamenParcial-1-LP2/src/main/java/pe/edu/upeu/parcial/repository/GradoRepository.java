package pe.edu.upeu.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial.entity.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Long>{

}
