package com.gig.lookBook.web.member;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class SecureControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void signUpForm() throws Exception {
        mockMvc.perform(get("/secure/sign-up"))
                        .andExpect(status().isOk())
                        .andExpect(view().name("member/editor"));
    }
}
