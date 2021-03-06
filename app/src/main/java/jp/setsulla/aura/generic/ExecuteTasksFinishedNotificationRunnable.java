package jp.setsulla.aura.generic;

import jp.setsulla.aura.Action;
import jp.setsulla.aura.MessageManager;

/**
 * Created by setsulla on 2016/02/28.
 */
public class ExecuteTasksFinishedNotificationRunnable implements Runnable {
    public static final String MSG_EXECUTE_TASKS_DONE =
            "jp.setsulla.aura.MSG_EXECUTE_TASKS_DONE";
    private int startId;
    private int actionId;

    public ExecuteTasksFinishedNotificationRunnable(int startId) {
        this.startId = startId;
        Action action = Action.getActionFromValue(MSG_EXECUTE_TASKS_DONE);
        actionId = Action.getActionId(action);
    }

    @Override
    public void run() {
        MessageManager.getInstance().sendMessage(actionId, startId);
    }
}
