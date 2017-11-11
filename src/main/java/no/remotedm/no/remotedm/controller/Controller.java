package no.remotedm.no.remotedm.controller;

import no.remotedm.domain.Action;
import no.remotedm.domain.Repository;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controller")
@RequestScoped
public class Controller {

    String input;

    public void saveAction() {

        Repository.actions.add(new Action(getActionFromInput()));
        System.out.println("inni saveAction");
    }

    private String getActionFromInput() {
        return input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
