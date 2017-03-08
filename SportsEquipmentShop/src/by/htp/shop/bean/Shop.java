package by.htp.shop.bean;

import java.util.ArrayList;
import java.util.List;

import by.htp.shop.dao.ShopDAO;

public class Shop implements ShopDAO{
	private static int id = 0;

	private List<SportEquipment> itemsList = new ArrayList<>();

	public void addItem(SportEquipment item) {
		id++;
		this.itemsList.add(item);
	}

	public SportEquipment getItem(int index) {
		return itemsList.get(index);
	}

	public List<SportEquipment> getList() {
		return itemsList;
	}

	public int getShopSize() {
		return itemsList.size();
	}
}
