package umc.spring.study.web.dto;

import lombok.Getter;

import java.util.List;

public class UserRequestDTO {

    @Getter
    public static class JoinDto{
        String name;
        Integer gender;
        Integer birthYear;
        Integer birthMonth;
        Integer birthDay;
        String address;
        String specAddress;
        String phone_number;
        List<Long> preferCategory;
    }
}
