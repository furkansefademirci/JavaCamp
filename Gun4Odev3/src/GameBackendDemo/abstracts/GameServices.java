package GameBackendDemo.abstracts;

import GameBackendDemo.concretes.BaseCampain;
import GameBackendDemo.concretes.Game;
import GameBackendDemo.concretes.Player;

public interface GameServices {
    void forSale(Game game, Player player);
    void forSaleWithCampain(Game game, Player player);


}
