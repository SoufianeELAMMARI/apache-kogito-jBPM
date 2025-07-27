package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ProcessInstanceEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String processId;
    private String businessKey;

    // getters and setters
}