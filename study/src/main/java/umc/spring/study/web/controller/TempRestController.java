package umc.spring.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.study.api.ApiResponse;
import umc.spring.study.converter.TempConverter;
import umc.spring.study.service.TempService.TempQueryService;
import umc.spring.study.web.dto.TempResponseDTO;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {

    private final TempQueryService tempQueryService;

    // Test API
    @GetMapping("/test")
    public ApiResponse<TempResponseDTO.TempTestDTO> testAPI(){

        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }

    // 예외처리 API
    @GetMapping("/exception")
    public ApiResponse<TempResponseDTO.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag);
        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));
    }
}
