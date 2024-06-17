package umc.spring.study.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class StoreRequestDTO {

    @Getter
    public static class ReveiwDTO{

        // 리뷰 내용
        String body;

        // 리뷰 평점
        Float score;
    }
}
