package org.japzio.slowcontroller.v1.slow.controller;

import org.japzio.slowcontroller.v1.slow.domain.SlowResponse;
import org.japzio.slowcontroller.v1.slow.service.SlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlowController {

    private SlowService slowService;

    public SlowController(@Autowired SlowService slowService) {
        this.slowService = slowService;
    }

    @GetMapping(value = "v1/slow", produces = MediaType.APPLICATION_JSON_VALUE)
    public SlowResponse getSlowResponse() {
        return slowService.getMessage();
    }

}
