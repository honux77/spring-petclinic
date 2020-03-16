package org.springframework.samples.petclinic.sandbox;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleResult {

    @Override
    public String toString() {
        return "SimpleResult{" +
            "status='" + status + '\'' +
            ", message='" + message + '\'' +
            '}';
    }

    @JsonProperty
    private String status;

    @JsonProperty
    private String message;

    public SimpleResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

}
