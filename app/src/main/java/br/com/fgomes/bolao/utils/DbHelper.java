package br.com.fgomes.bolao.utils;

import java.util.*;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.fgomes.bolao.objects.*;

/**
 * Classe responsavel por conectar no bd do ATMobile Launcher.
 *
 * Created by fernando.gomes on 21/11/2017.
 */
public class DbHelper extends SQLiteOpenHelper
{
   /**
    * Constante com o nome do banco de Dados.
    */
   private static final String DATABASE_NAME = "betbr";

   /**
    * Constante com a vers�o do Banco de Dados.
    */
   private static final int DATABASE_VERSION = 1;

   /**
    * Array de string com as querys para criar as tabelas do banco de dados.
    */
   private static final String[] SCRIPT_DATABASE_CREATE = new String[] {
           "CREATE TABLE Bet_BET(BET_Id_Bet INT(4) NOT NULL, BET_Player INT(4) NOT NULL, BET_Round INT(4) NOT NULL, BET_Score_Pri INT(2) NOT NULL," +
                   " BET_Score_Vis INT(2) NOT NULL, BET_Time_Sent DATE NOT NULL, BET_Canal_Sent INT(2) NOT NULL, BET_Status_Sent INT(2) NOT NULL);",
           "CREATE TABLE Player_PLA(PLA_Id_Player INT(4) NOT NULL, PLA_Name CHAR(30) NOT NULL, PLA_Email CHAR(50) NOT NULL, PLA_Phone CHAR(14) NOT NULL, PLA_Password CHAR(8) NOT NULL, PLA_Password_Old CHAR(8), " +
                   "PLA_Password_Remember CHAR(8) NOT NULL, PLA_Account_Name CHAR(20), PLA_Account_Agency CHAR(8), PLA_Account_Number CHAR(8), PLA_Address CHAR(50));",
           "CREATE TABLE Round_ROU(ROU_Id_Round INT(4) NOT NULL, ROU_Number_Round INT(2) NOT NULL, ROU_Team_Pri INT(2) NOT NULL, ROU_Team_Vis INT(2) NOT NULL, ROU_Date_Round DATE NOT NULL," +
                   " ROU_Local_Game INT(2) NOT NULL, ROU_Score_Time_Pri INT(2) NOT NULL, ROU_Score_Time_Vis INT(2) NOT NULL);",
           "CREATE TABLET Activation_ACT(ACT_Id_Activation INT(4) NOT NULL, ACT_Name_Activation CHAR(15) NOT NULL, ACT_Key_Activation CHAR(10) NOT NULL, ACT_Date_Gen_Activation Date NOT NULL," +
                   "ACT_Date_Val_Activation Date NOT NULL, ACT_Status_Activation INT(1) NOT NULL);"
   };

   /**
    * Construtor padrao que recebe um contexto.
    *
    * @param p_context
    */
   public DbHelper( Context p_context )
   {
      super( p_context, DATABASE_NAME, null, DATABASE_VERSION );
   }

