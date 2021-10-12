package com.example.hobbitron.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// Use spring context for tests
@SpringBootTest
// Give some info to Spring on how to create MockMvc
@AutoConfigureMockMvc
class HobbitControllerTest {
    // Ask Spring to inject an instance of MockMvc
    @Autowired
    private MockMvc mockMvc;

    //Regular JUnit
    @Test
    //JUnit5 feature
    @DisplayName("GET /hobbits -> HTTP 200")
    void getAllGet200() throws Exception {
        // given spring context is ready
        mockMvc
                // when calling /hobbit endpoint
                .perform(MockMvcRequestBuilders.get("/hobbits"))
                // then we should get HTTP 200
                .andExpect(MockMvcResultMatchers.status().is(200));
    }

    @Test
    void getNonExistingEndpoint404() throws Exception {
        // given spring context is ready
        mockMvc
                // when calling an endpoint that does not exist
                .perform(MockMvcRequestBuilders.get("/nonexistinendpoint"))
                // then we should get HTTP 404
                .andExpect(MockMvcResultMatchers.status().is(404));
    }
}