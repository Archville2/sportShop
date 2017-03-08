package by.htp.shop.controller.command;

public enum CommandName {
	REG_USER {
		public final String USAGE = "[name] [surname] [phone]";

		@Override
		public String getUsage() {
			return USAGE;
		}
	},

	PRINT_CLIENTS {
		public final String USAGE = "[]";

		@Override
		public String getUsage() {
			return USAGE;
		}
	},

	INIT {
		public final String USAGE = "[]";

		@Override
		public String getUsage() {
			return USAGE;
		}
	};

	public boolean checkCommand(String command) {
		System.out.println(command);
		switch (command) {
		case "REG_USER":
			return true;
		default:
			return false;
		}
	}

	public abstract String getUsage();
}
