package umc.spring.study.api.exception.handler;

import umc.spring.study.api.code.BaseErrorCode;
import umc.spring.study.api.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
