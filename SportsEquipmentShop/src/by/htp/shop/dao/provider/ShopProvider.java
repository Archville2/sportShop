package by.htp.shop.dao.provider;

import by.htp.shop.bean.Shop;

public final class ShopProvider {
	public static final ShopProvider instance = new ShopProvider();
	public static Shop shop = new Shop();

	public static ShopProvider getInstance() {
		return instance;
	}

	public Shop getShop() {
		return shop;
	}

}
