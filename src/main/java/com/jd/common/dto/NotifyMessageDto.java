package com.jd.common.dto;

import com.jd.common.enums.MessageCategoryEnum;
import com.jd.common.enums.MessageStatusEnum;
import com.jd.common.enums.NotifyTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author hy
 * @description:
 * @date 2020/09/10
 */

@Data
public class NotifyMessageDto implements Serializable {
    /**
     * 消息ID
     */
    private Long msgId;
    /**
     * 发布时间
     */
    private Date dateTime;
    /**
     * 通知类别
     * {@link}
     */
    private MessageCategoryEnum msgCategory;
    /**
     * 发送者用户ID
     */
    private String senderId;
    /**
     *
     */
    private String title;
    /**
     * 内容 or 模板
     */
    private String content;
    /**
     * 链接
     */
    private String link;
    /**
     * 渠道
     *
     */
    private List<Integer> channels;
    /**
     * 通知类型（一对一，一对多，一对所有)
     *
     */
    private NotifyTypeEnum notifyType;
    /**
     * 接收用户ID
     */
    private List<String> reciverIds;
    /**
     * 接受用户组
     */
    private List<String> reciverGroupIds;
    /**
     * 状态
     */
    private MessageStatusEnum status;
    /**
     * 业务ID 用于通知幂等校验
     */
    private String busiId;
}

