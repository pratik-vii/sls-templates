package com.ssltemplates.pretokengen.application.event;


import com.amazonaws.services.lambda.runtime.events.CognitoEvent;

import java.io.Serializable;
import java.util.Map;

public class UserPoolEvent extends CognitoEvent implements Serializable, Cloneable  {

    private String userPoolId;

    private String userName;

    private Map<String, String> callerContext;

    private String triggerSource;

    private Request request;

    private PreTokenGenerationResponse response;

    public String getUserPoolId() {
        return userPoolId;
    }

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, String> getCallerContext() {
        return callerContext;
    }

    public void setCallerContext(Map<String, String> callerContext) {
        this.callerContext = callerContext;
    }

    public String getTriggerSource() {
        return triggerSource;
    }

    public void setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public PreTokenGenerationResponse getResponse() {
        return response;
    }

    public void setResponse(PreTokenGenerationResponse response) {
        this.response = response;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegion() != null)
            sb.append("region: ").append(getRegion()).append(", ");
        if (getDatasetRecords() != null)
            sb.append("datasetRecords: ").append(getDatasetRecords().toString()).append(", ");
        if (getIdentityPoolId() != null)
            sb.append("identityPoolId: ").append(getIdentityPoolId()).append(", ");
        if (getIdentityId() != null)
            sb.append("identityId: ").append(getIdentityId()).append(", ");
        if (getDatasetName() != null)
            sb.append("datasetName: ").append(getDatasetName()).append(", ");
        if (getEventType() != null)
            sb.append("eventType: ").append(getEventType()).append(", ");
        if (getVersion() != null)
            sb.append("version: ").append(getVersion().toString()).append(", ");
        if (getUserPoolId() != null)
            sb.append("userPoolId: ").append(getVersion()).append(", ");
        if (getUserName() != null)
            sb.append("userName: ").append(getUserName()).append(", ");
        if (getCallerContext() != null)
            sb.append("callerContext: ").append(getCallerContext().toString()).append(", ");
        if (getTriggerSource() != null)
            sb.append("triggerSource: ").append(getTriggerSource()).append(", ");
        if (getRequest() != null)
            sb.append("request: ").append(getRequest().toString()).append(" ");
        sb.append("}");
        return sb.toString();
    }

    public static class Request implements Serializable, Cloneable {

        private Map<String, String> userAttributes;

        public Map<String, String> getUserAttributes() {
            return userAttributes;
        }

        public void setUserAttributes(Map<String, String> userAttributes) {
            this.userAttributes = userAttributes;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("{");
            if (getUserAttributes() != null)
                sb.append("userAttributes: ").append(getUserAttributes());
            sb.append("}");
            return sb.toString();
        }

        @Override
        public Request clone() {
            try {
                return (Request) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone()", e);
            }
        }
    }
}
