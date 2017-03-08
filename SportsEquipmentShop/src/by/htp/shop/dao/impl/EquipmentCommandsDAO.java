package by.htp.shop.dao.impl;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.htp.shop.bean.Shop;
import by.htp.shop.bean.SportEquipment;
import by.htp.shop.dao.EquipmentDAO;
import by.htp.shop.dao.exception.DAOException;
import by.htp.shop.dao.provider.ShopProvider;

public class EquipmentCommandsDAO implements EquipmentDAO {

	public String init(String request) throws DAOException {
		ShopProvider shopProvider = ShopProvider.getInstance();
		Shop shop = shopProvider.getShop();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();

			Document document1 = db.parse("resources/items.xml");

			DOMParser parser = new DOMParser();
			parser.parse("resources/items.xml");
			Document document = parser.getDocument();

			Element root = document.getDocumentElement();

			NodeList itemNodes = root.getElementsByTagName("item");
			NodeList list = root.getChildNodes();

			Element el1 = (Element) list.item(1);
			String str = el1.getTagName();

			SportEquipment sportEquipment = null;
			for (int i = 0; i < itemNodes.getLength(); i++) {
				sportEquipment = new SportEquipment();
				Element itemElement = (Element) itemNodes.item(i);
				sportEquipment.setId(Integer.parseInt(itemElement.getAttribute("id")));
				sportEquipment.setName(getSingleChild(itemElement, "name").getTextContent().trim());
				sportEquipment.setCategory(getSingleChild(itemElement, "category").getTextContent().trim());
				sportEquipment.setType(getSingleChild(itemElement, "type").getTextContent().trim());
				sportEquipment.setPrice(getSingleChild(itemElement, "price").getTextContent().trim());
				shop.addItem(sportEquipment);
			}

			System.out.printf("%-17s %-15s %-16s %s\n\n", "Категория", "Тип", "Название", "Цена $");

			for (int i = 0; i < shop.getShopSize(); i++) {
				System.out.printf("%-15s %-15s %-20s %s\n", shop.getItem(i).getCategory(), shop.getItem(i).getType(),
						shop.getItem(i).getName(), shop.getItem(i).getPrice());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "init ok";
	}

	private static Element getSingleChild(Element element, String childName) {
		NodeList nlist = element.getElementsByTagName(childName);
		Element child = (Element) nlist.item(0);
		return child;
	}

}
