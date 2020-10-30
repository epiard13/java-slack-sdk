package com.slack.api.methods.response.chat;

import com.slack.api.methods.SlackApiTextResponse;
import lombok.Data;

@Data
public class ChatDeleteResponse implements SlackApiTextResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;
    private String deprecatedArgument;

    private String channel;
    private String ts;
}