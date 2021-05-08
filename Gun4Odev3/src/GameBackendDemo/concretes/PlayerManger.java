package GameBackendDemo.concretes;

import GameBackendDemo.abstracts.CheckInfo;
import GameBackendDemo.abstracts.PlayerServices;

import java.util.ArrayList;

public class PlayerManger implements PlayerServices, CheckInfo {
    ArrayList<Player> players = new ArrayList<>();


    @Override
    public void addPlayer(Player player) {
        players.add(player);

    }
    public void deletePlayer(Player player){
        players.remove(player);
        System.out.println(player.getFirstname() + " is deleted");
    }

    public void showPlayer(){
        for (Player player:players ) {
            System.out.println(player.getFirstname());
        }

    }

    @Override
    public void update(Player player, String email) {
        System.out.println("email updated to: " +email);
        player.setEmail(email);

    }

    @Override
    public void delete(Player player) {
        player = null;

    }

    @Override
    public void isItRegistered(Player gamer, String email) {
        if (gamer.getEmail() == email) {
            System.out.println("This email is already registered. email:" + email);
        } else {
            System.out.println("This email is not registered. email:" + email);
        }
    }
}
