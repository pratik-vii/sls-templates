package com.slstemplates.lambdaoffline.application.handlers;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Handler implements RequestHandler<Map<Object, Object>, Map<Object, Object>> {
    @Override
    public Map<Object, Object> handleRequest(Map<Object, Object> input, Context context) {
        Map<Object, Object> response = Map.ofEntries(Map.entry("body", "Hello World!"));
        return response;
    }
}
