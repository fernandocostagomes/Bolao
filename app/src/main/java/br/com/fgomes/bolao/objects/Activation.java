package br.com.fgomes.bolao.objects;

import java.util.*;

/**
 * Created by fernando.gomes on 21/11/2017.
 */

public class Activation {

   /** Id Activation */
   public int idActivation;
   /** Name Activation*/
   public CharSequence nameActivation;
   /** Key Activation*/
   public CharSequence keyActivation;
   /** Date Generation Key*/
   public Date dateActivation;
   /** Date Validate Key*/
   public Date dateValActivation;
   /** Status Activation */
   public int statusActivation;

   public int getIdActivation() {
      return idActivation;
   }

   public void setIdActivation(int idActivation) {
      this.idActivation = idActivation;
   }

   public CharSequence getNameActivation() {
      return nameActivation;
   }

   public void setNameActivation(CharSequence nameActivation) {
      this.nameActivation = nameActivation;
   }

   public CharSequence getKeyActivation() {
      return keyActivation;
   }

   public void setKeyActivation(CharSequence keyActivation) {
      this.keyActivation = keyActivation;
   }

   public Date getDateActivation() {
      return dateActivation;
   }

   public void setDateActivation(Date dateActivation) {
      this.dateActivation = dateActivation;
   }

   public Date getDateValActivation() {
      return dateValActivation;
   }

   public void setDateValActivation(Date dateValActivation) {
      this.dateValActivation = dateValActivation;
   }

   public int getStatusActivation() {
      return statusActivation;
   }

   public void setStatusActivation(int statusActivation) {
      this.statusActivation = statusActivation;
   }

   public Activation(int idActivation, CharSequence nameActivation, CharSequence keyActivation, Date dateActivation, Date dateValActivation, int statusActivation) {
      this.idActivation = idActivation;
      this.nameActivation = nameActivation;
      this.keyActivation = keyActivation;
      this.dateActivation = dateActivation;
      this.dateValActivation = dateValActivation;
      this.statusActivation = statusActivation;
   }
}
