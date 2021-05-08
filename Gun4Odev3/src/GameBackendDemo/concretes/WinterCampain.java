package GameBackendDemo.concretes;

public class WinterCampain extends BaseCampain{
    @Override
    void dicountForPrice(int discountPercantage, Game game) {
        super.dicountForPrice(discountPercantage, game);
        System.out.println("Winter Campain");
    }
}
