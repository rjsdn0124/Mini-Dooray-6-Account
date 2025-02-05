package com.nhnacademy.account.user.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
@AllArgsConstructor
public class UserUpdateDto {

    private String id;
    private String email;
}
