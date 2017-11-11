package no.remotedm.no.remotedm.controller;

import no.remotedm.domain.Repository;
import no.remotedm.model.Player;
import no.remotedm.model.PlayerAction;
import no.remotedm.model.Turn;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name = "controller")
@RequestScoped
public class Controller {

    private String input;
    private Turn currentTurn;
    private List<Player> players = fetchPlayers();
    private Player currentPlayer = players.get(0);


    public void saveAction() {
        currentTurn.addAction(currentPlayer, new PlayerAction(input));
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

    public Turn getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(Turn currentTurn) {
        this.currentTurn = currentTurn;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    private List<Player> fetchPlayers(){

        return Repository.players;

    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
