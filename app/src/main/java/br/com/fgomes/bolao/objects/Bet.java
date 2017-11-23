package br.com.fgomes.bolao.objects;

import java.util.*;

/**
 * Created by fernando.gomes on 21/11/2017.
 */

public class Bet {
   /** Id Bet. */
   public int m_BET_Id_Bet;
   /** Id Player. */
   public int m_BET_Player;
   /** Id Round. */
   public int m_BET_Round;
   /** Score teamPri. */
   public int m_BET_Score_Pri;
   /** Score teamVis. */
   public int m_BET_Score_Vis;
   /** Date Sent Bet. */
   public Date m_BET_Time_Sent;
   /** Sending of the sending. */
   public int m_BET_Canal_Sent;
   /** Status Sending Bet. */
   public int m_BET_Status_Sent;

   public int getM_BET_Id_Bet() {
      return m_BET_Id_Bet;
   }

   public void setM_BET_Id_Bet(int m_BET_Id_Bet) {
      this.m_BET_Id_Bet = m_BET_Id_Bet;
   }

   public int getM_BET_Player() {
      return m_BET_Player;
   }

   public void setM_BET_Player(int m_BET_Player) {
      this.m_BET_Player = m_BET_Player;
   }

   public int getM_BET_Round() {
      return m_BET_Round;
   }

   public void setM_BET_Round(int m_BET_Round) {
      this.m_BET_Round = m_BET_Round;
   }

   public int getM_BET_Score_Pri() {
      return m_BET_Score_Pri;
   }

   public void setM_BET_Score_Pri(int m_BET_Score_Pri) {
      this.m_BET_Score_Pri = m_BET_Score_Pri;
   }

   public int getM_BET_Score_Vis() {
      return m_BET_Score_Vis;
   }

   public void setM_BET_Score_Vis(int m_BET_Score_Vis) {
      this.m_BET_Score_Vis = m_BET_Score_Vis;
   }

   public Date getM_BET_Time_Sent() {
      return m_BET_Time_Sent;
   }

   public void setM_BET_Time_Sent(Date m_BET_Time_Sent) {
      this.m_BET_Time_Sent = m_BET_Time_Sent;
   }

   public int getM_BET_Canal_Sent() {
      return m_BET_Canal_Sent;
   }

   public void setM_BET_Canal_Sent(int m_BET_Canal_Sent) {
      this.m_BET_Canal_Sent = m_BET_Canal_Sent;
   }

   public int getM_BET_Status_Sent() {
      return m_BET_Status_Sent;
   }

   public void setM_BET_Status_Sent(int m_BET_Status_Sent) {
      this.m_BET_Status_Sent = m_BET_Status_Sent;
   }
}
