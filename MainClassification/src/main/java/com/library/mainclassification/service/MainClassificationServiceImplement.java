package com.library.mainclassification.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.mainclassification.entity.MainClassification;
import com.library.mainclassification.repository.MainClassificationRepository;

@Service
public class MainClassificationServiceImplement implements MainClassificationService {

	@Autowired
	MainClassificationRepository mainClassificationRepository;

	@Override
	public MainClassification save(MainClassification mainClass) {
		return mainClassificationRepository.save(mainClass);
	}

	@Override
	public List<MainClassification> getAllMainClass() {
		return mainClassificationRepository.findAll();
	}

	@Override
	public MainClassification getMainClassificationById(Long mainClassId) {
		return mainClassificationRepository.findMainClassificationByMainClassId(mainClassId);
	}

	@Override
	public MainClassification deleteMainClassificationById(Long mainClassId) {
		mainClassificationRepository.deleteById(mainClassId);
		return null;
	}

	@Override
	public void updateMainClassification(MainClassification mainClass) {
		Long mainClassId = mainClass.getMainClassId();
		boolean isExist = mainClassificationRepository.findMainClassificationByMainClassId(mainClassId) != null;
		if (isExist) {
			mainClassificationRepository.save(mainClass);
		}
	}


}