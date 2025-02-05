import java.util.*;
import java.lang.*;
public class Main{ 
    public static void printBoard(String[][] board){
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-------");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-------");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);}
    public static boolean checkVerticle(String[][] board){
        for(int i = 0; i < board.length; i++){if(board[i][0].equals(board[i][1] + board[i][2])){return true;}}
            return false;}    
    public static boolean checkHorizontal(String[][] board){
        for(int i = 0; i < board.length; i++){if(board[0][i].equals(board[1][i] + board[2][i])){return true;}}
        return false;}
    public static boolean checkDiagonal(String[][] board){
        if(board[0][0].equals(board[1][1] + board[2][2]) || board[0][2].equals(board[1][1] + board[0][2])){return true;}
        return false; }
    public static boolean checkBoard(String[][] board){
        for(int i = 0; i < board.length; i++){for(int j = 0; j < board[i].length; j++){if(board[i][j] == " "){return true;}}}
        return false;}
    public static void main(String [] args){
        String[][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        String playerTurn = "X";
        Scanner shrek = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while(true){
            printBoard(board);
            System.out.println("player: " + playerTurn + "'s turn");
            x = shrek.nextInt();
            y = shrek.nextInt();
            if(x < 2 || y < 2){System.out.println("out of bounds!")}
            board[x][y] = playerTurn;
            if(checkBoard(board) && checkDiagonal(board) && checkHorizontal(board) && checkVerticle(board)){
                System.out.println("player: " + playerTurn + " Wins!");
                System.exit(0);}}}}
