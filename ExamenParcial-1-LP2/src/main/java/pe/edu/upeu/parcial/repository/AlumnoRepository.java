package pe.edu.upeu.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
