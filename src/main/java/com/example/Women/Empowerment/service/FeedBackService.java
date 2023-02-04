package com.example.Women.Empowerment.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.example.Women.Empowerment.entity.FeedBack;
import com.example.Women.Empowerment.exception.FeedBackAlreadyExistsException;
import com.example.Women.Empowerment.exception.FeedBackNotPresentException;

public interface FeedBackService {
	FeedBack addFeedBack(FeedBack feedback) throws FeedBackAlreadyExistsException;

	List<FeedBack> getAllFeedBack();

	FeedBack updateFeedBack(FeedBack feedback) throws FeedBackNotPresentException;

	String deleteFeedBackById(long feedBackId) throws FeedBackNotPresentException;

	Optional<FeedBack> getFeedBackById(long feedBackId) throws FeedBackNotPresentException;

	List<FeedBack> getFeedBackByDate(LocalDate feedBackDate) throws FeedBackNotPresentException;
}
