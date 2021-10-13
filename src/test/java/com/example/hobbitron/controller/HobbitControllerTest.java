package com.example.hobbitron.controller;

import com.example.hobbitron.model.Hobbit;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HobbitControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("GET /hobbits -> HTTP 200")
    void getAllGet200() throws Exception {
        mockMvc
                .perform(get("/hobbits"))
                .andExpect(status().is(200));
    }

    @Test
    void getNonExistingEndpoint404() throws Exception {
        mockMvc
                .perform(get("/nonexistinendpoint"))
                .andExpect(status().is(404));
    }

    @Test
    void given3HobbitsInDB_whenGETHobbits_thenHTTP200AndListSize3() throws Exception {
        final var mvcResult = mockMvc
                .perform(get("/hobbits"))
                .andDo(print())
                .andExpect(status().is(200))
                .andReturn();

        // get JSON from the response
        final var hobbitsFromDbInJSONFromat = mvcResult.getResponse().getContentAsString();
        // map JSON -> Java
        List<Hobbit> hobbitsFromDB = objectMapper.readValue(hobbitsFromDbInJSONFromat, new TypeReference<>(){});

        assertEquals(3, hobbitsFromDB.size());

    }

}