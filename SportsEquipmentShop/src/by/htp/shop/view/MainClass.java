package by.htp.shop.view;

import java.util.Scanner;

import by.htp.shop.controller.Controller;
import by.htp.shop.controller.exception.ControllerException;

public class MainClass {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);

		try {
			String result = controller.executeTask("init");
			System.out.println(result);
			
			while (true) {
				String task = scanner.nextLine();
				result = controller.executeTask(task);
				System.out.println(result);
			}
		} catch (ControllerException e) {
			e.printStackTrace();
		}
	}
}