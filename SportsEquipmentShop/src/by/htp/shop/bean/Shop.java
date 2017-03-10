package by.htp.shop.bean;

import java.util.ArrayList;
import java.util.List;

import by.htp.shop.dao.ShopDAO;

public class Shop implements ShopDAO {

	private List<SportEquipment> itemsList = new ArrayList<>();

	public void addItem(SportEquipment item) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemsList == null) ? 0 : itemsList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (itemsList == null) {
			if (other.itemsList != null)
				return false;
		} else if (!itemsList.equals(other.itemsList))
			return false;
		return true;
	}

}
