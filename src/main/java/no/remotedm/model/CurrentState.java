package no.remotedm.model;

import no.remotedm.domain.Action;
import no.remotedm.domain.Repository;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "currentState")
@RequestScoped
public class CurrentState {

    String currentAction;

    public String getNarrative() {
        return "You find yourself sitting at an inn around a table with a ragtag group of adventurers";
    }

    public String getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(String currentAction) {
        this.currentAction = currentAction;
    }

    public List<Action> getAllActions() {
        return Repository.actions;
    }
}
