package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessInstanceRepository extends JpaRepository<ProcessInstanceEntity, Long> {
    ProcessInstanceEntity findByBusinessKey(String businessKey);
}