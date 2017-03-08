package by.htp.shop.controller.command;

import by.htp.shop.controller.exception.ControllerException;

public interface Command {
	String execute(String text) throws ControllerException;
}
