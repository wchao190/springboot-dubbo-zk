package com.atguigu.consumeruser.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class User {
    @Reference
    TicketService ticketService;
    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("已购票："+ticket);
    }
}
