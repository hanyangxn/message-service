package com.jd.common.enums;

public enum NotifyTypeEnum {

    UNKNOW(0),
    ONE_ALL(1),
    ONE_MANY(2),
    ONE_GROUP(3),
    ONE_ONE(4),
    ;


    private Integer code;

    NotifyTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static NotifyTypeEnum of(Integer code) {
        for (NotifyTypeEnum notifyTypeEnum : values()) {
            if (notifyTypeEnum.code.equals(code)) {
                return notifyTypeEnum;
            }
        }
        return UNKNOW;
    }
}
