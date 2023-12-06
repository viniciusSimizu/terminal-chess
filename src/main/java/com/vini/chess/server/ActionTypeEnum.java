package com.vini.chess.server;

public enum ActionTypeEnum {
	MOVE("00");

	public final String type;

	private ActionTypeEnum(String type) {
		this.type = type;
	}

	public static ActionTypeEnum findAction(String action) {
		for (ActionTypeEnum actionType : ActionTypeEnum.values()) {
			if (action == actionType.type) {
				return actionType;
			}
		}
		return null;
	}
}