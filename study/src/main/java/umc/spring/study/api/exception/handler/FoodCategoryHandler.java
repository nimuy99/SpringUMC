package umc.spring.study.api.exception.handler;

import umc.spring.study.api.code.BaseErrorCode;
import umc.spring.study.api.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
