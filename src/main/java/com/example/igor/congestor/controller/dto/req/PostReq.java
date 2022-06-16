package com.example.igor.congestor.controller.dto.req;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class PostReq implements Serializable {

    @NotBlank
    private String title;
    @NotBlank
    private String body;
}
