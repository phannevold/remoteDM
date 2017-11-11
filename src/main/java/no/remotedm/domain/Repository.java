package no.remotedm.domain;

import no.remotedm.model.Turn;
import no.remotedm.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {


    public static Map<Player,Turn> playersLastState = new HashMap<Player, Turn>();

    public static List<Player> players = new ArrayList<Player>();
    static {
        initPlayers();
        initStates();
    }

    public static void initStates(){

        Turn turn = new Turn(null);
        turn.setNarrative("Ye olde dnd campaign starts here");
        for (Player player : players) {

            playersLastState.put(player,turn);
        }
    }

    public static void initPlayers(){

        players.add(new Player("Sam","0","Rogue"));
        players.add(new Player("Branvar","1","Fighter"));
        players.add(new Player("Mantraz","2","Wizard"));
    }


}
