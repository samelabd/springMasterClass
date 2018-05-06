package com.timbuchalka.springdemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timbuchalka.springdemo.domain.product.ConsumerProduct;
import com.timbuchalka.springdemo.domain.product.IndustrialProduct;

@Component("newmyfair")
public class TradeFair {

	@Autowired
	private IndustrialProduct industrialProduct;
	
	@Autowired
	private ConsumerProduct consumerProduct;

	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}

	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}

	public String specialPromotionalPricing() {
		String priceInfo = "Industrial product is priced at $" + declareIndustrialProductPrice(industrialProduct)
				+ " and Consumer product is priced at $" + declareConsumerProductPrice(consumerProduct);

		return priceInfo;
	}

}
