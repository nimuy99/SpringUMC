package umc.spring.study.service.StoreService;

import umc.spring.study.domain.Review;
import umc.spring.study.web.dto.StoreRequestDTO;

public interface StoreCommandService {
    // 리뷰 생성
    Review createReview(Long userId, Long storeId, StoreRequestDTO.ReveiwDTO request);
}
