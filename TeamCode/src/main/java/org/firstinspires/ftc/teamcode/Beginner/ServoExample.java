package org.firstinspires.ftc.teamcode.Beginner;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
@Autonomous(name = "ServoExample")
public class ServoExample extends LinearOpMode {

    Servo servoFL;
    Servo servoFR;


    @Override
    public void runOpMode(){

     servoFL = hardwareMap.servo.get("servoFL");
     servoFR = hardwareMap.servo.get("servoFR");

     servoFR.setDirection(Servo.Direction.REVERSE);
     servoFL.setDirection(Servo.Direction.FORWARD);

     servoFL.setPosition(0);
     servoFR.setPosition(0);

     waitForStart();

     servoFL.setPosition(.5);
     servoFR.setPosition(.5);

     sleep(1000);

        servoFL.setPosition(0);
        servoFR.setPosition(0);



    }
}