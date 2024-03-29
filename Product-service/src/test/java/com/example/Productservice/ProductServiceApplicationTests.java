package com.example.Productservice;

import com.example.Productservice.dto.ProductRequestDto;
import com.example.Productservice.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//@ComponentScan(basePackages = "com.example.Productservice")
class ProductServiceApplicationTests {
//
//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private ProductRequestDto productRequestDto;
//	@Autowired
//	private ProductRepository productRepository;

//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicasetUrl);
//	}
//
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequestDto productRequestDto = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequestDto);
//		mockMvc.perform(MockMvcRequestBuilders.post("api/product/addproduct")
//				.content(String.valueOf(MediaType.APPLICATION_JSON))
//				.content(productRequestString))
//				.andExpect(status().isCreated());
//		Assertions.assertEquals(1, productRepository.findAll().size());
//
//	}
//
//	private ProductRequestDto getProductRequest() {
//		return ProductRequestDto.builder()
//				.name("iphone 14")
//				.description("this is a iphone 14")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}


}
