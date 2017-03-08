package by.htp.shop.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.htp.shop.controller.command.Command;
import by.htp.shop.controller.exception.ControllerException;

public final class Controller {
	private final CommandProvider provider = new CommandProvider();

	public String executeTask(String message) throws ControllerException {
		Pattern pattern = Pattern.compile("(\\w+)\\s?(.*)");
		Matcher matcher = pattern.matcher(message);
		matcher.find();

		String commandName = matcher.group(1);
		String request = matcher.group(2);

		System.out.println("command " + commandName + ", request " + request);

		Command executionCommand = provider.getCommand(commandName);

		return executionCommand.execute(request);
	}
}
