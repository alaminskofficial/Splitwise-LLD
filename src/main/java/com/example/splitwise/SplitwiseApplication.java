package com.example.splitwise;

import com.example.splitwise.controllers.GroupController;
import com.example.splitwise.controllers.SettleUpController;

import com.example.splitwise.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {
    @Autowired
    GroupController groupController;


    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        SettleUserRequestDto settleUserRequestDto = new SettleUserRequestDto();
//        settleUserRequestDto.setUserId(102);
//        SettleUserResponseDto responseDto = settleUpController.settleUser(settleUserRequestDto);

//        CreateGroupRequestDto requestDto = new CreateGroupRequestDto();
//        requestDto.setDescription("Kerala trip with office colleage");
//        requestDto.setName("kerala trip");
//        requestDto.setCreatorUserId(102);
//        CreateGroupResponseDto responseDto = groupController.createGroup(requestDto);

        AddMemberRequestDto requestDto = new AddMemberRequestDto();
        requestDto.setGroupId(203);
        requestDto.setAdminId(102);
        requestDto.setMemberId(101);
          AddMemberResponseDto responseDto = groupController.addMember(requestDto);

    }
}
