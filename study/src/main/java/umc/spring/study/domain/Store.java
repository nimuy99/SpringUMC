package umc.spring.study.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import umc.spring.study.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@DynamicUpdate
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store extends BaseEntity {

    // 가게 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 가게 이름
    @Column(nullable = false, length = 50)
    private String name;

    // 가게 주소
    @Column(nullable = false, length = 50)
    private String address;

    // 가게 평점
    @Column(nullable = false)
    private Float score = 0.0f;

    // 단방향 연관관계
    // 지역 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    // 양방향 연관관계
    // 가게의 리뷰 그룹
    @Builder.Default
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Review> storeReviewList = new ArrayList<>();

    // 지역내 가게 관리
    public void setRegion(Region region) {
        if (this.region != null) {       // 기존 연결 제거
            this.region.getStoreList().remove(this);
        }
        this.region = region;            // 새로운 연결 설정
        region.getStoreList().add(this); // 새로운 연결 추가
    }
}