package org.firstinspires.ftc.teamcode.DriverControl;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Xbotsset0")
public class Xbotsset0 extends LinearOpMode {

    Servo servoArmL;
    Servo servoArmR;
    Servo servoWristL;
    Servo servoWristR;


    @Override
    public void runOpMode() {

        servoArmL = hardwareMap.servo.get("servoArmL");
        servoArmR = hardwareMap.servo.get("servoArmR");
        servoWristL = hardwareMap.servo.get("servoWristL");
        servoWristR = hardwareMap.servo.get("servoWristR");


        servoArmL.setDirection(Servo.Direction.REVERSE);
        servoArmR.setDirection(Servo.Direction.FORWARD);
        servoWristL.setDirection(Servo.Direction.REVERSE);
        servoWristR.setDirection(Servo.Direction.FORWARD);

        

        waitForStart();
        while (opModeIsActive()) {

            // arms
            if (gamepad1.a) {
                servoArmL.setPosition(.10);
                servoArmR.setPosition(.11);
            }

            if (gamepad1.b) {
                servoArmL.setPosition(.43);
                servoArmR.setPosition(.45);
            }


            // wrist
            if (gamepad1.x) {
                servoWristR.setPosition(0);
                servoWristR.setDirection(Servo.Direction.REVERSE);
                servoWristL.setPosition(0);

            }

            if (gamepad1.y) {
                servoWristR.setPosition(.25);
                servoWristR.setDirection(Servo.Direction.REVERSE);
                servoWristL.setPosition(.25);

            }



        }
    }
}