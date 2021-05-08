package GameBackendDemo.concretes;

public class BaseCampain {
    void dicountForPrice(int discountPercantage,Game game){
        game.setPrice(game.getPrice() - (game.getPrice() *( discountPercantage / 100)));

    }
}
