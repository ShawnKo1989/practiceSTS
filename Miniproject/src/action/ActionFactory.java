package action;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	private ActionFactory() {}
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		switch(command) {
		case "SsBoardPageMoveAction": action = new SsBoardPageMoveAction();break;
		case "SsBoardListMoveAction": action = new SsBoardListMoveAction();break;
		case "SsBoardPrevMoveAction": action = new SsBoardPrevMoveAction();break;
		case "SsBoardNextMoveAction": action = new SsBoardNextMoveAction();break;
		case "SsBoardModifyAction": action = new SsBoardModifyAction();break;
		case "SsBoardDeleteAction": action = new SsBoardDeleteAction();break;
		case "SsBoardWriteMoveAction": action = new SsBoardWriteMoveAction();break;
		case "SsBoardWriteAction": action = new SsBoardWriteAction();break;
		}
		return action;
	}
}
