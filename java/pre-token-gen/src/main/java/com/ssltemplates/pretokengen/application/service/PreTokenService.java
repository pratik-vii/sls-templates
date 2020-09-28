package com.ssltemplates.pretokengen.application.service;

import com.ssltemplates.pretokengen.application.event.PreTokenGenerationResponse;

public class PreTokenService {
    public PreTokenGenerationResponse getPreTokenGenResponse(String email) {
        /*
            Get more details for user form other service or so...
        */
        String details = "User Details";
        PreTokenGenerationResponse userPoolResponse = new PreTokenGenerationResponse();
        userPoolResponse.addClaimsOverrideDetail("details", details);
        return userPoolResponse;
    }
}
