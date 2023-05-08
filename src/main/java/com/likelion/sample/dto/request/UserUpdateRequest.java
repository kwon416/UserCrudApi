package com.likelion.sample.dto.request;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequest {
    private Long id;
    private String name;
}
