/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.ArrayList;

/**
 *
 * @author Lapper
 */
public class GameModel {

    ArrayList<String> questionList;
    ArrayList<String> answerList;
    ArrayList<String> correctAnswerList;

    GameModel(GameModel g_model) {
        questionList = new ArrayList<>();
        answerList = new ArrayList<>();
        correctAnswerList = new ArrayList<>();

    }

}
