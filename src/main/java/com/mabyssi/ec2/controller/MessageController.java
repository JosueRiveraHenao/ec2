package com.mabyssi.ec2.controller;

import com.mabyssi.ec2.dto.MessageRequest;
import com.mabyssi.ec2.dto.MessageResponse;
import com.mabyssi.ec2.service.IMessageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/message")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MessageController {
    IMessageService messageService;

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok().body(this.messageService.getMessage());
    }

    @GetMapping(value = "/param")
    public ResponseEntity<String> rollbackParamLikeMessage(@RequestParam String message) {
        return ResponseEntity.ok().body(this.messageService.rollbackParamLikeMessage(message));
    }

    @PostMapping
    public ResponseEntity<MessageResponse> rollbackMessageResponse(@RequestBody MessageRequest messageRequest) {
        return ResponseEntity.ok().body(this.messageService.rollbackMessageResponse(messageRequest));
    }
}
