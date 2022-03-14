package org.japzio.slowcontroller.v1.slow.service;

import lombok.extern.slf4j.Slf4j;
import org.japzio.slowcontroller.v1.slow.domain.Response;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SlowServiceImpl implements SlowService {

    public Response getMessageSlow()  {
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return new Response("this is a slow response api!");
    }

    public Response getMessage()  {
        return new Response("This is a normal response!");
    }

}
