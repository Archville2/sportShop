package by.htp.shop.dao.provider;

import by.htp.shop.bean.Shop;
import by.htp.shop.dao.ShopDAO;

public final class ShopProvider {
	public static final ShopProvider instance = new ShopProvider();
	public static ShopDAO shopDAO = new Shop();

	public static ShopProvider getInstance() {
		return instance;
	}

	public ShopDAO getShopDAO() {
		return shopDAO;
	}

}
