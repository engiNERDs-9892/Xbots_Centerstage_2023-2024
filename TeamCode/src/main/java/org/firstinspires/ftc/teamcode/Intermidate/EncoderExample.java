package org.firstinspires.ftc.teamcode.Intermidate;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "EncoderExample")
public class EncoderExample extends LinearOpMode {

    DcMotor motorFL;
    DcMotor motorBL;
    DcMotor motorBR;
    DcMotor motorFR;




    @Override
    public void runOpMode(){

    int in = 45;


    motorFR = hardwareMap.get(DcMotor.class, "motorFR");
    motorFL = hardwareMap.get(DcMotor.class, "motorFL");
    motorBR = hardwareMap.get(DcMotor.class, "motorBR");
    motorBL = hardwareMap.get(DcMotor.class, "motorBL");

    motorFR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    motorFL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    motorBL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    motorBR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


    motorFR.setDirection(DcMotorSimple.Direction.FORWARD);
    motorFL.setDirection(DcMotorSimple.Direction.REVERSE);
    motorBR.setDirection(DcMotorSimple.Direction.FORWARD);
    motorBL.setDirection(DcMotorSimple.Direction.REVERSE);

    waitForStart();

    motorFR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    motorFL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    motorBL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    motorBR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    motorFR.setTargetPosition(15 * in);
    motorFL.setTargetPosition(15 * in);
    motorBL.setTargetPosition(15 * in);
    motorBR.setTargetPosition(15 * in);

    motorFL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    motorFR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    motorBL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    motorBR.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    motorFR.setPower(.8);
    motorFL.setPower(.8);
    motorBR.setPower(.8);
    motorBL.setPower(.8);

    while (opModeIsActive() && motorFL.isBusy()) {

    }

    motorFR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    motorFL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    motorBL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    motorBR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


}

}