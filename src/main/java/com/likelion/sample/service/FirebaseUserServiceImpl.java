//package com.likelion.sample.service;
//
//import com.likelion.sample.dao.FirebaseUserDao;
//import com.likelion.sample.dto.FirebaseUser;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.stereotype.Service;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
//@Service
//@RequiredArgsConstructor
//public class FirebaseUserServiceImpl implements FirebaseUserService {
//
//    private final FirebaseUserDao firebaseUserDao;
//
//    @Override
//    public List<FirebaseUser> getUserList() throws ExecutionException, InterruptedException {
//        CompletableFuture<List<FirebaseUser>> completableFuture =  firebaseUserDao.getUserList();
//        return completableFuture.get();
//    }
//
//
//
//    public String sendWinkNotification(String fcmToken) {
//        final RestTemplate restTemplate = new RestTemplate();
//
//        String baseUrl = "https://fcm.googleapis.com/fcm/send?";
//
//        //헤더
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.add("Authorization", "key=AAAAzpC9Qmk:APA91bGpWj1uIQJWsj4XSGk9rcBUknFtUose_Pxz0vHYYgtvZ69KFLpHFrOfnUwWVdI71q-r34iwW0fzy7nxvn2WR3YCBUJd53d0RP8wQ353jZDoRpMU50SU0v7zvtlpcNKXF6qnoAzQ");
//
//        MultiValueMap<String, Object> data = new LinkedMultiValueMap<>();
//
//        MultiValueMap<String, Object> notification = new LinkedMultiValueMap<>();
//
//
//        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
//        params.add("to", fcmToken);
//        params.add("collapse_key", "type_a");
//        params.add("notification", notification);
//        params.add("data", data);
//
//        //헤더 + 바디 오브젝트
//        HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(params, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(baseUrl, HttpMethod.POST, entity, String.class);
//
//        if (response.getStatusCode() == HttpStatus.OK) {
//            return response.getBody();
//        } else {
//            throw new RuntimeException("Failed to call external API: " + response.getStatusCode());
//        }
//    }
//}
