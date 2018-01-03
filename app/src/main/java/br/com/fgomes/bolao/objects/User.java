package br.com.fgomes.bolao.objects;

/**
 * Created by fernando.gomes on 21/11/2017.
 */

public class User {

   /** Id User */
   public int idUser;
   /** Name User. */
   public CharSequence nameUser;
   /** Email User. */
   public CharSequence emailUser;
   /** Phone User. */
   public CharSequence phoneUser;
   /** Password User. */
   public CharSequence passwordUser;
   /** Password Old User. */
   public CharSequence passwordOldUser;
   /** Name Bank User. */
   public CharSequence accountNumberUser;
   /** Agency User. */
   public CharSequence accountAgencyUser;
   /** Account User. */
   public CharSequence accountNameUser;

   public User(int idUser, CharSequence nameUser, CharSequence emailUser, CharSequence phoneUser, CharSequence passwordUser, CharSequence passwordOldUser, CharSequence accountNumberUser, CharSequence accountAgencyUser, CharSequence accountNameUser) {
      this.idUser = idUser;
      this.nameUser = nameUser;
      this.emailUser = emailUser;
      this.phoneUser = phoneUser;
      this.passwordUser = passwordUser;
      this.passwordOldUser = passwordOldUser;
      this.accountNumberUser = accountNumberUser;
      this.accountAgencyUser = accountAgencyUser;
      this.accountNameUser = accountNameUser;
   }

   public int getIdUser() {
      return idUser;
   }

   public void setIdUser(int idUser) {
      this.idUser = idUser;
   }

   public CharSequence getNameUser() {
      return nameUser;
   }

   public void setNameUser(CharSequence nameUser) {
      this.nameUser = nameUser;
   }

   public CharSequence getEmailUser() {
      return emailUser;
   }

   public void setEmailUser(CharSequence emailUser) {
      this.emailUser = emailUser;
   }

   public CharSequence getPhoneUser() {
      return phoneUser;
   }

   public void setPhoneUser(CharSequence phoneUser) {
      this.phoneUser = phoneUser;
   }

   public CharSequence getPasswordUser() {
      return passwordUser;
   }

   public void setPasswordUser(CharSequence passwordUser) {
      this.passwordUser = passwordUser;
   }

   public CharSequence getPasswordOldUser() {
      return passwordOldUser;
   }

   public void setPasswordOldUser(CharSequence passwordOldUser) {
      this.passwordOldUser = passwordOldUser;
   }

   public CharSequence getAccountNumberUser() {
      return accountNumberUser;
   }

   public void setAccountNumberUser(CharSequence accountNumberUser) {
      this.accountNumberUser = accountNumberUser;
   }

   public CharSequence getAccountAgencyUser() {
      return accountAgencyUser;
   }

   public void setAccountAgencyUser(CharSequence accountAgencyUser) {
      this.accountAgencyUser = accountAgencyUser;
   }

   public CharSequence getAccountNameUser() {
      return accountNameUser;
   }

   public void setAccountNameUser(CharSequence accountNameUser) {
      this.accountNameUser = accountNameUser;
   }

   @Override
   public String toString() {
      return "User{" +
              "idUser=" + idUser +
              ", nameUser=" + nameUser +
              ", emailUser=" + emailUser +
              ", phoneUser=" + phoneUser +
              ", passwordUser=" + passwordUser +
              ", passwordOldUser=" + passwordOldUser +
              ", accountNumberUser=" + accountNumberUser +
              ", accountAgencyUser=" + accountAgencyUser +
              ", accountNameUser=" + accountNameUser +
              '}';
   }
}
