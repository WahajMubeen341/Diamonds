package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        // TODO -- add your code here

        switch (size){
            case 1:{
                printBox1();
                break;
            }
            case 2:{
                printBox2();
                break;
            }

            case 3:{
                printBox3();
                break;
            }

            case 4:{
                printBox4();
                break;
            }
            case 5:{
                printBox5();
                break;
            }
            case 6:{
                printBox6();
                break;
            }
            case 7:{
                printBox7();
                break;
            }
            case 8:{
                printBox8();
                break;
            }
            default: mOut.print("KINDLY SELECT A SIZE FROM '1, 2, 4 or 7'");
        }
        
    }

    // TODO -- add any helper methods here

    /**METHOD TO PRINT BOX 1*/
    public void printBox1(){
        for (int row=0; row <=2 ; row++){ //for row
            for (int col=0; col<=3; col++){ //for column

                if(row==0 || row==2){   // for 1st and last row
                   if(col==0){
                       mOut.print("+");
                   }
                   else if(col==3){
                      mOut.println("+");
                   }
                   else {mOut.print("-");}
                }


                else if(row==1){  //for 2nd row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==3){
                        mOut.println("|");
                    }
                    else if (col==1){
                        mOut.print("<");
                    }
                    else if(col==2){
                        mOut.print(">");
                    }
                }
            }
        }
    }
    /**ENDS*/


    /**Method for box 2*/
    public void printBox2(){
        for (int row=0; row<=4 ; row++){  //for rows
            for(int col=0; col<=5; col++){  //for columns
                if(row==0 || row==4){
                    if(col==0){
                        mOut.print("+");
                    }
                    else if(col==5){
                        mOut.println("+");
                    }
                    else {
                        mOut.print("-");
                    }
                }

                else if(row==1 || row ==3){ // for row 1 & 3
                    if (col==0){
                        mOut.print("|");
                    }
                    else if (col==5){
                        mOut.println("|");
                    }
                    else if(col==1 || col==4){
                        mOut.print(" ");
                    }
                    else if( (row==1 && col==2) || (row==3 && col==3) ){
                        mOut.print("/");
                    }
                    else if((row==1 && col==3) || (row==3 && col==2)){
                        mOut.print("\\");
                    }
                }

                else if(row==2){
                    if(col==0){mOut.print("|");}
                    else if(col==5){mOut.println("|");}
                    else if(col==1){mOut.print("<");}
                    else if(col==2 || col==3){mOut.print("-");}
                    else if(col==4){mOut.print(">");}
                }
            }
        }
    }
    /**ENDS*/

    /**METHOD FOR box 3*/
    public void printBox3(){
        for (int row=0; row<=6; row++){
            for(int col=0; col<=7; col++){
                if(row==0 || row==6){
                    if(col==0){
                        mOut.print("+");
                    }
                    else if(col==7){
                        mOut.println("+");
                    }
                    else {
                        mOut.print("-");
                    }
                }

                else if(row==1 || row==5){
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==7){
                        mOut.println("|");
                    }
                    else if((row==1 && col==3) || (row==5 && col==4)){
                        mOut.print("/");
                    }
                    else if((row==5 && col==3) || (row==1 && col==4)){
                        mOut.print("\\");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==2 || row==4){
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==7){
                        mOut.println("|");
                    }
                    else if((row==2 && col==2) || (row==4 && col==5)){
                        mOut.print("/");
                    }
                    else if(col == 3 || col==4){
                        mOut.print("-");
                    }
                    else if((row==2 && col==5) || (row==4 && col==2)){
                        mOut.print("\\");
                    }
                    else {
                        mOut.print(" ");
                    }
                }

                else if(row==3){
                    if(col==0){
                        mOut.print("|");
                    } else if (col == 7) {
                        mOut.println("|");
                    }
                    else if(col==1){
                        mOut.print("<");
                    }
                    else if(col==6){
                        mOut.print(">");
                    }
                    else {
                        mOut.print("=");
                    }
                }

            }
        }
    }


    /**METHOD FOR box 4*/
    public void printBox4(){
        for (int row=0; row<=8; row++){
            for (int col=0; col<=9; col++){
                if(row==0 || row==8){ // for 1st and last row
                    if(col==0){
                        mOut.print("+");
                    }
                    else if(col==9){
                        mOut.println("+");
                    }
                    else {
                        mOut.print("-");
                    }

                }

               else if(row==1 || row==7){ // for 2nd and 2ndlast row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==9){
                        mOut.println("|");
                    }
                    else if((row==1 && col==4) || (row==7 && col==5)){
                        mOut.print("/");
                    }
                    else if((row==1 && col==5) || (row==7 && col==4)){
                        mOut.print("\\");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==2 || row==6){ //for 3rd and 3rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==9){
                        mOut.println("|");
                    }
                    else if((row==2 && col==3) || (row==6 && col==6)){
                        mOut.print("/");
                    }
                    else if((row==2 && col==6) || (row==6 && col==3)){
                        mOut.print("\\");
                    }

                    else if(col==4 || col==5){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==3 || row==5){ //for 4rd and 4rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==9){
                        mOut.println("|");
                    }
                    else if((row==3 && col==2) || (row==5 && col==7)){
                        mOut.print("/");
                    }
                    else if((row==3 && col==7) || (row==5 && col==2)){
                        mOut.print("\\");
                    }

                    else if(col==3 || col==4 || col==5 || col==6){
                        mOut.print("=");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==4){
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==9){
                        mOut.println("|");
                    }
                    else if(col==1){
                        mOut.print("<");
                    }
                    else if(col==8){
                        mOut.print(">");
                    }
                    else {
                        mOut.print("-");
                    }
                }

            }
        }
    }
    /**ENDS*/


    /**METHOD FOR box 5*/
    public void printBox5(){
        for (int row=0; row<=10; row++){
            for (int col=0; col<=11; col++){
                if(row==0 || row==10){ // for 1st and last row
                    if(col==0){
                        mOut.print("+");
                    }
                    else if(col==11){
                        mOut.println("+");
                    }
                    else {
                        mOut.print("-");
                    }

                }

                else if(row==1 || row==9){ // for 2nd and 2ndlast row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==11){
                        mOut.println("|");
                    }
                    else if((row==1 && col==5) || (row==9 && col==6)){
                        mOut.print("/");
                    }
                    else if((row==9 && col==5) || (row==1 && col==6)){
                        mOut.print("\\");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==2 || row==8){ //for 3rd and 3rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==11){
                        mOut.println("|");
                    }
                    else if((row==2 && col==4) || (row==8 && col==7)){
                        mOut.print("/");
                    }
                    else if((row==8 && col==4) || (row==2 && col==7)){
                        mOut.print("\\");
                    }

                    else if(col==5 || col==6){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==3 || row==7){ //for 4rd and 4rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==11){
                        mOut.println("|");
                    }
                    else if((row==3 && col==3) || (row==7 && col==8)){
                        mOut.print("/");
                    }
                    else if((row==3 && col==8) || (row==7 && col==3)){
                        mOut.print("\\");
                    }
                    else if(col==4 || col==5 || col==6 || col==7){
                        mOut.print("=");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==4 || row==6){ //for 4rd and 4rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==11){
                        mOut.println("|");
                    }
                    else if((row==4 && col==2) || (row==6 && col==9)){
                        mOut.print("/");
                    }
                    else if((row==4 && col==9) || (row==6 && col==2)){
                        mOut.print("\\");
                    }

                    else if(col==3 ||col==4 || col==5 || col==6 || col==7 || col==8){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==5){
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==11){
                        mOut.println("|");
                    }
                    else if(col==1){
                        mOut.print("<");
                    }
                    else if(col==10){
                        mOut.print(">");
                    }
                    else if(col==2 ||col==3 ||col==4 ||col==5 ||col==6 ||col==7 ||col==8 ||col==9){
                        mOut.print("=");
                    }
                }

            }
        }
    }
    /**ENDS*/



    /**METHOD FOR box 6*/
    public void printBox6(){
        for (int row=0; row<=12; row++){
            for (int col=0; col<=13; col++){
                if(row==0 || row==12){ // for 1st and last row
                    if(col==0){
                        mOut.print("+");
                    }
                    else if(col==13){
                        mOut.println("+");
                    }
                    else {
                        mOut.print("-");
                    }

                }

                else if(row==1 || row==11){ // for 2nd and 2ndlast row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==13){
                        mOut.println("|");
                    }
                    else if((row==1 && col==6) || (row==11 && col==7)){
                        mOut.print("/");
                    }
                    else if((row==1 && col==7) || (row==11 && col==6)){
                        mOut.print("\\");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==2 || row==10){ //for 3rd and 3rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==13){
                        mOut.println("|");
                    }
                    else if((row==2 && col==5) || (row==10 && col==8)){
                        mOut.print("/");
                    }
                    else if((row==2 && col==8) || (row==10 && col==5)){
                        mOut.print("\\");
                    }

                    else if(col==6 || col==7){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==3 || row==9){ //for 4rd and 4rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==13){
                        mOut.println("|");
                    }
                    else if((row==3 && col==4) || (row==9 && col==9)){
                        mOut.print("/");
                    }
                    else if((row==3 && col==9) || (row==9 && col==4)){
                        mOut.print("\\");
                    }
                    else if(col==5 || col==6 || col==7 || col==8){
                        mOut.print("=");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==4 || row==8){ //for 4rd and 4rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==13){
                        mOut.println("|");
                    }
                    else if((row==4 && col==3) || (row==8 && col==10)){
                        mOut.print("/");
                    }
                    else if((row==4 && col==10) || (row==8 && col==3)){
                        mOut.print("\\");
                    }

                    else if(col==4 || col==5 || col==6 || col==7 || col==8|| col==9){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==5 || row==7){ //for 4rd and 4rd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==13){
                        mOut.println("|");
                    }
                    else if((row==5 && col==2) || (row==7 && col==11)){
                        mOut.print("/");
                    }
                    else if((row==5 && col==11) || (row==7 && col==2)){
                        mOut.print("\\");
                    }

                    else if(col==3 || col==4 || col==5 || col==6 || col==7 || col==8|| col==9 || col==10){
                        mOut.print("=");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==6){
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==13){
                        mOut.println("|");
                    }
                    else if(col==1){
                        mOut.print("<");
                    }
                    else if(col==12){
                        mOut.print(">");
                    }
                    else {
                        mOut.print("-");
                    }
                }

            }
        }
    }
    /**ENDS*/





    /**Method for box 4*/
    public void printBox7(){
        for (int row=0; row<=14; row++ ){
            for (int col=0; col<=15; col++){
                if(row==0 || row ==14){  // for 1st and last row
                    if(col==0){mOut.print("+");}
                    else if(col==15){mOut.println("+");}
                    else {mOut.print("-");}
                }

                else if(row==1 || row ==13){ //for 2nd and 2nd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==15){
                        mOut.println("|");
                    }
                    else if((row == 1 && col==7) || (row==13 && col==8)){mOut.print("/");}
                    else if((row==1 && col==8) || (row==13 && col==7)){mOut.print("\\");}
                    else {
                        mOut.print(" ");
                    }
                }

                else if(row==2 || row ==12){ //for 3rd and 3rd last row
                    if(col==0){mOut.print("|");}

                    else if(col==15){
                        mOut.println("|");
                    }
                    else if((row==2 && col==6) || (row==12 && col ==9)){
                        mOut.print("/");
                    }
                    else if((row ==2 && col==9) || (row==12 && col==6)){
                        mOut.print("\\");
                    }
                    else if(col==7 || col==8){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==3 || row==11){ //for 4th and 4th last row
                    if(col==0){mOut.print("|");}

                    else if(col==15){mOut.println("|");}
                    else if((row==3 && col==5) || (row==11 && col==10)){
                        mOut.print("/");
                    }
                    else if((row==11 && col==5) || (row==3 && col==10)){
                        mOut.print("\\");
                    }
                    else if(col==6 || col==7 || col==8 || col==9){
                        mOut.print("=");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==4 || row==10){ //for 5th and 5th last row
                    if(col==0){mOut.print("|");}

                    else if(col==15){mOut.println("|");}
                    else if((row ==4 && col==4) || (row==10 && col==11)){
                        mOut.print("/");
                    }
                    else if((row ==10 && col==4) || (row==4 && col==11)){
                        mOut.print("\\");
                    }
                    else if(col==5 || col==6 || col==7 || col==8 || col==9 || col==10){
                        mOut.print("-");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==5 || row==9){ //for 6th and 6th last row
                    if(col==0){mOut.print("|");}

                    else if(col==15){mOut.println("|");}
                    else if((row ==5 && col==3) || (row==9 && col==12)){
                        mOut.print("/");
                    }
                    else if((row ==9 && col==3) || (row==5 && col==12)){
                        mOut.print("\\");
                    }
                    else if(col==4 || col==5 || col==6 || col==7 || col==8 || col==9 || col==10 || col==11){
                        mOut.print("=");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==6 || row==8){ //for 7th and 7th last row
                    if(col==0){mOut.print("|");}

                    else if(col==15){mOut.println("|");}

                    else if((row ==6 && col==2) || (row==8 && col==13)){
                        mOut.print("/");
                    }
                    else if((row ==8 && col==2) || (row==6 && col==13)){
                        mOut.print("\\");
                    }
                    else if(col==3 || col==4 || col==5 || col==6 || col==7 || col==8 || col==9 || col==10 || col==11 || col==12){
                        mOut.print("-");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==7){ //for 8th row
                    if(col==0){mOut.print("|");}

                    else if(col==15){mOut.println("|");}

                    else if(col==1){
                        mOut.print("<");
                    }
                    else if(col==14){
                        mOut.print(">");
                    }
                    else {mOut.print("=");}

                }

            }
        }
    }
    /**END*/




    /**Method for box 8*/
    public void printBox8(){
        for (int row=0; row<=16; row++ ){
            for (int col=0; col<=17; col++){
                if(row==0 || row ==16){  // for 1st and last row
                    if(col==0){mOut.print("+");}
                    else if(col==17){mOut.println("+");}
                    else {mOut.print("-");}
                }

                else if(row==1 || row ==15){ //for 2nd and 2nd last row
                    if(col==0){
                        mOut.print("|");
                    }
                    else if(col==17){
                        mOut.println("|");
                    }
                    else if((row == 1 && col==8) || (row==15 && col==9)){mOut.print("/");}
                    else if((row==1 && col==9) || (row==15 && col==8)){mOut.print("\\");}
                    else {
                        mOut.print(" ");
                    }
                }

                else if(row==2 || row ==14){ //for 3rd and 3rd last row
                    if(col==0){mOut.print("|");}

                    else if(col==17){
                        mOut.println("|");
                    }
                    else if((row==2 && col==7) || (row==14 && col ==10)){
                        mOut.print("/");
                    }
                    else if((row ==2 && col==10) || (row==14 && col==7)){
                        mOut.print("\\");
                    }
                    else if(col==8 || col==9){
                        mOut.print("-");
                    }
                    else {mOut.print(" ");}
                }

                else if(row==3 || row==13){ //for 4th and 4th last row
                    if(col==0){mOut.print("|");}

                    else if(col==17){mOut.println("|");}
                    else if((row==3 && col==6) || (row==13 && col==11)){
                        mOut.print("/");
                    }
                    else if((row==3 && col==11) || (row==13 && col==6)){
                        mOut.print("\\");
                    }
                    else if(col==7 || col==8 || col==9 || col==10){
                        mOut.print("=");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==4 || row==12){ //for 5th and 5th last row
                    if(col==0){mOut.print("|");}

                    else if(col==17){mOut.println("|");}
                    else if((row ==4 && col==5) || (row==12 && col==12)){
                        mOut.print("/");
                    }
                    else if((row ==4 && col==12) || (row==12 && col==5)){
                        mOut.print("\\");
                    }
                    else if(col==5 || col==6 || col==7 || col==8 || col==9 || col==10 || col==11){
                        mOut.print("-");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==5 || row==11){ //for 6th and 6th last row
                    if(col==0){mOut.print("|");}

                    else if(col==17){mOut.println("|");}
                    else if((row ==5 && col==4) || (row==11 && col==13)){
                        mOut.print("/");
                    }
                    else if((row ==5 && col==13) || (row==11 && col==4)){
                        mOut.print("\\");
                    }
                    else if(col==5 || col==6 || col==7 || col==8 || col==9 || col==10 || col==11 || col==12){
                        mOut.print("=");
                    }
                    else{
                        mOut.print(" ");
                    }

                }

                else if(row==6 || row==10){ //for 7th and 7th last row
                    if(col==0){mOut.print("|");}

                    else if(col==17){mOut.println("|");}

                    else if((row ==6 && col==3) || (row==10 && col==14)){
                        mOut.print("/");
                    }
                    else if((row ==6 && col==14) || (row==10 && col==3)){
                        mOut.print("\\");
                    }
                    else if(col==4 || col==5 || col==6 || col==7 || col==8 || col==9 || col==10 || col==11 || col==12 || col==13){
                        mOut.print("-");
                    }
                    else{
                        mOut.print(" ");
                    }

                }


                else if(row==7 || row==9){ //for 7th and 7th last row
                    if(col==0){mOut.print("|");}

                    else if(col==17){mOut.println("|");}

                    else if((row ==7 && col==2) || (row==9 && col==15)){
                        mOut.print("/");
                    }
                    else if((row ==7 && col==15) || (row==9 && col==2)){
                        mOut.print("\\");
                    }
                    else if(col==3 || col==4 || col==5 || col==6 || col==7 || col==8 || col==9 || col==10 || col==11 || col==12 || col==13 || col==14){
                        mOut.print("=");
                    }
                    else{
                        mOut.print(" ");
                    }

                }


                else if(row==8){ //for 8th row
                    if(col==0){mOut.print("|");}

                    else if(col==17){mOut.println("|");}

                    else if(col==1){
                        mOut.print("<");
                    }
                    else if(col==16){
                        mOut.print(">");
                    }
                    else {mOut.print("-");}

                }

            }
        }
    }

    /***END*/



}
