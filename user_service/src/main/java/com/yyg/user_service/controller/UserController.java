package com.yyg.user_service.controller;


import com.yyg.user_service.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
@Slf4j
public class UserController {

    // id查询用户
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public UserDto getUserById(@RequestParam Integer id) {
        log.info("get user by id: {}", id);
        return new UserDto(1L).setName("yyg").setEmail("2289201033@qq.com");
    }

    // 添加用户
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Integer addUser(@RequestBody UserDto userDto) {
        log.info("add user: {}", userDto);
        return (int) (System.currentTimeMillis() / 1000);
    }

}
