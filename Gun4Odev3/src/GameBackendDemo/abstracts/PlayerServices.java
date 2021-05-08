package GameBackendDemo.abstracts;

import GameBackendDemo.concretes.Game;
import GameBackendDemo.concretes.Player;

public interface PlayerServices {
    void addPlayer(Player player);
    void update(Player player,String email);


}
