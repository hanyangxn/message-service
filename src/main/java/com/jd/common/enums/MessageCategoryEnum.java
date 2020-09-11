package com.jd.common.enums;

public enum MessageCategoryEnum {

    SYS_NOTICE(1, "系统通知"),
    INTERVIEW__NOTICE(2, "大咖访谈"),
    WARNING_NOTICE(3, "预警提醒"),
    DATA_NOTICE(4, "数据提醒"),
    RESEARCHREPORTCENTER(5, "研报中心"),
    FIQS_CREDIT_DAILY(6,"信用日报"),
    FIQS_EARLY_WARNING(7,"预警消息"),
    FUND_RISK_ALERT(8,"风控提醒"),
    FUND_RISK_EARLY_WARNING(9,"风控预警"),
    ADVISORY_NOTICE(10,"资讯通知"),
    VALUATION_TABLE_TIPS(11,"估值表提示"),
    IIC_EVENT_POSITIVE(12,"正面事件"),
    IIC_EVENT_NEGATIVE(13,"负面事件");

    private Integer code;
    private String msg;

    MessageCategoryEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MessageCategoryEnum of(Integer code) {
       for (MessageCategoryEnum messageCategoryEnum:values()) {
           if (messageCategoryEnum.code.equals(code)) {
               return messageCategoryEnum;
           }
       }
       return null;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
