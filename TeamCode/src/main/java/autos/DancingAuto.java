package autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import robot.ExplosivesRobot;

@Autonomous(name = "Dance")
public class DancingAuto extends LinearOpMode {

    ExplosivesRobot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new ExplosivesRobot(this);
        robot.setDriveTrainType(ExplosivesRobot.DriveTrainType.MECANUM);
        robot.init();

        wait(1000);

        for (int i = 0; i < 4; i++) {
            robot.drive(0.5);
            wait(500);
            robot.stop();
            wait(500);

            robot.drive(-0.5);
            wait(500);
            robot.stop();
            wait(500);
        }

        for (int i = 0; i < 4; i++) {
            robot.strafe(0.5, ExplosivesRobot.Direction.LEFT);
            wait(500);
            robot.stop();
            wait(500);

            robot.strafe(0.5, ExplosivesRobot.Direction.RIGHT);
            wait(500);
            robot.stop();
            wait(500);
        }

        for (int i = 0; i < 2; i++) {
            robot.turn(0.5, ExplosivesRobot.Direction.LEFT);
            wait(500);
            robot.stop();
            wait(500);

            robot.turn(0.5, ExplosivesRobot.Direction.RIGHT);
            wait(500);
            robot.stop();
            wait(500);

            robot.turn(0.5, ExplosivesRobot.Direction.RIGHT);
            wait(500);
            robot.stop();
            wait(500);

            robot.turn(0.5, ExplosivesRobot.Direction.LEFT);
            wait(500);
            robot.stop();
            wait(500);
        }
    }
}