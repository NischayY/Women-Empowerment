package com.example.Women.Empowerment.service;

import java.util.List;
import java.util.Optional;

import com.example.Women.Empowerment.entity.Trainee;
import com.example.Women.Empowerment.entity.TraineeCourse;
import com.example.Women.Empowerment.exception.TraineeAlreadyExistsException;
import com.example.Women.Empowerment.exception.TraineeNotPresentException;

public interface TraineeService {
	
	String addTrainee(Trainee tr) throws TraineeAlreadyExistsException; 
	
	List<Trainee> getAllTrainee();
	
	Optional<Trainee> getTraineeById(long traineeId) throws TraineeNotPresentException;
	
	String deleteTrainee(long traineeId) throws TraineeNotPresentException;
	
	Trainee updateTrainee(Trainee s) throws TraineeNotPresentException;
	
	Optional<Trainee> getTraineeByName(String firstName) throws TraineeNotPresentException;

	Trainee updateTraineeById(Trainee tr, long traineeId) throws TraineeNotPresentException;

	Trainee updateCourse(List<TraineeCourse> cr, long traineeId) throws TraineeNotPresentException;

	String loginTrainee(Trainee trainee);
}
