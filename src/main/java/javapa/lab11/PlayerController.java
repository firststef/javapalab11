package javapa.lab11;

import entity.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @GetMapping
    public List<Player> getPlayers(){
        return PlayerRepository.getAll();
    }
    @PostMapping("/create")
    public String createPlayer(@RequestParam String name){
        Player player = new Player();
        player.setName(name);
        PlayerRepository.create(player);
        return player.getId();
    }
}
