package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp(group = "drive")
public class Auto_Power extends LinearOpMode{
    public DcMotor fl;
    public DcMotor fr;
    public  DcMotor bl;
    public DcMotor br;

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

        forward_movement(.2,1000);
        sleep(100);
        right_movement(.2,1000);



    }

    public void forward_movement (double power, int sleep){

        fl.setDirection(DcMotorSimple.Direction.FORWARD);
        fr.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.FORWARD);
        br.setDirection(DcMotorSimple.Direction.REVERSE);

        fl.setPower(power);
        fr.setPower(power);
        bl.setPower(power);
        br.setPower(power);

        sleep(sleep);

        fl.setPower(.0);
        fr.setPower(.0);
        bl.setPower(.0);
        br.setPower(.0);
    }
    public void right_movement (double power, int sleep){

        fl.setDirection(DcMotorSimple.Direction.FORWARD);
        fr.setDirection(DcMotorSimple.Direction.FORWARD);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);
        br.setDirection(DcMotorSimple.Direction.REVERSE);

        fl.setPower(power);
        fr.setPower(power);
        bl.setPower(power);
        br.setPower(power);

        sleep(sleep);

        fl.setPower(.0);
        fr.setPower(.0);
        bl.setPower(.0);
        br.setPower(.0);
    }
}