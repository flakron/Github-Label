package net.flakron.github.label.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PullRequest {

    private Integer id;

    private Integer number;

    @JsonProperty("html_url")
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
