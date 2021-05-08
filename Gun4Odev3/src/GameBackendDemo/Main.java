package GameBackendDemo;

import GameBackendDemo.concretes.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1,"Furkan ","Demirci","email.com","1213",456);
        Player player1 = new Player(1,"Sefa ","Demirci","email.com","1213",456);
        Player player2 = new Player(1,"FS","Demirci","email.com","1213",456);


        Game game1 = new Game("Game",100,"FSD","key");
        GameManager gameManager = new GameManager();
        GameManager gameManagerForCampain = new GameManager(new SummerCampain());
        PlayerManger playerManger = new PlayerManger();

        playerManger.isItRegistered(player,"email@email.com");
        playerManger.update(player,"email@email.com");
        playerManger.isItRegistered(player,"email@email.com");

        gameManager.forSale(game1,player);
        gameManagerForCampain.forSaleWithCampain(game1,player);

        playerManger.addPlayer(player);
        playerManger.addPlayer(player1);
        playerManger.addPlayer(player2);

        playerManger.showPlayer();
        playerManger.deletePlayer(player2);
        playerManger.showPlayer();






    }
}
