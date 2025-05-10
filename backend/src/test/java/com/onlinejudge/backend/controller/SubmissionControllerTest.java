package com.onlinejudge.backend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onlinejudge.backend.common.Constants;
import com.onlinejudge.backend.common.enums.ProgrammingLanguage;
import com.onlinejudge.backend.model.api.SubmissionRequest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SubmissionControllerTest {

    private static final Long USER_ID = 1L;
    private static final Long PROBLEM_ID = 1L;
    private static final ProgrammingLanguage LANGUAGE = ProgrammingLanguage.CPP;
    private static final String CODE = "#include <bits/stdc++.h>" +
            "using namespace std;" +
            "int main() {" +
            "   cout<<\"Hello, World\"<<endl;" +
            "   return 0;" +
            "}";

    @Autowired
    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testCodeSubmission() throws Exception {
        SubmissionRequest request = new SubmissionRequest(USER_ID, PROBLEM_ID, LANGUAGE, CODE);

        mockMvc.perform(post(Constants.Api.V1 + "submission/submit")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk());
    }
}
