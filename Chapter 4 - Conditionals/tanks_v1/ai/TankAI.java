package ai;

import game.PowerUp;
import game.Tank;
import game.TankAIBase;
import game.Vec2;

public class TankAI extends TankAIBase {

    public String getPlayerName() {
        return "Dhruv";  // <---- Put your first name here
    }
    public int getPlayerPeriod() {
        return -1;
    }
        
    // You are free to add member variables & methods to this class (and delete this comment).
    //  You should use the methods in its base class (TankAIBase) to query the world. 
    //  Note that you are not allowed to reach into game code directly or make any
    //  modifications to code in the game package. Use your judgement and ask your 
    //  teacher if you are not sure. If it feels like cheating, it probably is.

    //HELPER METHODS

    private double getDistanceFromEnemy() {
        return Vec2.distance(getTankPos(), getOther().getPos());
    }

    private boolean enemyMoving() {
        return getOther().getVel().x != 0 || getOther().getVel().y != 0 || getOther().getAngVel() != 0;
    }

    private boolean selfMoving() {
        return getTank().getVel().x != 0 || getTank().getVel().y != 0 || getTank().getAngVel() != 0;
    }

    private void move(Vec2 vec2) {
        System.out.println(getTankPos());
        System.out.println(new Vec2(getTankPos().x, vec2.y));
        queueCmd("move", new Vec2(getTankPos().x, vec2.y));
        //queueCmd("move", new Vec2(vec2.x, getTankPos().y));
        //System.out.println("MOVE");
    }

    public boolean updateAI() {
        if (!selfMoving()) {
            for (PowerUp powerUp : getPowerUps()) {
                if (getDistanceFromEnemy() > 8 && !enemyMoving() && getLevelTimeRemaining() < 85) {
                    move(powerUp.getPos());
                }
            }
        }
        return true;
    }

}