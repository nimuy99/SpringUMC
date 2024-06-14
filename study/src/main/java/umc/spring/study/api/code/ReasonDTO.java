package umc.spring.study.api.code;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ReasonDTO {
    private HttpStatus httpStatus;

    private final boolean isSuccess;
    private final String code;
    private final String message;

    public boolean getIsSuccess(){return isSuccess;}
}
