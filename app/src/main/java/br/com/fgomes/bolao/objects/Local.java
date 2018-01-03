package br.com.fgomes.bolao.objects;

/**
 * Created by fernando.gomes on 03/01/2018.
 */

public class Local {
   public int idLocal;
   public CharSequence nameLocal;
   public CharSequence nickNameLocal;
   public CharSequence stateLocalLocal;

   public Local(int idLocal, CharSequence nameLocal, CharSequence nickNameLocal, CharSequence stateLocalLocal) {
      this.idLocal = idLocal;
      this.nameLocal = nameLocal;
      this.nickNameLocal = nickNameLocal;
      this.stateLocalLocal = stateLocalLocal;
   }

   public int getIdLocal() {
      return idLocal;
   }

   public void setIdLocal(int idLocal) {
      this.idLocal = idLocal;
   }

   public CharSequence getNameLocal() {
      return nameLocal;
   }

   public void setNameLocal(CharSequence nameLocal) {
      this.nameLocal = nameLocal;
   }

   public CharSequence getNickNameLocal() {
      return nickNameLocal;
   }

   public void setNickNameLocal(CharSequence nickNameLocal) {
      this.nickNameLocal = nickNameLocal;
   }

   public CharSequence getStateLocalLocal() {
      return stateLocalLocal;
   }

   public void setStateLocalLocal(CharSequence stateLocalLocal) {
      this.stateLocalLocal = stateLocalLocal;
   }
}
