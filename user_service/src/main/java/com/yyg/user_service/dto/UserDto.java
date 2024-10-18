package com.yyg.user_service.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserDto {
    @NonNull
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String role;
    private String status;
    private String createTime;
    private String updateTime;
    private String lastLoginTime;
    private String lastLoginIp;
    private String introduction;
    private String avatar;
}



