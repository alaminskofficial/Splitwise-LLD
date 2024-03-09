package com.example.splitwise.dtos;

import lombok.Data;

@Data
public class DeleteGroupRequestDto {
    private long groupId;
    private long userId;

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
