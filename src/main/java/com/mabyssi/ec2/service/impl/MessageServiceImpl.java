package com.mabyssi.ec2.service.impl;

import com.mabyssi.ec2.dto.MessageRequest;
import com.mabyssi.ec2.dto.MessageResponse;
import com.mabyssi.ec2.service.IMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class MessageServiceImpl implements IMessageService {
    @Override
    public String getMessage() {
        return "Message by default";
    }

    @Override
    public String rollbackParamLikeMessage(String param) {
        return param;
    }

    @Override
    public MessageResponse rollbackMessageResponse(MessageRequest messageRequest) {
        log.info("Message request: [{}]", messageRequest.toString());

        return MessageResponse.builder()
                .message(messageRequest.getMessage())
                .time(LocalDateTime.now())
                .build();
    }
}
