package br.com.fgomes.bolao.objects;

/**
 * Created by fernando.gomes on 03/01/2018.
 */

public class Points {
   public int idPoints;
   public CharSequence descPoints;
   public int qtPoints;

   public Points(int idPoints, CharSequence descPoints, int qtPoints) {
      this.idPoints = idPoints;
      this.descPoints = descPoints;
      this.qtPoints = qtPoints;
   }

   public int getIdPoints() {
      return idPoints;
   }

   public void setIdPoints(int idPoints) {
      this.idPoints = idPoints;
   }

   public CharSequence getDescPoints() {
      return descPoints;
   }

   public void setDescPoints(CharSequence descPoints) {
      this.descPoints = descPoints;
   }

   public int getQtPoints() {
      return qtPoints;
   }

   public void setQtPoints(int qtPoints) {
      this.qtPoints = qtPoints;
   }
}
