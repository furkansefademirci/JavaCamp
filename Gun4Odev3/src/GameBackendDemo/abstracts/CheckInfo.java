package GameBackendDemo.abstracts;

import GameBackendDemo.concretes.Player;

public interface CheckInfo {
    void isItRegistered(Player player, String email);
}
