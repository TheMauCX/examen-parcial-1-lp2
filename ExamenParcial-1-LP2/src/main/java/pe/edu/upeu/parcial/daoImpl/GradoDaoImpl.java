package pe.edu.upeu.parcial.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import pe.edu.upeu.parcial.dao.GradoDao;
import pe.edu.upeu.parcial.entity.Grado;
import pe.edu.upeu.parcial.repository.GradoRepository;

@Component
public class GradoDaoImpl implements GradoDao{

	@Autowired
	private GradoRepository repository;

	
	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