   /**
    * Metodo onCreate para criar as tabelas no banco de dados.
    */
   @Override
   public void onCreate( SQLiteDatabase p_db )
   {
      String SqlBet_BET = "CREATE TABLE Bet_BET(BET_Id_Bet INT(4) NOT NULL, BET_Player INT(4) NOT NULL, BET_Round INT(4) NOT NULL, BET_Score_Pri INT(2) NOT NULL," +
              " BET_Score_Vis INT(2) NOT NULL, BET_Time_Sent DATE NOT NULL, BET_Canal_Sent INT(2) NOT NULL, BET_Status_Sent INT(2) NOT NULL);";
      p_db.execSQL( SqlBet_BET );
      String SqlPlayer_PLA = "CREATE TABLE Player_PLA(PLA_Id_Player INT(4) NOT NULL, PLA_Name CHAR(30) NOT NULL, PLA_Email CHAR(50) NOT NULL, PLA_Phone CHAR(14) NOT NULL, PLA_Password CHAR(8) NOT NULL, PLA_Password_Old CHAR(8), " +
              "PLA_Password_Remember CHAR(8) NOT NULL, PLA_Account_Name CHAR(20), PLA_Account_Agency CHAR(8), PLA_Account_Number CHAR(8), PLA_Address CHAR(50));";
      p_db.execSQL( SqlPlayer_PLA );
      String SqlRound_ROU = "CREATE TABLE Round_ROU(ROU_Id_Round INT(4) NOT NULL, ROU_Number_Round INT(2) NOT NULL, ROU_Team_Pri INT(2) NOT NULL, ROU_Team_Vis INT(2) NOT NULL, ROU_Date_Round DATE NOT NULL," +
              " ROU_Local_Game INT(2) NOT NULL, ROU_Score_Time_Pri INT(2) NOT NULL, ROU_Score_Time_Vis INT(2) NOT NULL);";
      p_db.execSQL( SqlRound_ROU );
      String SqlActivation_ACT = "CREATE TABLET Activation_ACT(ACT_Id_Activation INT(4) NOT NULL, ACT_Name_Activation CHAR(15) NOT NULL, ACT_Key_Activation CHAR(10) NOT NULL, ACT_Date_Gen_Activation Date NOT NULL," +
              "ACT_Date_Val_Activation Date NOT NULL, ACT_Status_Activation INT(1) NOT NULL);";
      p_db.execSQL( SqlActivation_ACT );
   }

   /**
    * Metodo que atualiza o banco de dados.
    */
   @Override
   public void onUpgrade( SQLiteDatabase p_db, int p_oldVersion, int p_newVersion )
   {
      String SqlDropTableBet_BET = "DROP TABLE Bet_BET";
      p_db.execSQL( SqlDropTableBet_BET );
      onCreate( p_db );

      String SqlDropTablePlayer_PLA = "DROP TABLE Player_PLA";
      p_db.execSQL( SqlDropTablePlayer_PLA );
      onCreate( p_db );

      String SqlDropTableRound_ROU = "DROP TABLE Round_ROU";
      p_db.execSQL( SqlDropTableRound_ROU );
      onCreate( p_db );

      String SqlDropTableActivation_ACT = "DROP TABLE Activation_ACT";
      p_db.execSQL( SqlDropTableActivation_ACT );
      onCreate( p_db );
   }

   /**
    * Method that inserts a player into the database.
    *
    * @param p_player Player_PLA.
    */
   public void insertPlayer( Player p_player )
   {
      SQLiteDatabase db = getWritableDatabase();

      ContentValues cv = new ContentValues();

      cv.put( "PLA_Id_Player", p_player.getM_PLA_Id_Player());
      cv.put( "PLA_Name", p_player.getM_PLA_Name().toString() );
      cv.put( "PLA_Email", p_player.getM_PLA_Email().toString() );
      cv.put( "PLA_Phone", p_player.getM_PLA_Phone().toString() );
      cv.put( "PLA_Password", p_player.getM_PLA_Password().toString());
      cv.put( "PLA_Password_Old", p_player.getM_PLA_Password_Old().toString());
      cv.put( "PLA_Password_Remember", p_player.getM_PLA_Password_Remember().toString());
      cv.put( "PLA_Account_Name", p_player.getM_PLA_Account_Bank().toString());
      cv.put( "PLA_Account_Agency", p_player.getM_PLA_Account_Agency().toString());
      cv.put( "PLA_Account_Number", p_player.getM_PLA_Account_Number().toString());
      cv.put( "PLA_Address", p_player.getM_PLA_Address().toString());

      db.insert( "Bet_bet", null, cv );
      db.close();
   }

