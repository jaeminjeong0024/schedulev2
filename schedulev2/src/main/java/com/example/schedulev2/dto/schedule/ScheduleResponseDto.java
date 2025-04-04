package com.example.schedulev2.dto.schedule;


import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private final Long id;
    private final String userName;
    private final String title;
    private final String content;

    public ScheduleResponseDto(Long id, String userName, String title, String content) {
        this.id = id;
        this.userName = userName;
        this.title = title;
        this.content = content;
    }
}
