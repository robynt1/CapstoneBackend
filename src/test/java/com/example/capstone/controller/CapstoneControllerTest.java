package com.example.capstone.controller;

import com.example.capstone.model.Capstone;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CapstoneControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Test
//    @DisplayName("GET /capstone -> HTTP 200")
//    void getAllGet200() throws Exception {
//        mockMvc
//                .perform(get("/capstone"))
//                .andExpect(status().is(200));
//    }
//
//    @Test
//    void getNonExistingEndpoint404() throws Exception {
//        mockMvc
//                .perform(get("/nonexistinendpoint"))
//                .andExpect(status().is(404));
//    }
//
//    @Test
//    void given3CapstonesInDB_whenGETCapstones_thenHTTP200AndListSize3() throws Exception {
//        final var mvcResult = mockMvc
//                .perform(get("/capstone"))
//                .andDo(print())
//                .andExpect(status().is(200))
//                .andReturn();
//
//        // get JSON from the response
//        final var capstoneFromDbInJSONFromat = mvcResult.getResponse().getContentAsString();
//        // map JSON -> Java
//        List<Capstone> capstoneFromDB = objectMapper.readValue(capstoneFromDbInJSONFromat, new TypeReference<>(){});
//
//        assertEquals(3, capstoneFromDB.size());
//
//    }
//
//    @Test
//    @DirtiesContext
//    void givenFullSpringContextWithDbInitialized_whenPOSTCapstonesWithJSON_thenHTTP200AndCapstoneWithId() throws Exception {
//
//
//        var prefix = "Mr";
//        var firstName = "Adam";
//        var lastName =  "Stewart";
//        var telephoneNumber =  48321366L;
//        var addressLine1 =  "addressLine1";
//        var addressLine2 =  "addressLine2";
//        var city    = "belfast";
//        var postcode =  "bt3 17tt";
//        var vehicleType =  "Hatchback";
//        var engineSize =  "engineSize";
//        var additionalDrivers =  "1";
//        var commercialPurpose =  true;
//        var outsideRegisteredState =  true;
//        var currentValue =  10000L;
//        var dateRegistered = "10/10/2021";
//
//
//        var capstone = new Capstone(null, prefix,firstName,lastName,telephoneNumber,addressLine1,addressLine2,city,postcode,vehicleType, engineSize,additionalDrivers,commercialPurpose,outsideRegisteredState, currentValue,dateRegistered);
//        var capstoneAsString = objectMapper.writeValueAsString(capstone);
//
//        final var mvcResult = mockMvc
//                .perform(
//                        post("/capstone")
//                        .content(capstoneAsString)
//                        .contentType(MediaType.APPLICATION_JSON)
//                )
//                .andDo(print())
//                .andExpect(status().is(200))
//                .andReturn();
//
//        final var capstoneFromDbAsJson = mvcResult.getResponse().getContentAsString();
//
//        Capstone capstoneFromDB = objectMapper.readValue(capstoneFromDbAsJson, Capstone.class);
//
//        assertAll(
//                () -> assertNotNull(capstoneFromDB.getId()),
//                () -> assertEquals(firstName, capstoneFromDB.getFirstName()),
//                () -> assertEquals(lastName, capstoneFromDB.getLastName()),
//                () -> assertEquals(prefix, capstoneFromDB.getPrefix()),
//                () -> assertEquals(telephoneNumber, capstoneFromDB.getTelephoneNumber()),
//                () -> assertEquals(addressLine1, capstoneFromDB.getAddressLine1()),
//                () -> assertEquals(addressLine2, capstoneFromDB.getAddressLine2()),
//                () -> assertEquals(city, capstoneFromDB.getCity()),
//                () -> assertEquals(postcode, capstoneFromDB.getPostcode()),
//                () -> assertEquals(vehicleType, capstoneFromDB.getVehicleType()),
//                () -> assertEquals(engineSize, capstoneFromDB.getEngineSize()),
//                () -> assertEquals(additionalDrivers, capstoneFromDB.getAdditionalDrivers()),
//                () -> assertEquals(commercialPurpose, capstoneFromDB.getCommercialPurpose()),
//                () -> assertEquals(outsideRegisteredState, capstoneFromDB.getOutsideRegisteredState()),
//                () -> assertEquals(currentValue, capstoneFromDB.getCurrentValue()),
//                () -> assertEquals(dateRegistered, capstoneFromDB.getDateRegistered())
//        );
//    }

}