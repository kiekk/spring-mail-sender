package com.example.mailsender.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    private int id; // 번호
    private String text; // 할일
    private boolean isDone; // 완료 여부
    private Date createDate; // 생성일

}
