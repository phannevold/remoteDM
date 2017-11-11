package no.remotedm.model;

import java.util.Map;

public class Turn {

    Turn prev;
    Map<Player,PlayerAction> actions;
    Map<Player,Turn> next;

    String narrative;

    public Turn(Turn prev ){

        this.prev = prev;

    }

    public void addAction(Player player, PlayerAction  playerAction){
        actions.put(player,playerAction);
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

  //  public List<Action> getAllActions() {
  //      return Repository.actions;
  //  }






}
