package br.com.fgomes.bolao.objects;

import java.sql.*;

/**
 * Classe que representa o objeto Shot, que sao os palpites de cada usuario.
 * Created by fernando.gomes on 03/01/2018.
 */

public class Shot {
   public int idShot;
   public int userShot;
   public int teamPriShot;
   public int teamVisShot;
   public int scoreTeamPriShot;
   public int scoreTeamVisShot;
   public int rountShot;
   public int pointsShot;
   public Date dateSentShot;
   public int canalSentShot;

   public int getIdShot() {
      return idShot;
   }

   public void setIdShot(int idShot) {
      this.idShot = idShot;
   }

   public int getUserShot() {
      return userShot;
   }

   public void setUserShot(int userShot) {
      this.userShot = userShot;
   }

   public int getTeamPriShot() {
      return teamPriShot;
   }

   public void setTeamPriShot(int teamPriShot) {
      this.teamPriShot = teamPriShot;
   }

   public int getTeamVisShot() {
      return teamVisShot;
   }

   public void setTeamVisShot(int teamVisShot) {
      this.teamVisShot = teamVisShot;
   }

   public int getScoreTeamPriShot() {
      return scoreTeamPriShot;
   }

   public void setScoreTeamPriShot(int scoreTeamPriShot) {
      this.scoreTeamPriShot = scoreTeamPriShot;
   }

   public int getScoreTeamVisShot() {
      return scoreTeamVisShot;
   }

   public void setScoreTeamVisShot(int scoreTeamVisShot) {
      this.scoreTeamVisShot = scoreTeamVisShot;
   }

   public int getRountShot() {
      return rountShot;
   }

   public void setRountShot(int rountShot) {
      this.rountShot = rountShot;
   }

   public int getPointsShot() {
      return pointsShot;
   }

   public void setPointsShot(int pointsShot) {
      this.pointsShot = pointsShot;
   }

   public Date getDateSentShot() {
      return dateSentShot;
   }

   public void setDateSentShot(Date dateSentShot) {
      this.dateSentShot = dateSentShot;
   }

   public int getCanalSentShot() {
      return canalSentShot;
   }

   public void setCanalSentShot(int canalSentShot) {
      this.canalSentShot = canalSentShot;
   }

   public Shot(int idShot, int userShot, int teamPriShot, int teamVisShot, int scoreTeamPriShot, int scoreTeamVisShot, int rountShot, int pointsShot, Date dateSentShot, int canalSentShot) {
      this.idShot = idShot;
      this.userShot = userShot;
      this.teamPriShot = teamPriShot;
      this.teamVisShot = teamVisShot;
      this.scoreTeamPriShot = scoreTeamPriShot;
      this.scoreTeamVisShot = scoreTeamVisShot;
      this.rountShot = rountShot;
      this.pointsShot = pointsShot;
      this.dateSentShot = dateSentShot;
      this.canalSentShot = canalSentShot;


   }
}
