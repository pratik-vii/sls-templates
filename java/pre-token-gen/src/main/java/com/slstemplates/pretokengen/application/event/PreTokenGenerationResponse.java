package com.slstemplates.pretokengen.application.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

        private Map<String, String> claimsToAddOrOverride;
        private List<String> claimsToSuppress;
        private GroupOverrideDetails groupOverrideDetails;

        public ClaimsOverrideDetails() {
        }

        public void addClaim(String key, String value) {
            claimsToAddOrOverride.put(key, value);
        }


        public Map<String, String> getClaimsToAddOrOverride() {
            return claimsToAddOrOverride;
        }


        public void setClaimsToAddOrOverride(Map<String, String> claimsToAddOrOverride) {
            this.claimsToAddOrOverride = claimsToAddOrOverride;
        }

        public List<String> getClaimsToSuppress() {
            return claimsToSuppress;
        }

        public void setClaimsToSuppress(List<String> claimsToSuppress) {
            this.claimsToSuppress = claimsToSuppress;
        }

        public GroupOverrideDetails getGroupOverrideDetails() {
            return groupOverrideDetails;
        }

        public void setGroupOverrideDetails(GroupOverrideDetails groupOverrideDetails) {
            this.groupOverrideDetails = groupOverrideDetails;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("{");
            if (getClaimsToAddOrOverride() != null)
                sb.append("claimsToAddOrOverride: ").append(getClaimsToAddOrOverride().toString()).append(", ");
            if (getClaimsToSuppress() != null)
                sb.append("claimsToSuppress: ").append(getClaimsToSuppress().toString()).append(", ");
            if (getGroupOverrideDetails() != null)
                sb.append("groupOverrideDetails: ").append(getGroupOverrideDetails().toString()).append(" ");
            sb.append("}");
            return sb.toString();
        }
    }

    static class GroupOverrideDetails implements Serializable, Cloneable {

        private List<String> groupsToOverride;
        private List<String> iamRolesToOverride;
        private String preferredRole;

        public GroupOverrideDetails() {
            this.groupsToOverride = new ArrayList<>();
            this.iamRolesToOverride = new ArrayList<>();
        }

        public List<String> getGroupsToOverride() {
            return groupsToOverride;
        }

        public void setGroupsToOverride(List<String> groupsToOverride) {
            this.groupsToOverride = groupsToOverride;
        }

        public List<String> getIamRolesToOverride() {
            return iamRolesToOverride;
        }

        public void setIamRolesToOverride(List<String> iamRolesToOverride) {
            this.iamRolesToOverride = iamRolesToOverride;
        }

        public String getPreferredRole() {
            return preferredRole;
        }

        public void setPreferredRole(String preferredRole) {
            this.preferredRole = preferredRole;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("{");
            if (getGroupsToOverride() != null)
                sb.append("groupsToOverride: ").append(getGroupsToOverride().toString()).append(", ");
            if (getIamRolesToOverride() != null)
                sb.append("iamRolesToOverride: ").append(getIamRolesToOverride().toString()).append(", ");
            if (getPreferredRole() != null)
                sb.append("preferredRole: ").append(getPreferredRole()).append(" ");
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
