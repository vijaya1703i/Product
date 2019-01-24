package com.product.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.InputForm;
import com.product.model.Result;
import com.product.service.ProductService;

@RestController("/")
public class ProductRestController {
	// @Autowired
	ProductService service = new ProductService();

	/**
	 * Add new product with sellInDate and quality value
	 * 
	 * @param input
	 * @param model
	 * @return String
	 */
	@PostMapping("/inventory/product")
	public ResponseEntity<String> addProductToInventory(@RequestBody InputForm input, Model model) {
		service.addProductToInventory(input);
		return new ResponseEntity<String>("{\"result\":\"New product got added to inventory\"}", HttpStatus.OK);
	}

	/**
	 * Return the list of products with sellInDate and quality value for the given date
	 * @param reportDate
	 * @return List<ResultItem>
	 * @throws ParseException
	 */
	@GetMapping("/inventory/products/{date}")
	public ResponseEntity<List<Result>> getProducts(@PathVariable("date") String date)
			throws ParseException {
		List<Result> items = service.getProductsList(date);
		return new ResponseEntity<List<Result>>(items, HttpStatus.OK);
	}

}