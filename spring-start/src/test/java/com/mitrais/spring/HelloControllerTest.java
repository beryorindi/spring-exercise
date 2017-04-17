package com.mitrais.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HelloControllerTest {
	private MockMvc mockMvc;

	@Before
    public void setup() {
        this.mockMvc = MockMvcBuilders
            .standaloneSetup(new HelloController())
            .build();
    }
	
	@Test
	public void getMessage() throws Exception {
	    this.mockMvc.perform(get("/hello"))
	        .andExpect(status().isOk());
	}
}
