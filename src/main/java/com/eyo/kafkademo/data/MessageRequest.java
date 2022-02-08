package com.eyo.kafkademo.data;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class MessageRequest implements Serializable {
    private String message;
}
