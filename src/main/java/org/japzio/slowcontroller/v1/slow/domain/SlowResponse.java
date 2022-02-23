package org.japzio.slowcontroller.v1.slow.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@RequiredArgsConstructor
public class SlowResponse implements Serializable {

    private final String id = UUID.randomUUID().toString();

    @Getter @Setter @NonNull
    private String message;

    public String getId(){
        return this.id;
    }

}