   /**
    * Method that inserts an activation into the database.
    *
    * @param p_activation Player_PLA.
    */
   public void insertActivation( Activation p_activation )
   {
      SQLiteDatabase db = getWritableDatabase();

      ContentValues cv = new ContentValues();

      cv.put( "ACT_Id_activation", p_activation.getM_ACT_Id_Activation());
      cv.put( "ACT_Name_Activation", p_activation.getM_ACT_Name_Activation().toString() );
      cv.put( "ACT_Key_Activation", p_activation.getM_ACT_Key_Activation().toString() );
      cv.put( "ACT_Date_Gen_Activation", p_activation.getM_ACT_Date_Gen_Activation().toString());
      cv.put( "ACT_Date_Val_Activation", p_activation.getM_ACT_Date_Val_Activation().toString());
      cv.put( "ACT_Status_activation", p_activation.getM_ACT_Status_Activation());

      db.insert( "Activation_ACT", null, cv );
      db.close();
   }

   /*
    * Metodo que inseri no banco o parametro inexistente.
    */
   public boolean insertParameter( int p_parameter, String p_parameterValue )
   {
      boolean result = false;

      SQLiteDatabase db = getWritableDatabase();

      try
      {
         ContentValues cv = new ContentValues();
         cv.put( "PAR_NUM_Number", p_parameter );
         cv.put( "PAR_TXT_Value", p_parameterValue );
         cv.put( "PAR_TXT_OldValue", "0" );

         db.insert( "Parameter_PAR", null, cv );

         db.close();

         result = true;
      }
      catch ( Exception p_e )
      {
         p_e.printStackTrace();
      }

      return result;
   }

   /**
    * Metodo que seleciona um App pelo "name" pesquisado.
    *
    * @param p_nameapp a ser pesquisado.
    *
    * @return resultado com o name pesquisado.
    */
   public String selectNameApp( String p_nameapp )
   {
      String nameApp = "";

      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectOneAppInfo = "SELECT * FROM AppInfo_APP WHERE APP_TXT_Name = '"
              + p_nameapp + "';";

      Cursor c = db.rawQuery( SqlSelectOneAppInfo, null );

      if ( c.moveToFirst() )
      {
         nameApp = c.getString( 0 );
      }
      else
      {
         nameApp = "no";
      }
      c.close();

      return nameApp;
   }

   /**
    * Metodo que seleciona um App pelo label ou pelo name..
    *
    * @param p_type a ser pesquisado: label; name;
    *
    * @param p_value nome do app.
    *
    * @param p_column resultado que deseja. 1 name- 2 label - 3 permission.
    *
    * @return resultApp com o name pesquisado.
    */
   public String selectAppForType( String p_type, String p_value, int p_column )
   {
      String resultApp = "";

      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectOneAppInfo = "SELECT * FROM AppInfo_APP WHERE " + p_type + " = '" + p_value + "';";

      Cursor c = db.rawQuery( SqlSelectOneAppInfo, null );

      // Verifica se a requisi��o � label ou name.
      if ( p_type.equals( "label" ) )
      {
         p_column = 0;
      }
      if ( p_type.equals( "name" ) )
      {
         p_column = 1;
      }
      if ( p_type.equals( "permission" ) )
      {
         p_column = 2;
      }

      // Pega o item requisitado.
      if ( c.moveToFirst() )
      {
         resultApp = c.getString( p_column );
      }
      else
      {
         resultApp = "no";
      }
      c.close();

      return resultApp;
   }

   /**
    * Metodo que seleciona a permissao de um determinado App.
    *
    * @param p_nameapp nome do App que deseja saber sua permissao.
    *
    * @return permissionApp retorna a permissao do App pesquisado.
    */
   public String selectPermissionApp( String p_nameapp )
   {
      String permissionApp = null;

      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectOneAppInfo = "SELECT * FROM AppInfo_APP permission WHERE APP_TXT_name = '"
              + p_nameapp + "';";

      Cursor c = db.rawQuery( SqlSelectOneAppInfo, null );

      if ( c.moveToFirst() )
      {
         permissionApp = c.getString( 2 );
      }
      else
      {
         permissionApp = "0";
      }
      c.close();

      return permissionApp;
   }

