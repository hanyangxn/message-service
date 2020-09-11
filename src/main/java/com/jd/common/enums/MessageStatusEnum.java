package com.jd.common.enums;

public enum MessageStatusEnum {

    INIT(0),
    PUBLISHED(1),
    DELETE(2),
    CANCEL(3);


    private Integer code;

    MessageStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static MessageStatusEnum of(Integer code) {
        for (MessageStatusEnum messageStatusEnum: values()) {
            if (messageStatusEnum.code.equals(code)) {
                return messageStatusEnum;
            }
        }
        return INIT;
    }
}
