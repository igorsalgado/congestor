package com.example.igor.congestor.controller.dto.filter;

import lombok.*;

import java.io.Serializable;

@Data
public class PostFilter implements Serializable {

    private Long id;
    private String title;
    private String body;
    private String any;
}
