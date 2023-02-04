package com.example.Women.Empowerment.service;

import java.util.List;
import java.util.Optional;

import com.example.Women.Empowerment.entity.NGO;
import com.example.Women.Empowerment.exception.NGOAlreadyExistsException;
import com.example.Women.Empowerment.exception.NGONotPresentException;

public interface NGOService {
List<NGO> getAllNGOs();
    
    NGO addNGO(NGO ngo) throws NGOAlreadyExistsException;
    
    NGO updateNGO(NGO ngo) throws NGONotPresentException;
    
    String deleteNGO(long id) throws NGONotPresentException;

	Optional<NGO> getNGOById(long id) throws NGONotPresentException;
	
	Optional<NGO> getNGOByName(String ngoName) throws NGONotPresentException;
}
