package org.japzio.slowcontroller.v1.slow.service;

import lombok.extern.slf4j.Slf4j;
import org.japzio.slowcontroller.v1.slow.domain.SlowResponse;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SlowServiceImpl implements SlowService {

    public SlowResponse getMessage()  {
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return new SlowResponse("this is a slow response api trying to reproduce 401");
    }

}
