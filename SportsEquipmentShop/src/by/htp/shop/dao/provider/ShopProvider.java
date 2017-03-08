package by.htp.shop.dao.provider;

import by.htp.shop.bean.Shop;
import by.htp.shop.dao.ShopDAO;

public final class ShopProvider {
	private static final ShopProvider instance = new ShopProvider();
	private static ShopDAO shopDAO = new Shop();

	public static ShopProvider getInstance() {
		return instance;
	}

	public ShopDAO getShopDAO() {
		return shopDAO;
	}

}
