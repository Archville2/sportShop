package by.htp.shop.dao;

import java.util.List;

import by.htp.shop.bean.SportEquipment;

public interface ShopDAO {

	void addItem(SportEquipment item);

	SportEquipment getItem(int index);

	List<SportEquipment> getList();

	int getShopSize();
	
}
