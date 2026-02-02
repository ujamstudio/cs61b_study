package game2048logic;

import game2048rendering.Side;
import net.sf.saxon.functions.ConstantFunction;
import net.sf.saxon.functions.Minimax;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  Josh Hug
 */
public class GameLogic {
    private static final Logger log = LoggerFactory.getLogger(GameLogic.class);

    /** Moves the given tile up as far as possible, subject to the minR constraint.
     *
     * @param board the current state of the board
     * @param r     the row number of the tile to move up
     * @param c -   the column number of the tile to move up
     * @param minR  the minimum row number that the tile can land in, e.g.
     *              if minR is 2, the moving tile should move no higher than row 2.
     * @return      if there is a merge, returns the 1 + the row number where the merge occurred.
     *              if no merge occurs, then return 0.
     */
    public static int moveTileUpAsFarAsPossible(int[][] board, int r, int c, int minR) {
        // TODO: Fill this in in tasks 2, 3, 4
        int origin_v = board[r][c];
        int search_row =r;
        int target_row;

        //search possible position
        while (search_row !=0){
            search_row --;
            if (board[search_row][c] != 0){
                break;
            }
        }
//set a target
        if (search_row >=minR){
             target_row = search_row;
        } else {
            target_row = minR;
        }


        System.out.println(target_row);
        while (target_row != r) {
            if (board[target_row][c]==origin_v) {
                board[target_row][c] *= 2;
                board[r][c] = 0;
                return 1 + target_row;
            }else {
                if (board[target_row][c]==0){
                    board[target_row][c] = origin_v;
                    board[r][c]= 0;
                    return 0;
                }
                else {
                    target_row ++;
                }
            }
        }
        return 0;

    }

    /**
     * Modifies the board to simulate the process of tilting column c
     * upwards.
     *
     * @param board     the current state of the board
     * @param c         the column to tilt up.
     */
    public static void tiltColumn(int[][] board, int c) {
        // TODO: fill this in in task 5
        return;
    }

    /**
     * Modifies the board to simulate tilting all columns upwards.
     *
     * @param board     the current state of the board.
     */
    public static void tiltUp(int[][] board) {
        // TODO: fill this in in task 6
        return;
    }

    /**
     * Modifies the board to simulate tilting the entire board to
     * the given side.
     *
     * @param board the current state of the board
     * @param side  the direction to tilt
     */
    public static void tilt(int[][] board, Side side) {
        // TODO: fill this in in task 7
        if (side == Side.EAST) {
            return;
        } else if (side == Side.WEST) {
            return;
        } else if (side == Side.SOUTH) {
            return;
        } else {
            return;
        }
    }
}
