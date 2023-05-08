//package com.likelion.sample.controller;
//
//import com.likelion.sample.dto.FirebaseUser;
//import com.likelion.sample.service.FirebaseUserService;
//import com.likelion.sample.service.FirebaseUserServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.concurrent.ExecutionException;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/v1")
//public class FirebaseUserController {
//    private final FirebaseUserService firebaseUserService;
//
//    @GetMapping("/userList")
//    public ResponseEntity<Object> getUserList() throws ExecutionException, InterruptedException {
//        List<FirebaseUser> list = firebaseUserService.getUserList();
//        System.out.println(list.get(0));
//        return ResponseEntity.ok().body(list);
//    }
//
//    @GetMapping("/winkTo")
//    public void winkSend(@RequestParam String phoneNo) {
//
//    }
//}