   /**
    * Metodo que busca a senha no banco de dados.
    *
    * @param p_column "password" ou "oldPassword".
    *
    * @return retorna a senha ou a senha antiga.
    *
    */
   public String selectPassWord( String p_column )
   {
      String returnPasswordColumn = null;
      int requestCoumn = 0;

      if ( p_column.equals( "PSW_TXT_Password" ) )
      {
         requestCoumn = 0;
      }
      if ( p_column.equals( "PSW_TXT_OldPassword" ) )
      {
         requestCoumn = 1;
      }

      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectPassword = "SELECT * FROM Password_PSW;";

      Cursor c = db.rawQuery( SqlSelectPassword, null );

      if ( c.moveToFirst() )
      {
         returnPasswordColumn = c.getString( requestCoumn );
      }
      c.close();

      return returnPasswordColumn;
   }

   /**
    * Metodo que seleciona a permissao de um determinado App.
    *
    * @param p_numberParameter nome do App que deseja saber sua permissao.
    *
    * @return valueParameter retorna o valor do parametro.
    */
   public String selectParameter( int p_numberParameter )
   {
      String valueParameter = "";

      //Validar se existe o parametro no banco.


      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectOneAppInfo = "SELECT * FROM Parameter_PAR WHERE PAR_NUM_Number = '"
              + p_numberParameter + "';";

      Cursor c = db.rawQuery( SqlSelectOneAppInfo, null );

      if ( c.moveToFirst() )
      {
         valueParameter = c.getString( 1 );
         if ( valueParameter == null )
         {
            valueParameter = "nulo";
         }
      }
      return valueParameter;
   }

   /*
    * Method that lists a player.
    *
    * @return listPlayer return the list whit all the object.
    */
   public List<Player> selectAllPlayer()
   {
      List<Player> listPlayer = new ArrayList<Player>();

      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectAppAppInfo = "SELECT * FROM Activation_ACT";

      Cursor c = db.rawQuery( SqlSelectAppAppInfo, null );

      if ( c.moveToFirst() )
      {
         do
         {
            Player appInfo = new Player();

            appInfo.setM_PLA_Name( c.getString( 0 ) );
            appInfo.setM_PLA_Email( c.getString( 1 ) );
            appInfo.setM_PLA_Phone( c.getString( 2 ) );
            appInfo.setM_PLA_Password( c.getString( 3 ) );
            appInfo.setM_PLA_Password_Old( c.getString( 4 ) );
            appInfo.setM_PLA_Password_Remember( c.getString( 5 ) );
            appInfo.setM_PLA_Account_Bank( c.getString( 6 ) );
            appInfo.setM_PLA_Account_Agency( c.getString( 7 ) );
            appInfo.setM_PLA_Account_Number( c.getString( 8 ) );
            appInfo.setM_PLA_Address( c.getString( 9 ) );

            listPlayer.add( appInfo );
         } while ( c.moveToNext() );
      }
      db.close();

      return listPlayer;
   }

   /**
    * Met�do que seleciona o Label de todos os Apps.
    *
    * @return labelAllAppinfoDB retorna uma lista com todos os labels.
    */
   public List<String> selectLabelAllAppsDB()
   {
      List<String> labelAllAppinfoDB = new ArrayList<String>();
      String label = "";

      SQLiteDatabase db = getReadableDatabase();

      String SqlSelectAllApps = "SELECT * FROM AppInfo_APP";

      Cursor c = db.rawQuery( SqlSelectAllApps, null );

      if ( c.moveToFirst() )
      {
         do
         {
            label = c.getString( 1 );
            labelAllAppinfoDB.add( label );
         } while ( c.moveToNext() );
      }
      db.close();
      return labelAllAppinfoDB;
   }

