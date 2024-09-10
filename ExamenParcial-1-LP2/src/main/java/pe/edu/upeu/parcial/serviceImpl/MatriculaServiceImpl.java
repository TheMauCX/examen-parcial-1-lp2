package pe.edu.upeu.parcial.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial.dao.MatriculaDao;
import pe.edu.upeu.parcial.entity.Matricula;
import pe.edu.upeu.parcial.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaDao dao;
	
	@Override
	public Matricula create(Matricula c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Matricula update(Matricula c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
