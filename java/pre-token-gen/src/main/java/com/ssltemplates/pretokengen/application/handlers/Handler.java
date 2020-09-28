package com.ssltemplates.pretokengen.application.handlers;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ssltemplates.pretokengen.application.event.PreTokenGenerationResponse;
import com.ssltemplates.pretokengen.application.event.UserPoolEvent;
import com.ssltemplates.pretokengen.application.service.PreTokenService;

public class Handler implements RequestHandler<UserPoolEvent, UserPoolEvent> {
    @Override
    public UserPoolEvent handleRequest(UserPoolEvent input, Context context) {
        String email = input.getRequest().getUserAttributes().get("email");
        PreTokenGenerationResponse userPoolResponse = new PreTokenService().getPreTokenGenResponse(email);
        input.setResponse(userPoolResponse);
        return input;
    }
}
