package com.likelion.sample.dto.response;

import com.likelion.sample.domain.user.User;
import lombok.Getter;

@Getter
public class UserResponse {
    private Long id;
    private String name;
    private Integer age;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.age = user.getAge();
    }
}
