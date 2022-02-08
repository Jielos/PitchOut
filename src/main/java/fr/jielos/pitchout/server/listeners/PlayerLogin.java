package fr.jielos.pitchout.server.listeners;

import fr.jielos.pitchout.Main;
import fr.jielos.pitchout.game.Game;
import fr.jielos.pitchout.game.references.Message;
import fr.jielos.pitchout.game.references.Status;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerLogin implements Listener {

    @EventHandler
    public void onPlayerLogin(final PlayerLoginEvent event) {
        final Game game = Main.getGame();

        if(game.getStatus() == Status.END) {
            event.disallow(PlayerLoginEvent.Result.KICK_OTHER, Message.KICK_GAME_END.getAsString());
        }
    }

}
