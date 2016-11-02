package net.flakron.github.label.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payload {

    private Integer number;

    private String action;

    @JsonProperty("pull_request")
    private PullRequest pullRequest;

    private Label label;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
