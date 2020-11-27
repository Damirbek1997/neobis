package com.example.week10.Controller;

import com.example.week10.Entity.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
@WebAppConfiguration
class ProductControllerTest {
    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ObjectMapper mapper;

    private MockMvc mvc;

    String username = "admin";

    @BeforeEach
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .defaultRequest(get("/").with(user(username).roles("ADMIN")))
                .defaultRequest(delete("/").with(user(username).roles("ADMIN")))
                .defaultRequest(post("/").with(user(username).roles("ADMIN")))
                .defaultRequest(put("/").with(user(username).roles("ADMIN")))
                .apply(springSecurity())
                .build();
    }

    @Test
    void findAll() throws Exception {
        MvcResult result = mvc
                .perform(get("/product/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void findById() throws Exception {
        MvcResult result = mvc
                .perform(get("/product/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void changeById() throws Exception {
        Product product = new Product("New product");
        String jsonRequest = mapper.writeValueAsString(product);

        MvcResult result = mvc
                .perform(put("/product/{id}", 1)
                        .content(jsonRequest)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void createProduct() throws Exception {
        Product product = new Product("Created product");
        String jsonRequest = mapper.writeValueAsString(product);

        MvcResult result = mvc
                .perform(post("/product/")
                        .content(jsonRequest)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void deleteById() throws Exception {
        MvcResult result = mvc
                .perform(delete("/product/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }
}