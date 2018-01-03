package br.com.fgomes.bolao.objects;

import java.util.stream.*;

/**
 * Created by fernando.gomes on 03/01/2018.
 */

public class Team {
   public int idTeam;
   public CharSequence nameTeam;

   public Team(int idTeam, CharSequence nameTeam) {
      this.idTeam = idTeam;
      this.nameTeam = nameTeam;
   }

   public int getIdTeam() {
      return idTeam;
   }

   public void setIdTeam(int idTeam) {
      this.idTeam = idTeam;
   }

   public CharSequence getNameTeam() {
      return nameTeam;
   }

   public void setNameTeam(CharSequence nameTeam) {
      this.nameTeam = nameTeam;
   }

   @Override
   public String toString() {
      return "Team{" +
              "idTeam=" + idTeam +
              ", nameTeam=" + nameTeam +
              '}';
   }
}
