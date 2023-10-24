package com.tictactoe.demo.controller.dto;

import com.tictactoe.demo.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}