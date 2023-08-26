/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hangman;

/**
 *
 * @author rajui
 */
class Scoreboard {
    private int score;

    Scoreboard(int Score) {
        this.score=Score;
        System.out.println("Total attempt is "+score);
    }

    void increaseScore() {
        score++;
    }

    int getScore() {
        return score;
    }
}