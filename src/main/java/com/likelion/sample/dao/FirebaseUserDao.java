//package com.likelion.sample.dao;
//
//import com.google.firebase.database.*;
//import com.likelion.sample.dto.FirebaseUser;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
//@Repository
//@Slf4j
//public class FirebaseUserDao {
//
////    public static final String COLLECTION_NAME = "user";
//
////    public FirebaseUser firebaseUser = new FirebaseUser();
//
//
//
//    @Async
//    public CompletableFuture<List<FirebaseUser>> getUserList() throws ExecutionException, InterruptedException {
//        List<FirebaseUser> list = new ArrayList<>();
//        CompletableFuture<List<FirebaseUser>> completableFuture = new CompletableFuture<>();
//
//        try {
//            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("/user");
//
//            ref.addListenerForSingleValueEvent(new ValueEventListener() {
//                @Override
//                public void onDataChange(DataSnapshot dataSnapshot) {
//                    if (dataSnapshot != null) {
//                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                            FirebaseUser obj = snapshot.getValue(FirebaseUser.class);
//                            list.add(obj);
//                        }
//                        completableFuture.complete(list);
//                    }
//                }
//                @Override
//                public void onCancelled(DatabaseError error) {
//                    //handle error
//                }
//            });
//        } catch (Exception error) {
//
//            throw error;
//        }
//
//        return completableFuture;
//    }
//
////    public String xxx() throws ExecutionException, InterruptedException {
////        return '';
////    }
//}
//
