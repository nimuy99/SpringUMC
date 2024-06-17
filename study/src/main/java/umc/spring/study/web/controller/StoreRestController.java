package umc.spring.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import umc.spring.study.api.ApiResponse;
import umc.spring.study.converter.StoreConverter;
import umc.spring.study.domain.Review;
import umc.spring.study.service.StoreService.StoreCommandService;
import umc.spring.study.web.dto.StoreRequestDTO;
import umc.spring.study.web.dto.StoreResponseDTO;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreRestController {

    private final StoreCommandService storeCommandService;

    @PostMapping("/{storeId}/reviews")
    public ApiResponse<StoreResponseDTO.CreateReviewResultDTO> createReview(@RequestBody @Valid StoreRequestDTO.ReveiwDTO request,
                                                                             @PathVariable(name = "storeId") Long storeId,
                                                                             @RequestParam(name = "userId") Long userId){
        Review review = storeCommandService.createReview(userId, storeId, request);
        return ApiResponse.onSuccess(StoreConverter.toCreateReviewResultDTO(review));
    }
}
