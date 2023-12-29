package com.mabyssi.ec2.service;

import com.mabyssi.ec2.dto.MessageRequest;
import com.mabyssi.ec2.dto.MessageResponse;

public interface IMessageService {
    String getMessage();
    String rollbackParamLikeMessage(String param);
    MessageResponse rollbackMessageResponse(MessageRequest messageRequest);
}
