package com.likelion.sample.service.user;

import com.likelion.sample.domain.user.User;
import com.likelion.sample.dto.request.UserUpdateRequest;
import com.likelion.sample.dto.response.UserResponse;
import com.likelion.sample.dto.request.UserCreateRequest;
import com.likelion.sample.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserCreateRequest request) {
        userRepository.save(new User(request.getName(), request.getAge()));
    }

    public void deleteUser(String name) {
        //findBy{value} -- value 값으로 검색해줌
        User user = userRepository.findByName(name).orElseThrow(IllegalArgumentException::new);
        userRepository.delete(user);
    }

    public List<UserResponse> getUsers() {
        //DB 에서 모든 목록을 찾아서 stream 으로 변환 후
        // stream().map() 을 이용하여 매핑
//        return userRepository.findAll().stream()
//                .map(user-> new UserResponse(user.getId(), user.getName(), user.getAge()))
//                .collect(Collectors.toList());
        //Lambda 식을 사용하여 findAll() 을 이용해 찾은 모든 User 객체에서 필드들을 추출해
        // 새로운 UserResponse 타입의 객체로 변환 후 stream.collect 를 이용해 다시 list 타입으로 변환한다.

        //UserResponse 의 생성자를 참조하여 매핑한다
        return userRepository.findAll().stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }

    public void updateUser(UserUpdateRequest request) {
        User user = userRepository.findById(request.getId()).orElseThrow(IllegalArgumentException::new);
        user.setName(request.getName());
        userRepository.save(user);
    }
}
