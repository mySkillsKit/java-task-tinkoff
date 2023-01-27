package org.example;

public class Status {
    private Long StatusId;
    private String StateOrgStatusCode;

    public Status(Long statusId, String stateOrgStatusCode) {
        StatusId = statusId;
        StateOrgStatusCode = stateOrgStatusCode;
    }

    public Long getStatusId() {
        return StatusId;
    }

    public void setStatusId(Long statusId) {
        StatusId = statusId;
    }

    public String getStateOrgStatusCode() {
        return StateOrgStatusCode;
    }

    public void setStateOrgStatusCode(String stateOrgStatusCode) {
        StateOrgStatusCode = stateOrgStatusCode;
    }
}
