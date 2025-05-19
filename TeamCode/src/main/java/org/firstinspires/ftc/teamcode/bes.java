package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class bes extends LinearOpMode{
    double x = 0;//числа
    boolean y = true;//правда или ложь
    DcMotor FR,BR,FL,BL;
    Servo lapa;
    @Override

    public void runOpMode() throws InterruptedException {
        FR = hardwareMap.dcMotor.get("FR");//какой порт
        FR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);//свободный прорут
        FR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);//виение без енкеров
        FL = hardwareMap.dcMotor.get("FL");
        FL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BR = hardwareMap.dcMotor.get("BR");
        BR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BL = hardwareMap.dcMotor.get("BL");
        BL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        lapa=hardwareMap.servo.get("Servo1");

        waitForStart();
        while (opModeIsActive()){
            FR.setPower(gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x);
            FL.setPower(-gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x);
            BR.setPower(gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x);
            BL.setPower(-gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x);
            lapa.setPosition(1);
        }

    }
}

