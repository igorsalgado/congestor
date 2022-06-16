package com.example.igor.congestor.controller.dto.res;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class PostRes implements Serializable {

    private Long id;
    private String title;
    private String body;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}
