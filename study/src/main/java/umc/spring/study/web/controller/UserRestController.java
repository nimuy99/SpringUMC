package umc.spring.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.study.api.ApiResponse;
import umc.spring.study.converter.UserConverter;
import umc.spring.study.domain.User;
import umc.spring.study.service.UserService.UserCommandService;
import umc.spring.study.web.dto.UserRequestDTO;
import umc.spring.study.web.dto.UserResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRestController {

    private final UserCommandService userCommandService;

    @PostMapping("/")
    public ApiResponse<UserResponseDTO.JoinResultDTO> join(
            @RequestBody @Valid UserRequestDTO.JoinDto request){
        User user = userCommandService.joinUser(request);
        return ApiResponse.onSuccess(UserConverter.toJoinResultDTO(user));
    }
}
