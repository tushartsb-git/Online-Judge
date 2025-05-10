package com.onlinejudge.backend.model.api;

/**
 * Model class for submission response
 */
public class SubmissionResponse {

    private final boolean success;

    public SubmissionResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
