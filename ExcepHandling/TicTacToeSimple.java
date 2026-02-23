package ExcepHandling;
import java.util.Scanner;

public class TicTacToeSimple {

    // Function to check if someone won
    public static char checkWinner(char[] board) {
        int[][] winPositions = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // columns
            {0,4,8}, {2,4,6}            // diagonals
        };

        for (int[] pos : winPositions) {
            if (board[pos[0]] == board[pos[1]] &&
                board[pos[1]] == board[pos[2]]) {
                return board[pos[0]]; // Return 'X' or 'O'
            }
        }
        return ' '; // No winner yet
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] board = {'1','2','3','4','5','6','7','8','9'};
        char player = 'X';
        int choice;

        while (true) {

            // Display board
            System.out.println();
            System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("---|---|---");
            System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("---|---|---");
            System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
            System.out.println();

            try {
                System.out.print("Player " + player + ", enter slot number (1-9): ");
                choice = sc.nextInt();

                // Check range
                if (choice < 1 || choice > 9) {
                    throw new IllegalArgumentException("Number must be between 1 and 9.");
                }

                // Check if already filled
                if (board[choice - 1] == 'X' || board[choice - 1] == 'O') {
                    throw new IllegalArgumentException("Slot already filled!");
                }

                // Place player symbol
                board[choice - 1] = player;

                // Check winner
                char winner = checkWinner(board);
                if (winner != ' ') {
                    // Display final board
                    System.out.println();
                    System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
                    System.out.println("---|---|---");
                    System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
                    System.out.println("---|---|---");
                    System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
                    System.out.println();
                    System.out.println("Player " + winner + " wins! 🎉");
                    break; // End game
                }

                // Check draw
                boolean draw = true;
                for (char c : board) {
                    if (c != 'X' && c != 'O') {
                        draw = false;
                        break;
                    }
                }
                if (draw) {
                    System.out.println("It's a draw!");
                    break; // End game
                }

                // Switch player
                player = (player == 'X') ? 'O' : 'X';

            } catch (Exception e) {
                System.out.println("Invalid input! " + e.getMessage());
                sc.nextLine(); // clear wrong input
            }
        }

        sc.close();
    }
}