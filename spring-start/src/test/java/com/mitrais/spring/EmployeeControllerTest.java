package com.mitrais.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class EmployeeControllerTest {
	
	private MockMvc mockMvc;
	
	@Before
    public void setup() {
        this.mockMvc = MockMvcBuilders
            .standaloneSetup(new EmployeesController())
            .build();
    }
	
	@Test
	public void getMethod() throws Exception {
		String result = "[{\"name\":\"Hendra\",\"gender\":\"male\"},{\"name\":\"Bery\",\"gender\":\"male\"}]";
	    this.mockMvc.perform(get("/employees?gender=male"))
	        .andExpect(status().isOk())
	    	.andExpect(content().json(result));
	}
	
	@Test
	public void postMethod() throws Exception {
	    this.mockMvc.perform(post("/employees")
	    	.content("{\"name\":\"Hendra\",\"gender\":\"male\"}")
	    	.contentType("application/json"))
	        .andExpect(status().isOk());
	}
}
