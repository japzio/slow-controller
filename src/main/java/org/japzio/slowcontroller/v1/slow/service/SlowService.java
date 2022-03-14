package org.japzio.slowcontroller.v1.slow.service;

import org.japzio.slowcontroller.v1.slow.domain.Response;

public interface SlowService {

    public Response getMessageSlow();
    public Response getMessage();

}
