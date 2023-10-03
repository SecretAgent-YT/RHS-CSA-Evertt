
public class BreakoutChallenge {
    /* Challenge Goal
     *  In this challenge, you are implementing part of a break-out style game.
     * If you are not familiar with this type of game, check out this wiki page (and a youtube video)...
     *  https://en.wikipedia.org/wiki/Breakout_(video_game)
     *  https://www.youtube.com/watch?v=hW7Sg5pXAok 
     * 
     * The game is partially/mostly implemented for you. You are not writing the game's simulation code.
     *  What you are writing is the graphics (i.e. the display). Everything else is already completed. 
     *  The display should be implemented with ASCII style graphics, print/println...the things you are familiar with. 
     *  You get to pick the display details (like what character is used for the walls, ball, etc). 
     *  Just make it look good, make it your own.
     * 
     * The game has side/top walls, a ball, a paddle at the bottom (controlled with the mouse), and bricks.
     * 
     **********************************************************************************************
     *** THIS IS THE ONLY FILE YOU SHOULD MODIFY FOR THE MAIN/DISPLAY PORTION OF THIS CHALLENGE ***
     **********************************************************************************************
     *  
     * But...if manage to complete this, an additional challenge is to modify the game in some way.
     *  One possibility is to add support for a 'multi-ball' powerup. For this additional challenge, 
     * you can (and should) modify the other files. Be creative, make it fun.
     * 
     */
    private static Simulation sim = new Simulation();

    public static void main(String[] args) {
        int c = 0;
        while (sim.isGameActive()) {
            for (int i = 12; i >= 0; i--) {
                if (i == 12) System.out.print(" ------------------------");
                for (int k = 0; k < 24; k++) {
                    if ((k == 1 || k == 23) && i < 12) System.out.print("|");
                    if (!sim.isInGridSquare(new Vec2(k, i), k, i)) return;
                    if (sim.isBallInGridSquare(k, i)) {
                        System.out.print("0");
                    } else if (sim.isBrickInGridSquare(k, i)) {
                        System.out.print("#");
                    } else if (sim.isPaddleInGridSquare(k, i)) {
                        System.out.print("_");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            sim.endFrame();
            c++;
        }
    }
}
