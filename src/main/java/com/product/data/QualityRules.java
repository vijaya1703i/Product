package com.product.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.product.model.InputForm;

public class QualityRules {
	private static List<InputForm> products = new ArrayList<InputForm>();

	private static Map<String, ProductQuality> productQualityMap = new HashMap();

	public static List<InputForm> getProducts() {
		return products;
	}

	public static Map<String, ProductQuality> getProductQualityMap() {
		return productQualityMap;
	}

	static {
		productQualityMap.put("Aged Brie", new ProductQuality("Aged Brie", -1, -1, -1, false, false));
		productQualityMap.put("Sulfuras", new ProductQuality("Sulfuras", 0, 0, 0, false, true));
		productQualityMap.put("Concert backstage passes",
				new ProductQuality("Concert backstage passes", -1, -2, 0, true, false));
		productQualityMap.put("Default", new ProductQuality("Default", 1, 1, 2, false, false));
	}
}
