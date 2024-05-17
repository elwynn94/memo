package com.sparta.memo.dto;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private final String username;
    private final String contents;

    public MemoRequestDto(String username, String contents) {
        this.username = username;
        this.contents = contents;
    }
}