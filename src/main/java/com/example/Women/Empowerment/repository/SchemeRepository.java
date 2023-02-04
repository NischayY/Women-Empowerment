package com.example.Women.Empowerment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Women.Empowerment.entity.Scheme;

@Repository
public interface SchemeRepository extends JpaRepository<Scheme,Long>{
	
	public Optional<Scheme> findByschemeName(String schemeName);
	
}
