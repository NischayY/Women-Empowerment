package com.example.Women.Empowerment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Women.Empowerment.entity.NGO;

@Repository
public interface NGORepository extends JpaRepository<NGO,Long>{
	
	public Optional<NGO> findByngoName(String ngoName);
}
