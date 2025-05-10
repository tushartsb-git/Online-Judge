package com.onlinejudge.backend.controller;

import com.onlinejudge.backend.common.Constants;
import com.onlinejudge.backend.model.api.SubmissionRequest;
import com.onlinejudge.backend.model.api.SubmissionResponse;
import com.onlinejudge.backend.service.SubmissionService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to define all the submission related APIs
 */
@RestController()
@RequestMapping(Constants.Api.V1 + "submission")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionController.class);

    @PostMapping("/submit")
    public SubmissionResponse submitCode(@RequestBody SubmissionRequest submissionRequest) {
        return submissionService.submitCode(submissionRequest);
    }
}
