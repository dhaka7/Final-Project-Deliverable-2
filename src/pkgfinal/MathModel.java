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
public class MathModel extends GameModel {
    ArrayList<Integer> questionList = new ArrayList<>();
    ArrayList<String> answerList = new ArrayList<>();
    ArrayList<String> correctAnswerList = new ArrayList<>();

    public MathModel(GameModel g_model) {
        super(g_model);
    }
}
