package com.example.splitwise.dtos;

import lombok.Data;

@Data
public class SettleGroupRequestDto {
    private long groupId;

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
