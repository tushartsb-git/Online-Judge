package com.onlinejudge.backend.service;

import com.onlinejudge.backend.model.api.SubmissionRequest;
import com.onlinejudge.backend.model.api.SubmissionResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Service class for all submission related workflows
 */
@Component
public class SubmissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionService.class);

    public SubmissionResponse submitCode(SubmissionRequest submissionRequest) {
        LOGGER.info("Submitting code for userId: {}, problemId: {} in language: {}",
                submissionRequest.getUserId(), submissionRequest.getProblemId(), submissionRequest.getLanguage());
        return new SubmissionResponse(true);
    }
}
