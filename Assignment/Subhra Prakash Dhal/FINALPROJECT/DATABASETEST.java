
import java.io.*; 
 import java.sql.*; 
 import java.util.*; 
  
 public class DATABASETEST { 
  
     public static Connection CNCT; 
     public static Statement STMT; 
     public static ResultSet RS; 
     //public static ResultSetMetaData RMSD; 
  
     public static String PADL(int ML,String S,char c){ 
  
         if(ML>S.length()){ 
             /*for(int i=0;i<(ML-S.length());i++){ 
                 S=String.valueOf(c)+S; 
             }*/ 
             while(S.length()!=ML){ 
                 S=S+(String.valueOf(c)); 
             } 
         } 
  
         return S; 
     } 
  
     public static String PADR(int ML,String S,char c){ 
         //System.out.println("MAX LENG : "+ML+" STRING LEN : "+S.length()+"\n"); 
         if(ML>S.length()){ 
             /*for(int i=0;i<(ML-S.length());i++){ 
                 S=S+String.valueOf(c); 
             }*/ 
             while(S.length()!=ML){ 
                 S=S+(String.valueOf(c)); 
             } 
         } 
         //System.out.println("RETURNING STRING LENGTH : "+S.length()); 
         return S; 
     } 
  
     public static int MAININS()throws Exception{                  //MAIN MENU INSTRUCTION WHICH WILL RETURN 
         System.out.print("\n"+                                      //CHOICE OF THE USER 
                          "1)CONTACT\n"+                             // 
                          "2)CATEGORY\n"+                            // 
                          "3)LOCATION\n"+ 
                          "4)EXIT FINAL\n\n"+ 
                          "YOUR CHOICE : "); 
         BufferedReader Br= new BufferedReader(new InputStreamReader(System.in)); 
         Integer CH=Integer.parseInt(Br.readLine()); 
         return CH.intValue(); 
     } 
  
     public static int CONINS()throws Exception{                   // 
         System.out.print("\n"+                                      //CONTACT MENU INSTRUCTIONS WHICH WILL  
                          "1)DISPLAY\n"+                             //RETURN CHOICE OF USER. 
                          "2)ADD\n"+                                 // 
                          "3)MODIFY/UPDATE\n"+ 
                          "4)DELETE\n"+ 
                          "5)EXIT TO MAIN MENU\n\n"+ 
                          "YOUR CHOICE : "); 
         BufferedReader Br= new BufferedReader(new InputStreamReader(System.in)); 
         Integer CH=Integer.parseInt(Br.readLine()); 
         return CH.intValue(); 
     } 
  
     public static int CATINS()throws Exception{                   // 
         System.out.print("\n"+                                      //CATEGORY MENU INSTRUCTIONS WHICH WILL  
                          "1)DISPLAY\n"+                             //RETURN CHOICE OF USER. 
                          "2)ADD\n"+                                 // 
                          "3)MODIFY/UPDATE\n"+ 
                          "4)DELETE\n"+ 
                          "5)EXIT TO MAIN MENU\n\n"+ 
                          "YOUR CHOICE : "); 
         BufferedReader Br= new BufferedReader(new InputStreamReader(System.in)); 
         Integer CH=Integer.parseInt(Br.readLine()); 
         return CH.intValue(); 
     } 
  
     public static int LOCINS()throws Exception{                   // 
         System.out.print("\n"+                                      //LOCATION MENU INSTRUCTIONS WHICH WILL  
                          "1)DISPLAY\n"+                             //RETURN CHOICE OF USER. 
                          "2)ADD\n"+                                 // 
                          "3)MODIFY/UPDATE\n"+ 
                          "4)DELETE\n"+ 
                          "5)EXIT TO MAIN MENU\n\n"+ 
                          "YOUR CHOICE : "); 
         BufferedReader Br= new BufferedReader(new InputStreamReader(System.in)); 
         Integer CH=Integer.parseInt(Br.readLine()); 
         return CH.intValue(); 
     } 
  
     public static void MAINMENU()throws Exception{ 
  
         int CH=MAININS(); 
  
         if(CH==1){ 
             //System.out.println("\n\nTHIS SECTION IS NOT DEVELOPED YET\n\n"); 
             CONMENU(); 
             MAINMENU(); 
         } 
         else if(CH==2){ 
             //System.out.println("\n\nTHIS SECTION IS NOT DEVELOPED YET\n\n"); 
             CATMENU(); 
             MAINMENU(); 
         } 
         else if(CH==3){ 
             LOCMENU(); 
             MAINMENU(); 
         } 
         else if(CH==4){ 
             if(!RS.isClosed()){ 
                 RS.close(); 
             } 
             if(!STMT.isClosed()){ 
                 STMT.close(); 
             } 
             if(!CNCT.isClosed()){ 
                 CNCT.close(); 
             } 
             //STMT.close(); 
             //CNCT.close(); 
             System.exit(0); 
         }else{ 
             System.out.print("\n\nTHERE IS NO SUCH ACTION FEEDED FOR THE CHOICE "+CH+"\n\n"); 
             MAINMENU(); 
         } 
  
         //return CH.intValue(); 
     } 
  
     public static void CONMENU()throws Exception{                  
         ResultSetMetaData RSMD; 
         int max=0; 
         int CH=CONINS();                                            //HERE THE CONTACT MENU OPERATIONS WILL BE DONE 
         if(CH==1){                                                  //AS ADDING,MODIFYING/UPDATING,DELETING,DISPLAYING  
                                                                     //ON THE CONTACT TABLE. 
             RS=STMT.executeQuery("SELECT * FROM contact_d"); 
             RSMD=RS.getMetaData(); 
  
             Integer COLARR[]=new Integer[RSMD.getColumnCount()];    //AN ARRAY TO STORE THE LONGEST STRING FOUND 
             Arrays.fill(COLARR,0);                              //IN THE COLUMNDS. 
  
             {                                                           //FROM THIS TO  
                 for(int i=1;i<=RSMD.getColumnCount();i++){              // 
                     if(COLARR[i-1]<RSMD.getColumnName(i).length()){     // 
                         COLARR[i-1]=RSMD.getColumnName(i).length();     // 
                     }                                                   // SECTION IS FOR FINDING THE MAX LEGNTH 
                 }                                                       // OF THE STRING OF THE TABLE 
                 while(RS.next()){                                       // 
                     for(int i=1;i<=RSMD.getColumnCount();i++){          // 
                         if(COLARR[i-1]<(RS.getString(i).length())){     // 
                             COLARR[i-1]=RS.getString(i).length();       // 
                         }                                               // 
                     }                                                   // 
                 }                                                       // 
             }                                                           //THIS 
  
             {                                                                       // 
                 //System.out.println("THIS METHOD IS ON DEVELOPMENT.\n");           // 
                                                                                     // 
                 for(int i=0;i<COLARR.length;i++){                                   //THIS SECTION IS TO GET 
                     //System.out.println(i+" INDEX HAVE VALUE : "+COLARR[i]);       //THE SUM OF THE LONGEST 
                     max+=COLARR[i];                                                 //STRING FOUND IN EACH - 
                 }                                                                   //COLUMN. 
                 //System.out.println("TOTAL MAXIMUM LENGTH OF THE ROW IS : "+max);  // 
             }                                                                       // 
  
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){                                               //THIS TO  
                 System.out.print("-");                                            //   
             }                                                                       // 
             System.out.println();                                                   //THIS IS FOR PRINTING 
             for(int i=1;i<=RSMD.getColumnCount();i++){                              //THE METADATA/HEADING 
                 int Tmax=COLARR[i-1].intValue();                                    // 
                 System.out.print("| "+(PADR(Tmax,RSMD.getColumnName(i),' '))+" ");// 
             }                                                                       // 
             System.out.print("|");System.out.println();                           //THIS 
  
             RS=STMT.executeQuery("SELECT * FROM contact_d");                     //INITIALIZING A NEW RESULTSET AS WE HAVE REACHED THE END OF THE RESULTSET EARLIER(JUST ABOVE). 
  
             while(RS.next()){                                                       //THIS TO 
                 for(int i=1;i<=RSMD.getColumnCount();i++){                          // 
                     int Tmax=COLARR[i-1].intValue();                                // 
                     System.out.print("| "+(PADR(Tmax,RS.getString(i),' '))+" ");  //PRINTING THE COLUMN ELEMENTS 
                 }                                                                   //IN A PROPER MANNER (WITHIN A 
                 System.out.print("|");                                            //BOX) 
                 System.out.println();                                               // 
             }                                                                       // 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){                                               // 
                 System.out.print("-");                                            //   
             }                                                                       //THIS 
  
             CONMENU(); 
  
         } 
         else if(CH==2){ 
             //System.out.println("\n\nTHIS OPTION IS UNDER DEVELOPMENT THANK YOU\n\n"); 
  
             BufferedReader Br = new BufferedReader(new InputStreamReader(System.in)); 
             RS=STMT.executeQuery("SELECT * FROM contact_d"); 
             RSMD=RS.getMetaData(); 
             StringBuffer FinStr=new StringBuffer("INSERT INTO contact_d VALUES ("); 
             for(int i=1;i<=RSMD.getColumnCount();i++){ 
  
                 String TS=new String(); 
                 System.out.print(RSMD.getColumnName(i)+" : "); 
                 TS=Br.readLine(); 
                 if(RSMD.getColumnType(i)==4){ 
  
                 } 
                 else { 
                     TS="\""+TS+"\""; 
                 } 
                 if(i!=RSMD.getColumnCount()){ 
                     TS=TS+","; 
                 } 
                 FinStr.append(TS); 
                 //TS.append((String.valueOf(i)+","+Br.readLine())) 
             } 
             FinStr.append(")"); 
             System.out.println("THE ARGUMENT STRING : "+FinStr); 
             int Suc=STMT.executeUpdate(FinStr.toString()); 
             System.out.print("ARGUMENT "+FinStr+" HAS PASSING "); 
             if(Suc==0){ 
                 System.out.print("FAILED \n"); 
             } 
             else if(Suc>0){ 
                 System.out.println("SUCCESSFUL\n"); 
             } 
  
             CONMENU(); 
         } 
         else if(CH==3){ 
             System.out.println("\n\nTHIS OPTION IS UNDER DEVELOPMENT THANK YOU\n\n"); 
             CONMENU(); 
         } 
         else if(CH==4){ 
             //System.out.println("\n\nTHIS OPTION IS UNDER DEVELOPMENT THANK YOU\n\n"); 
             RS=STMT.executeQuery("SELECT * FROM contact_d"); 
             RSMD=RS.getMetaData(); 
             BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){ 
                 System.out.print("-"); 
             }System.out.println(); 
             for(int i=1;i<=RSMD.getColumnCount();i++){ 
                 System.out.print("| "+PADR(20,RSMD.getColumnName(i),' ')+" "); 
             } 
             System.out.print("|");System.out.println(); 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){ 
                 System.out.print("-"); 
             }System.out.println(); 
             while(RS.next()){ 
                 for(int i=1;i<=RSMD.getColumnCount();i++){ 
                     System.out.print("| "+PADR(20,RS.getString(i),' ')+" "); 
                 } 
                 System.out.print("|");System.out.println(); 
             } 
             System.out.print("\n\nTHE ID YOU WANT TO DELETE : "); 
             String ID=BR.readLine(); 
             String FinS=new String("DELETE FROM contact_d WHERE cnID="+ID); 
             System.out.println("\n\nARGUMENT : "+FinS); 
             int Ar=STMT.executeUpdate(FinS); 
             if(Ar==0){ 
                 System.out.println("FAILED"); 
             }  
             else if(Ar>0){ 
                 System.out.println("SUCESSFUL."); 
             } 
             CONMENU(); 
         } 
         else if(CH==5){ 
             System.out.println("\nENTERING TO MAIN MENU.......\n\n"); 
             MAINMENU(); 
         } 
         else{ 
             System.out.println("\n\nTHERE NO SUCH ACTION FEEDED FOR YOUR CHOICE"+CH+"\n\n"); 
             CONMENU(); 
         } 
     } 
  
     public static void CATMENU()throws Exception{                   
         ResultSetMetaData RSMD; 
         int max=0; 
         int CH=CATINS();                                            //HERE THE CATEGORY MENU OPERATIONS WILL BE DONE 
         if(CH==1){                                                  //AS ADDING,MODIFYING/UPDATING,DELETING,DISPLAYING  
                                                                     //ON THE CONTACT TABLE. 
             RS=STMT.executeQuery("SELECT * FROM category"); 
             RSMD=RS.getMetaData(); 
  
             Integer COLARR[]=new Integer[RSMD.getColumnCount()];    //AN ARRAY TO STORE THE LONGEST STRING FOUND 
             Arrays.fill(COLARR,0);                              //IN THE COLUMNDS. 
  
             {                                                           //FROM THIS TO  
                 for(int i=1;i<=RSMD.getColumnCount();i++){              // 
                     if(COLARR[i-1]<RSMD.getColumnName(i).length()){     // 
                         COLARR[i-1]=RSMD.getColumnName(i).length();     // 
                     }                                                   // SECTION IS FOR FINDING THE MAX LEGNTH 
                 }                                                       // OF THE STRING OF THE TABLE 
                 while(RS.next()){                                       // 
                     for(int i=1;i<=RSMD.getColumnCount();i++){          // 
                         if(COLARR[i-1]<(RS.getString(i).length())){     // 
                             COLARR[i-1]=RS.getString(i).length();       // 
                         }                                               // 
                     }                                                   // 
                 }                                                       // 
             }                                                           //THIS 
  
             {                                                                       // 
                 //System.out.println("THIS METHOD IS ON DEVELOPMENT.\n");           // 
                                                                                     // 
                 for(int i=0;i<COLARR.length;i++){                                   //THIS SECTION IS TO GET 
                     //System.out.println(i+" INDEX HAVE VALUE : "+COLARR[i]);       //THE SUM OF THE LONGEST 
                     max+=COLARR[i];                                                 //STRING FOUND IN EACH - 
                 }                                                                   //COLUMN. 
                 //System.out.println("TOTAL MAXIMUM LENGTH OF THE ROW IS : "+max);  // 
             }                                                                       // 
  
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){                                               //THIS TO  
                 System.out.print("-");                                            //   
             }                                                                       // 
             System.out.println();                                                   //THIS IS FOR PRINTING 
             for(int i=1;i<=RSMD.getColumnCount();i++){                              //THE METADATA/HEADING 
                 int Tmax=COLARR[i-1].intValue();                                    // 
                 System.out.print("| "+(PADR(Tmax,RSMD.getColumnName(i),' '))+" ");// 
             }                                                                       // 
             System.out.print("|");System.out.println();                           //THIS 
  
             RS=STMT.executeQuery("SELECT * FROM category");                     //INITIALIZING A NEW RESULTSET AS WE HAVE REACHED THE END OF THE RESULTSET EARLIER(JUST ABOVE). 
  
             while(RS.next()){                                                       //THIS TO 
                 for(int i=1;i<=RSMD.getColumnCount();i++){                          // 
                     int Tmax=COLARR[i-1].intValue();                                // 
                     System.out.print("| "+(PADR(Tmax,RS.getString(i),' '))+" ");  //PRINTING THE COLUMN ELEMENTS 
                 }                                                                   //IN A PROPER MANNER (WITHIN A 
                 System.out.print("|");                                            //BOX) 
                 System.out.println();                                               // 
             }                                                                       // 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){                                               // 
                 System.out.print("-");                                            //   
             }                                                                       //THIS 
  
             CATMENU(); 
  
         } 
         else if(CH==2){ 
             //System.out.println("\n\nTHIS OPTION IS UNVER DEVELOPMENT THANK YOU\n\n"); 
  
             BufferedReader Br = new BufferedReader(new InputStreamReader(System.in)); 
             RS=STMT.executeQuery("SELECT * FROM category"); 
             RSMD=RS.getMetaData(); 
             StringBuffer FinStr=new StringBuffer("INSERT INTO category VALUES ("); 
             for(int i=1;i<=RSMD.getColumnCount();i++){ 
  
                 String TS=new String(); 
                 System.out.print(RSMD.getColumnName(i)+" : "); 
                 TS=Br.readLine(); 
                 if(RSMD.getColumnType(i)==12){ 
                     TS="\""+TS+"\""; 
                 } 
                 if(RSMD.getColumnType(i)==4){ 
  
                 } 
                 if(i!=RSMD.getColumnCount()){ 
                     TS=TS+","; 
                 } 
                 FinStr.append(TS); 
                 //TS.append((String.valueOf(i)+","+Br.readLine())) 
             } 
             FinStr.append(")"); 
             //System.out.println("THE ARGUMENT STRING : "+FinStr); 
             int Suc=STMT.executeUpdate(FinStr.toString()); 
             System.out.print("ARGUMENT "+FinStr+" HAS PASSING "); 
             if(Suc==0){ 
                 System.out.print("FAILED \n"); 
             } 
             else if(Suc>0){ 
                 System.out.println("SUCCESSFUL\n"); 
             } 
  
             CATMENU(); 
         } 
         else if(CH==3){ 
             //System.out.println("\n\nTHIS OPTION IS UNVER DEVELOPMENT THANK YOU\n\n"); 
             BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); 
             RS=STMT.executeQuery("SELECT * FROM category"); 
             RSMD=RS.getMetaData(); 
             StringBuffer FinSt=new StringBuffer("UPDATE category SET LNAME = "); 
  
             while(RS.next()){ 
                 for(int i=1;i<=RSMD.getColumnCount();i++){ 
  
                     System.out.print("| "+PADL(15,RS.getString(i),' ')+" "); 
  
                 } 
                 System.out.print("|"); 
                 System.out.println(); 
             } 
             System.out.print("\n\nENTER THE ID YOU WANT TO CHANGE : "); 
             String ID = BR.readLine(); 
             System.out.print("\n\nLOCATION NAME : "); 
             String NM = BR.readLine(); 
             FinSt.append("\""+NM+"\""+" WHERE Cid = "+ID); 
             System.out.println("\nFINAL ARGUMENT : "+FinSt); 
             int Dump=STMT.executeUpdate(FinSt.toString()); 
             if(Dump==0){ 
                 System.out.println("FAILED."); 
             } 
             else if(Dump>0){ 
                 System.out.println("PASSED."); 
             } 
             CATMENU(); 
         } 
         else if(CH==4){ 
             //System.out.println("\n\nTHIS OPTION IS UNDER DEVELOPMENT THAKN YOU\n\n"); 
             RS=STMT.executeQuery("SELECT * FROM category"); 
             RSMD=RS.getMetaData(); 
             BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){ 
                 System.out.print("-"); 
             }System.out.println(); 
             for(int i=1;i<=RSMD.getColumnCount();i++){ 
                 System.out.print("| "+PADR(20,RSMD.getColumnName(i),' ')+" "); 
             } 
             System.out.print("|");System.out.println(); 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){ 
                 System.out.print("-"); 
             }System.out.println(); 
             while(RS.next()){ 
                 for(int i=1;i<=RSMD.getColumnCount();i++){ 
                     System.out.print("| "+PADR(20,RS.getString(i),' ')+" "); 
                 } 
                 System.out.print("|");System.out.println(); 
             } 
             System.out.print("\n\nTHE ID YOU WANT TO DELETE : "); 
             String ID=BR.readLine(); 
             String FinS=new String("DELETE FROM category WHERE Cid="+ID); 
             System.out.println("\n\nARGUMENT : "+FinS); 
             int Ar=STMT.executeUpdate(FinS); 
             if(Ar==0){ 
                 System.out.println("FAILED"); 
             }  
             else if(Ar>0){ 
                 System.out.println("SUCESSFUL."); 
             } 
             CATMENU(); 
         } 
         else if(CH==5){ 
             System.out.println("\nENTERING TO MAIN MENU.......\n\n"); 
             MAINMENU(); 
         } 
         else{ 
             System.out.println("\n\nTHERE NO SUCH ACTION FEEDED FOR YOUR CHOICE"+CH+"\n\n"); 
             CATMENU(); 
         } 
     } 
  
     public static void LOCMENU()throws Exception{                  
         ResultSetMetaData RSMD; 
         int max=0; 
         //Integer[] COLARR=new Integer[2]; 
         int CH=LOCINS();                                            //HERE THE LOCATION MENU OPERATIONS WILL BE DONE 
         if(CH==1){                                                  //AS ADDING,MODIFYING/UPDATING,DELETING,DISPLAYING  
                                                                     //ON THE CONTACT TABLE. 
             RS=STMT.executeQuery("SELECT * FROM location"); 
             RSMD=RS.getMetaData(); 
  
             Integer COLARR[]=new Integer[RSMD.getColumnCount()];    //AN ARRAY TO STORE THE LONGEST STRING FOUND 
             Arrays.fill(COLARR,0);                              //IN THE COLUMNDS. 
  
             {                                                           //FROM THIS TO  
                 for(int i=1;i<=RSMD.getColumnCount();i++){              // 
                     if(COLARR[i-1]<RSMD.getColumnName(i).length()){     // 
                         COLARR[i-1]=RSMD.getColumnName(i).length();     // 
                     }                                                   // SECTION IS FOR FINDING THE MAX LEGNTH 
                 }                                                       // OF THE STRING OF THE TABLE 
                 while(RS.next()){                                       // 
                     for(int i=1;i<=RSMD.getColumnCount();i++){          // 
                         if(COLARR[i-1]<(RS.getString(i).length())){     // 
                             COLARR[i-1]=RS.getString(i).length();       // 
                         }                                               // 
                     }                                                   // 
                 }                                                       // 
             }                                                           //THIS 
  
             {                                                                       // 
                 //System.out.println("THIS METHOD IS ON DEVELOPMENT.\n");           // 
                                                                                     // 
                 for(int i=0;i<COLARR.length;i++){                                   //THIS SECTION IS TO GET 
                     //System.out.println(i+" INDEX HAVE VALUE : "+COLARR[i]);       //THE SUM OF THE LONGEST 
                     max+=COLARR[i];                                                 //STRING FOUND IN EACH - 
                 }                                                                   //COLUMN. 
                 //System.out.println("TOTAL MAXIMUM LENGTH OF THE ROW IS : "+max);  // 
             }                                                                       // 
  
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){                                               //THIS TO  
                 System.out.print("-");                                            //   
             }                                                                       // 
             System.out.println();                                                   //THIS IS FOR PRINTING 
             for(int i=1;i<=RSMD.getColumnCount();i++){                              //THE METADATA/HEADING 
                 int Tmax=COLARR[i-1].intValue();                                    // 
                 System.out.print("| "+(PADR(Tmax,RSMD.getColumnName(i),' '))+" ");// 
             }                                                                       // 
             System.out.print("|");System.out.println();                           //THIS 
  
             RS=STMT.executeQuery("SELECT * FROM location");                     //INITIALIZING A NEW RESULTSET AS WE HAVE REACHED THE END OF THE RESULTSET EARLIER(JUST ABOVE). 
  
             while(RS.next()){                                                       //THIS TO 
                 for(int i=1;i<=RSMD.getColumnCount();i++){                          // 
                     int Tmax=COLARR[i-1].intValue();                                // 
                     System.out.print("| "+(PADR(Tmax,RS.getString(i),' '))+" ");  //PRINTING THE COLUMN ELEMENTS 
                 }                                                                   //IN A PROPER MANNER (WITHIN A 
                 System.out.print("|");                                            //BOX) 
                 System.out.println();                                               // 
             }                                                                       // 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){                                               // 
                 System.out.print("-");                                            //   
             }                                                                       //THIS 
  
             LOCMENU(); 
  
         } 
         else if(CH==2){ 
             //System.out.println("\n\nTHIS SECTION IS STILL UNDER DEVELOPMENT THANK YOU\n\n"); 
             BufferedReader Br = new BufferedReader(new InputStreamReader(System.in)); 
             RS=STMT.executeQuery("SELECT * FROM location"); 
             RSMD=RS.getMetaData(); 
             StringBuffer FinStr=new StringBuffer("INSERT INTO location VALUES ("); 
             for(int i=1;i<=RSMD.getColumnCount();i++){ 
  
                 String TS=new String(); 
                 System.out.print(RSMD.getColumnName(i)+" : "); 
                 TS=Br.readLine(); 
                 if(RSMD.getColumnType(i)==12){ 
                     TS="\""+TS+"\""; 
                 } 
                 if(RSMD.getColumnType(i)==4){ 
  
                 } 
                 if(i!=RSMD.getColumnCount()){ 
                     TS=TS+","; 
                 } 
                 FinStr.append(TS); 
                 //TS.append((String.valueOf(i)+","+Br.readLine())) 
             } 
             FinStr.append(")"); 
             //System.out.println("THE ARGUMENT STRING : "+FinStr); 
             int Suc=STMT.executeUpdate(FinStr.toString()); 
             System.out.print("ARGUMENT "+FinStr+" HAS PASSING "); 
             if(Suc==0){ 
                 System.out.print("FAILED \n"); 
             } 
             else if(Suc>0){ 
                 System.out.println("SUCCESSFUL\n"); 
             } 
  
             LOCMENU(); 
         } 
         else if(CH==3){ 
             //System.out.println("\n\nTHIS SECTION IS STILL UNDER DEVELOPMENT THANK YOU\n\n"); 
             BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); 
             RS=STMT.executeQuery("SELECT * FROM location"); 
             RSMD=RS.getMetaData(); 
             StringBuffer FinSt=new StringBuffer("UPDATE location SET LNAME = "); 
  
             while(RS.next()){ 
                 for(int i=1;i<=RSMD.getColumnCount();i++){ 
  
                     System.out.print("| "+PADL(15,RS.getString(i),' ')+" "); 
  
                 } 
                 System.out.print("|"); 
                 System.out.println(); 
             } 
             System.out.print("\n\nENTER THE ID YOU WANT TO CHANGE : "); 
             String ID = BR.readLine(); 
             System.out.print("\n\nLOCATION NAME : "); 
             String NM = BR.readLine(); 
             FinSt.append("\""+NM+"\""+" WHERE Lid = "+ID); 
             System.out.println("\nFINAL ARGUMENT : "+FinSt); 
             int Dump=STMT.executeUpdate(FinSt.toString()); 
             if(Dump==0){ 
                 System.out.println("FAILED."); 
             } 
             else if(Dump>0){ 
                 System.out.println("PASSED."); 
             } 
  
             LOCMENU(); 
         } 
         else if(CH==4){ 
             //System.out.println("\n\nTHIS SECTION IS STILL UNDER DEVELOPMENT THANK YOU\n\n"); 
             RS=STMT.executeQuery("SELECT * FROM location"); 
             RSMD=RS.getMetaData(); 
             BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){ 
                 System.out.print("-"); 
             }System.out.println(); 
             for(int i=1;i<=RSMD.getColumnCount();i++){ 
                 System.out.print("| "+PADR(20,RSMD.getColumnName(i),' ')+" "); 
             } 
             System.out.print("|");System.out.println(); 
             for(int i=0;i<max+4+(3*(RSMD.getColumnCount()-1));i++){ 
                 System.out.print("-"); 
             }System.out.println(); 
             while(RS.next()){ 
                 for(int i=1;i<=RSMD.getColumnCount();i++){ 
                     System.out.print("| "+PADR(20,RS.getString(i),' ')+" "); 
                 } 
                 System.out.print("|");System.out.println(); 
             } 
             System.out.print("\n\nTHE ID YOU WANT TO DELETE : "); 
             String ID=BR.readLine(); 
             String FinS=new String("DELETE FROM location WHERE Lid="+ID); 
             System.out.println("\n\nARGUMENT : "+FinS); 
             int Ar=STMT.executeUpdate(FinS); 
             if(Ar==0){ 
                 System.out.println("FAILED"); 
             }  
             else if(Ar>0){ 
                 System.out.println("SUCESSFUL."); 
             } 
  
             LOCMENU(); 
         } 
         else if(CH==5){ 
             System.out.println("\nENTERING TO MAIN MENU.......\n\n"); 
             MAINMENU(); 
         } 
         else{ 
             System.out.println("\n\nTHERE NO SUCH ACTION FEEDED FOR YOUR CHOICE"+CH+"\n\n"); 
             LOCMENU(); 
         } 
     } 
  
     public static void main(String[] args)throws Exception{ 
         //Connection Cnct; 
         //Statement stmt; 
         //ResultSet RS; 
         //ResultSetMetaData rsmd; 
         Class.forName("com.mysql.cj.jdbc.Driver"); 
         CNCT=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb0", "root", ""); 
         STMT=CNCT.createStatement(); 
         MAINMENU(); 
         //RS=STMT.executeQuery("SELECT * FROM "); 
         //RS=stmt.e 
     } 
 }