package com.library.mainclassification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.mainclassification.entity.MainClassification;

public interface MainClassificationRepository extends JpaRepository<MainClassification, Long> {
	MainClassification findMainClassificationByMainClassId(Long mainClassId);
//	List<MainClassification> findMainClassificationByMainClassId(Long mainClassId);
}