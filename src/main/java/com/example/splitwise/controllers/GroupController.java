package com.example.splitwise.controllers;

import com.example.splitwise.dtos.*;
import com.example.splitwise.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {

    private GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    public CreateGroupResponseDto createGroup(CreateGroupRequestDto requestDto){
        CreateGroupResponseDto responseDto = new CreateGroupResponseDto();
        try{
            responseDto.setGroup(groupService.createGroup(requestDto.getName(), requestDto.getDescription(), requestDto.getCreatorUserId()));
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }

    public DeleteGroupResponseDto deleteGroup(DeleteGroupRequestDto requestDto){
        DeleteGroupResponseDto responseDto = new DeleteGroupResponseDto();
        try{
            groupService.deleteGroup(requestDto.getGroupId(), requestDto.getUserId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            e.printStackTrace();
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
    public AddMemberResponseDto addMember(AddMemberRequestDto requestDto){
        AddMemberResponseDto responseDto = new AddMemberResponseDto();
        try{
            responseDto.setGroupMember(groupService.addMember(requestDto.getGroupId(), requestDto.getAdminId(), requestDto.getMemberId()));
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }

    public RemoveMemberResponseDto removeMember(RemoveMemberRequestDto requestDto){
        RemoveMemberResponseDto responseDto = new RemoveMemberResponseDto();
        try{
            groupService.removeMember(requestDto.getGroupId(), requestDto.getAdminId(), requestDto.getMemberId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            e.printStackTrace();
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }

    public FetchMembersResponseDto fetchMembers(FetchMembersRequestDto requestDto){
        FetchMembersResponseDto responseDto = new FetchMembersResponseDto();
        try{
            responseDto.setMembers(groupService.fetchAllMembers(requestDto.getGroupId(), requestDto.getMemberId()));
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
