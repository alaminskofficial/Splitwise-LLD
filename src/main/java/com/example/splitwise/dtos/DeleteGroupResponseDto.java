package com.example.splitwise.dtos;

import lombok.Data;

@Data
public class DeleteGroupResponseDto {
    private ResponseStatus responseStatus;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
