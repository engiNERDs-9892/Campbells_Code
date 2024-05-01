package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp(group = "drive")
public class encoder_test extends LinearOpMode{
    public DcMotor fl;
    public DcMotor fr;
    public  DcMotor bl;
    public DcMotor br;

    int in = 45;

    public void runOpMode() throws InterruptedException{
        fl = hardwareMap.dcMotor.get("motorFL");
        fr = hardwareMap.dcMotor.get("motorFR");
        bl = hardwareMap.dcMotor.get("motorBL");
        br = hardwareMap.dcMotor.get("motorBR");

        fl.setDirection(DcMotorSimple.Direction.FORWARD);
        fr.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.FORWARD);
        br.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        forward_movement(.5,30);

    }

    public void forward_movement (double power, int Dist){

        fl.setDirection(DcMotorSimple.Direction.FORWARD);
        fr.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.FORWARD);
        br.setDirection(DcMotorSimple.Direction.REVERSE);

        fl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        fr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        br.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        fl.setTargetPosition(Dist * in);
        fr.setTargetPosition( Dist * in);
        bl.setTargetPosition(Dist * in);
        br.setTargetPosition( Dist* in);

        fl.setPower(power);
        fr.setPower(power);
        bl.setPower(power);
        br.setPower(power);

        fl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        fr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        bl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        br.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (opModeIsActive() && ((fl.isBusy() || fr.isBusy()))) {
        }

        // This just ends the entire movement once the position has been reached, and Resets the Encoders
        fl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        fr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        br.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
}