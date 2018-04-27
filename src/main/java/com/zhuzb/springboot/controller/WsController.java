package com.zhuzb.springboot.controller;

import com.zhuzb.springboot.entity.WiselyMessage;
import com.zhuzb.springboot.entity.WiselyREsponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/27
 * Time：11:33
 */
@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg){
        if(principal.getName().equals("wyf")){
            messagingTemplate.convertAndSendToUser("wisely",
                    "/queue/notifications",principal.getName()+"-send:"+msg);
        }else{
            messagingTemplate.convertAndSendToUser("wyf",
                    "/queue/notifications",principal.getName()+"-send:"+msg);
        }
    }

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyREsponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyREsponse("Welcome, "+message.getName()+"!");
    }

}