   /**
    * Metodo que altera as senhas de configuracao do Launcher ATMobile.
    *
    * @param p_typePassword tipo de senha - PSW_TXT_password / PSW_TXT_oldPassword.
    *
    * @param p_password novo valor.
    */
   public void updatePassword( String p_typePassword, String p_password )
   {
      SQLiteDatabase db = getWritableDatabase();

      String SqlUpdatePassword = "UPDATE Password_PSW set " + p_typePassword + "  = '" + p_password + "';";

      db.execSQL( SqlUpdatePassword );

      db.close();
   }

   /**
    * Metodo que altera a permissao dos Apps.
    *
    * @param p_name Nome do App.
    *
    * @param p_permission Novo valor de permissao - 0 / 1.
    */
   public void updatePermissionAppInfo( String p_name, String p_permission )
   {
      SQLiteDatabase db = getWritableDatabase();

      String SqlUpdatePermissionAppInfo = "UPDATE AppInfo_APP set APP_TXT_Permission = '" + p_permission
              + "' WHERE APP_TXT_Name = '"
              + p_name + "';";

      db.execSQL( SqlUpdatePermissionAppInfo );

      db.close();
   }

   /**
    * Metodo que altera a permissao de todos os Apps de uma so vez.
    *
    * @param p_valuePermission valor para qual quer alterar 0;1;
    *
    * @return resultUpdateAllPermissionApp booleando para caso true: sucesso ou false: erro.
    */
   public boolean updateAllAppPermission( String p_valuePermission )
   {
      boolean resultUpdateAllPermissionApp = false;
      SQLiteDatabase db = getWritableDatabase();

      try
      {
         String SqlUpdateAllPermissionApp = "UPDATE AppInfo_APP set APP_TXT_Permission = '" + p_valuePermission + "';";

         db.execSQL( SqlUpdateAllPermissionApp );

         db.close();
         resultUpdateAllPermissionApp = true;
      }
      catch ( Exception e )
      {
         e.printStackTrace();
      }
      return resultUpdateAllPermissionApp;
   }

   /**
    * Metodo que altera parametro.
    *
    * @param p_parameter Nome do App.
    *
    * @param p_valueParameter Novo valor de permissao - 0 / 1.
    */
   public void updateParameter( int p_parameter, String p_valueParameter )
   {
      SQLiteDatabase db = getWritableDatabase();

      // Seleciona o valor atual do par�metro e inseri no oldValue do par�metro.
      String valueForOldValue = selectParameter( p_parameter );
      String SqlUpdateParameterOldValue = "UPDATE Parameter_PAR set PAR_TXT_OldValue = '" + valueForOldValue
              + "' WHERE PAR_NUM_Number = '"
              + p_parameter + "';";
      db.execSQL( SqlUpdateParameterOldValue );
      String SqlUpdateParameter = "UPDATE Parameter_PAR set PAR_TXT_Value = '" + p_valueParameter
              + "' WHERE PAR_NUM_Number = '"
              + p_parameter + "';";
      db.execSQL( SqlUpdateParameter );

      db.close();
   }

   /**
    * Metodo que faz uma limpeza nas tabelas do banco de dados.
    *
    * @return true / false.
    */
   public boolean dropDB()
   {
      boolean confirmDeleteTable = false;
      try
      {
         SQLiteDatabase db = getWritableDatabase();

         String SqlDropDbAppInfo = "DELETE FROM AppInfo_APP";
         String SqlUpdatePassword = "UPDATE Password_PSW set PSW_TXT_password  = 'autotrac2016';";
         String SqlUpdateOldPassword = "UPDATE Password_PSW set PSW_TXT_OldPassword  = 'autotrac2016';";

         db.execSQL( SqlDropDbAppInfo );
         db.execSQL( SqlUpdatePassword );
         db.execSQL( SqlUpdateOldPassword );

         db.close();
         confirmDeleteTable = true;
      }
      catch ( Exception p_e )
      {
         p_e.printStackTrace();
      }
      return confirmDeleteTable;
   }
}

