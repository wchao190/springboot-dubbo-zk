package com.atguigu.providerticket.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.service.TicketService;
import org.springframework.stereotype.Component;

@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《厉害了 我的国》";
    }
}
