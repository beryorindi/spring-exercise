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
		String result = "[{\"id\":\"1\",\"name\":\"Hendra\",\"gender\":\"male\"},{\"id\":\"3\",\"name\":\"Bery\",\"gender\":\"male\"}]";
	    this.mockMvc.perform(get("/employees?gender=male"))
	        .andExpect(status().isOk())
	    	.andExpect(content().json(result));
	}
	
	@Test
	public void postMethod() throws Exception {
	    this.mockMvc.perform(post("/employees")
	    	.content("{\"id\":\"1\",\"name\":\"Hendra\",\"gender\":\"male\"}")
	    	.contentType("application/json"))
	        .andExpect(status().isOk());
	}
	
	@Test
	public void getEmployeeById() throws Exception {
	    this.mockMvc.perform(put("/employees/8"))
	        .andExpect(status().isNotFound());
	}
}
