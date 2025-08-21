package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCont {
	
	@RequestMapping(value = "/java" , method = RequestMethod.GET)
	public String first() {
		return "This api calls java";
	}
	@GetMapping("/Swiggy")
	public String Second() {
		return "Made for Order Food";
	}
	
	@PostMapping("/Profile")
	public String Third() {
		return "This Page is for Profile";
	}
	
	@GetMapping("/Registration")
	public String Regis() {
		return "This is made for Registration";
	}
	
	@PostMapping("/login")
	public String login() {
		return "This is made for Login";
	}
	
	@PostMapping("/logout")
	public String logout() {
		return "This is made for Logout";
	}
	
	@PutMapping("/update")
	public String update() {
		return "This is made for ProfileUpdate";
	}
	
	@PostMapping("/order")
	public String order() {
		return "This is made for order food";
	}
	
	@GetMapping("/orderDetails")
	public String orderDe() {
		return "This is made for orderDetails";
	}
	
	@GetMapping("/orderHistory")
	public String orderHis() {
		return "This is made for orderHistory of Foods";
	}
	
	@DeleteMapping("/DeleteOrder")
	public String DeleteOrder() {
		return "This is made for Delete the order";
	}
	
	@PostMapping("/payment")
	public String orderPay() {
		return "This is made for Payment of order";
	}
	
	@GetMapping("/paymentDetails")
	public String orderPayD() {
		return "This is made for Details Payment of order";
	}
	
	@PostMapping("/cart")
	public String orderCart() {
		return "This is made for Cart Section";
	}
	
	@GetMapping("/cartDetails")
	public String ordercartD() {
		return "This is made for Cart of order";
	}
	
	@DeleteMapping("/deleteItems")
	public String DeleteC() {
		return "This is made for delete cart items";
	}
	
	@PostMapping("/support")
	public String support() {
		return "This is made for Support Section";
	}
}
