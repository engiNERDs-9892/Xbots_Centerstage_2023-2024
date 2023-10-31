package org.firstinspires.ftc.teamcode.DriverControl;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Xbotsset0")
public class Xbotsset0 extends LinearOpMode {

    Servo servoArmL;
    Servo servoArmR;


    @Override
    public void runOpMode() {

        servoArmL = hardwareMap.servo.get("servoArmL");
        servoArmR = hardwareMap.servo.get("servoArmR");

        servoArmL.setDirection(Servo.Direction.REVERSE);
        servoArmR.setDirection(Servo.Direction.FORWARD);

        

        waitForStart();
        while (opModeIsActive()) {

            if (gamepad1.a) {
                servoArmL.setPosition(0);
                servoArmR.setPosition(0);
            }

            if (gamepad1.b) {
                servoArmL.setPosition(.33);
                servoArmR.setPosition(.33);
            }

        }
    }
}