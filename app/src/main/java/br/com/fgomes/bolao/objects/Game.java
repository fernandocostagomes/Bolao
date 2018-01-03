package br.com.fgomes.bolao.objects;

import java.sql.*;

/**
 * Created by fernando.gomes on 03/01/2018.
 */

public class Game {
   public int idGame;
   public int numberGame;
   public int teamPriGame;
   public int teamVisGame;
   public Date dateGame;
   public int localGame;
   public int scoreTeamPriGame;
   public int scoreTeamVisGame;
   public int statusGame;

   public Game(int idGame, int numberGame, int teamPriGame, int teamVisGame, Date dateGame, int localGame, int scoreTeamPriGame, int scoreTeamVisGame, int statusGame) {
      this.idGame = idGame;
      this.numberGame = numberGame;
      this.teamPriGame = teamPriGame;
      this.teamVisGame = teamVisGame;
      this.dateGame = dateGame;
      this.localGame = localGame;
      this.scoreTeamPriGame = scoreTeamPriGame;
      this.scoreTeamVisGame = scoreTeamVisGame;
      this.statusGame = statusGame;
   }

   public int getIdGame() {
      return idGame;
   }

   public void setIdGame(int idGame) {
      this.idGame = idGame;
   }

   public int getNumberGame() {
      return numberGame;
   }

   public void setNumberGame(int numberGame) {
      this.numberGame = numberGame;
   }

   public int getTeamPriGame() {
      return teamPriGame;
   }

   public void setTeamPriGame(int teamPriGame) {
      this.teamPriGame = teamPriGame;
   }

   public int getTeamVisGame() {
      return teamVisGame;
   }

   public void setTeamVisGame(int teamVisGame) {
      this.teamVisGame = teamVisGame;
   }

   public Date getDateGame() {
      return dateGame;
   }

   public void setDateGame(Date dateGame) {
      this.dateGame = dateGame;
   }

   public int getLocalGame() {
      return localGame;
   }

   public void setLocalGame(int localGame) {
      this.localGame = localGame;
   }

   public int getScoreTeamPriGame() {
      return scoreTeamPriGame;
   }

   public void setScoreTeamPriGame(int scoreTeamPriGame) {
      this.scoreTeamPriGame = scoreTeamPriGame;
   }

   public int getScoreTeamVisGame() {
      return scoreTeamVisGame;
   }

   public void setScoreTeamVisGame(int scoreTeamVisGame) {
      this.scoreTeamVisGame = scoreTeamVisGame;
   }

   public int getStatusGame() {
      return statusGame;
   }

   public void setStatusGame(int statusGame) {
      this.statusGame = statusGame;
   }
}
