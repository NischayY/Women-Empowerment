package com.example.Women.Empowerment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Women.Empowerment.entity.NGO;
import com.example.Women.Empowerment.exception.NGOAlreadyExistsException;
import com.example.Women.Empowerment.exception.NGONotPresentException;
import com.example.Women.Empowerment.repository.NGORepository;

@Service
public class NGOServiceImpl implements NGOService{
	@Autowired
    private NGORepository ngoRepository;

	@Override
	public List<NGO> getAllNGOs() {
		return ngoRepository.findAll();
	}

	@Override
	public NGO addNGO(NGO ngo) throws NGOAlreadyExistsException{
		if(ngoRepository.existsById(ngo.getId())) {
			throw new NGOAlreadyExistsException();
		}
		return ngoRepository.save(ngo);
	}

	@Override
	public NGO updateNGO(NGO ngo) throws NGONotPresentException{
		if(ngoRepository.existsById(ngo.getId())) {
			return ngoRepository.save(ngo);
		}
		throw new NGONotPresentException();
	}

	@Override
	public String deleteNGO(long id) throws NGONotPresentException{
		Optional<NGO> list=ngoRepository.findById(id);
		if(list.isEmpty()) {
			throw new NGONotPresentException();
		}
		ngoRepository.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Optional<NGO> getNGOById(long id) throws NGONotPresentException{
		Optional<NGO> list=ngoRepository.findById(id);
		if(list.isEmpty()) {
			throw new NGONotPresentException();
		}
		return list;
	}

	@Override
	public Optional<NGO> getNGOByName(String ngoName) throws NGONotPresentException {
		Optional<NGO> list=ngoRepository.findByngoName(ngoName);
		if(list.isEmpty()) {
			throw new NGONotPresentException();
		}
		return list;
	}
}
