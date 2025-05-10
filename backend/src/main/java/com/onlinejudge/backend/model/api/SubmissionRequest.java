package com.onlinejudge.backend.model.api;

import com.onlinejudge.backend.common.enums.ProgrammingLanguage;

public class SubmissionRequest {

    private final Long userId;
    private final Long problemId;

    private final ProgrammingLanguage language;

    private final String code;

    public SubmissionRequest(Long userId, Long problemId, ProgrammingLanguage language, String code) {
        this.userId = userId;
        this.problemId = problemId;
        this.language = language;
        this.code = code;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProblemId() {
        return problemId;
    }

    public ProgrammingLanguage getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }
}
