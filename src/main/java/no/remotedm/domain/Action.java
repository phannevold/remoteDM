package no.remotedm.domain;

public class Action {
    String actionText;

    public Action(String input) {
        this.actionText = input;
    }

    public String getActionText() {
        return actionText;
    }

    public void setActionText(String actionText) {
        this.actionText = actionText;
    }
}
