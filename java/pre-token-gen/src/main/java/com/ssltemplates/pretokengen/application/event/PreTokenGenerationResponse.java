package com.ssltemplates.pretokengen.application.event;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PreTokenGenerationResponse implements Serializable, Cloneable {
    private ClaimsOverrideDetails claimsOverrideDetails;

    public PreTokenGenerationResponse() {
        claimsOverrideDetails = new ClaimsOverrideDetails();
    }

    public void addClaimsOverrideDetail(String key, String value) {
        this.claimsOverrideDetails.addClaim(key, value);
    }

    static class ClaimsOverrideDetails implements Serializable, Cloneable {

        private Map<String, String> claimsToAddOrOverride = new HashMap<>();


        public void addClaim(String key, String value) {
            claimsToAddOrOverride.put(key, value);
        }


        public Map<String, String> getClaimsToAddOrOverride() {
            return claimsToAddOrOverride;
        }


        public void setClaimsToAddOrOverride(Map<String, String> claimsToAddOrOverride) {
            this.claimsToAddOrOverride = claimsToAddOrOverride;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("{");
            if (getClaimsToAddOrOverride() != null)
                sb.append("claimsToAddOrOverride: ").append(getClaimsToAddOrOverride().toString()).append(" ");
            sb.append("}");
            return sb.toString();
        }
    }

    public ClaimsOverrideDetails getClaimsOverrideDetails() {
        return claimsOverrideDetails;
    }

    public void setClaimsOverrideDetails(ClaimsOverrideDetails claimsOverrideDetails) {
        this.claimsOverrideDetails = claimsOverrideDetails;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClaimsOverrideDetails() != null)
            sb.append("claimsOverrideDetails: ").append(getClaimsOverrideDetails().toString()).append(" ");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public PreTokenGenerationResponse clone() {
        try {
            return (PreTokenGenerationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone()", e);
        }
    }

}
