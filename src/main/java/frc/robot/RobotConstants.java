// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public class RobotConstants {
    public static final double DRIVE_GEAR_RATIO = 6.12;
    public static final double STEER_GEAR_RATIO = 150.0 / 7.0;
    public static final double WHEEL_RADIUS_INCHES = 1.9;

    public static final double DRIVE_P = 0.1;
    public static final double DRIVE_I = 0;
    public static final double DRIVE_D = 1.0;
    public static final double DRIVE_SPEED = 2;
    public static final double DRIVE_VELOCITY = 2;
    public static final double DRIVE_ACCELERATION = 2;

    public static final double STEER_P = 0.3;
    public static final double STEER_I = 0;
    public static final double STEER_D = 6.0;
    public static final double STEER_SPEED = 0;
    public static final double STEER_VELOCITY = 0;
    public static final double STEER_ACCELERATION = 0;

    public static final double FRONT_LEFT_ABSOLUTE_ENCODER_OFFSET = 16.171875;
    public static final double FRONT_RIGHT_ABSOLUTE_ENCODER_OFFSET = 232.119140625;
    public static final double BACK_LEFT_ABSOLUTE_ENCODER_OFFSET = 87.36328125;
    public static final double BACK_RIGHT_ABSOLUTE_ENCODER_OFFSET = 332.9296875;

    public static final double FRONT_LEFT_X_POS_INCHES = 14.5;
    public static final double FRONT_LEFT_Y_POS_INCHES = 14.5;

    public static final double FRONT_RIGHT_X_POS_INCHES = 14.5;
    public static final double FRONT_RIGHT_Y_POS_INCHES = -14.5;

    public static final double BACK_LEFT_X_POS_INCHES = -14.5;
    public static final double BACK_LEFT_Y_POS_INCHES = 14.5;

    public static final double BACK_RIGHT_X_POS_INCHES = -14.5;
    public static final double BACK_RIGHT_Y_POS_INCHES = -14.5;

    public static final double FREE_SPEED_AT_12_VOLTS = 6;

    public static final boolean LEFT_SIDE_INVERT = false;
    public static final boolean RIGHT_SIDE_INVERT = true;
}
