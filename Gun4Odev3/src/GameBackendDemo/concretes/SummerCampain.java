package GameBackendDemo.concretes;

public class SummerCampain extends BaseCampain{
    @Override
    void dicountForPrice(int discountPercantage, Game game) {
        super.dicountForPrice(discountPercantage, game);
        System.out.println("Summer Campain");
    }
}
