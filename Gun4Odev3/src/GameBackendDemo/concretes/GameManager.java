package GameBackendDemo.concretes;

import GameBackendDemo.abstracts.GameServices;

import java.util.Scanner;

public class GameManager implements GameServices {
    private BaseCampain baseCampain;
    int userChoice;
    Scanner myobj = new Scanner(System.in);

    public GameManager(){};

    public GameManager(BaseCampain baseCampain) {
        this.baseCampain = baseCampain;
    }

    @Override
    public void forSale(Game game, Player player) {
        checkBalance(game, player);

    }

    @Override
    public void forSaleWithCampain(Game game, Player player) {
        this.baseCampain.dicountForPrice(20,game);
        checkBalance(game, player);


    }

    private void checkBalance(Game game, Player player) {
        if(player.getBalance() >= game.getPrice()){
            System.out.println("You can buy this game. If you want to buy press 1");
            userChoice = myobj.nextInt();
            if (userChoice == 1){
                System.out.println("The game has been purchased.");
                player.setBalance(player.getBalance() - game.getPrice());

            }
            else{
                System.out.println("Cancelled");
            }
        }
        else{
            System.out.println("Your balance is not enough.");
        }
    }
}
