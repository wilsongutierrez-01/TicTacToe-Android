package com.example.tictactoe

import kotlin.random.Random

data class GameModel (
    var gameId : String = "-1",
    var filledPos : MutableList<String> = mutableListOf("","","","","","","","",""),
    var winner : String = "",
    var gameStatus : GameStatus = GameStatus.CREATED,
    var currentPlayer : String = (arrayOf("X","0"))[Random.nextInt(2)]
)

enum class GameStatus {
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}