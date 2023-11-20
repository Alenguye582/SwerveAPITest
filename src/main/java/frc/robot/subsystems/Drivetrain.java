// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.BaseStatusSignal;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrain;
import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrainConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstantsFactory;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants.SwerveModuleSteerFeedbackType;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotConstants;
import frc.robot.RobotMap;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  double kP;
  double kI;
  double kD;
  double kS;
  double kV;
  double kA;
  
  private static final SwerveDrivetrainConstants DrivetrainConstants = new SwerveDrivetrainConstants()
   .withPigeon2Id(RobotMap.PIGEON_CAN)
   .withSupportsPro(false);
   
   static class CustomSlotGains extends Slot0Configs {
      public CustomSlotGains(double kP, double kI, double kD, double kS, double kV, double kA) {
         this.kP = kP;
        this.kI = kI;
        this.kD = kD;
        this.kS = kS;
        this.kV = kV;
        this.kA = kA;
         }
      }

  private static final CustomSlotGains driveGains = new CustomSlotGains(RobotConstants.DRIVE_P, RobotConstants.DRIVE_I, RobotConstants.DRIVE_D, RobotConstants.DRIVE_SPEED, RobotConstants.DRIVE_VELOCITY, RobotConstants.DRIVE_ACCELERATION);
  private static final CustomSlotGains steerGains = new CustomSlotGains(RobotConstants.STEER_P, RobotConstants.STEER_I, RobotConstants.STEER_D, RobotConstants.STEER_SPEED, RobotConstants.STEER_VELOCITY, RobotConstants.STEER_ACCELERATION);  
  
   private static final SwerveModuleConstantsFactory ConstantCreator = new SwerveModuleConstantsFactory()
      .withDriveMotorGearRatio(RobotConstants.DRIVE_GEAR_RATIO)
      .withSteerMotorGearRatio(RobotConstants.STEER_GEAR_RATIO)
      .withWheelRadius(RobotConstants.WHEEL_RADIUS_INCHES)
      .withSteerMotorGains(steerGains)
      .withDriveMotorGains(driveGains)
      // .withSpeedAt12VoltsMps(RobotConstants.FREE_SPEED_AT_12_VOLTS)
      .withFeedbackSource(SwerveModuleSteerFeedbackType.RemoteCANcoder);


private static final SwerveModuleConstants FrontLeft = ConstantCreator.createModuleConstants(
   RobotMap.FRONT_LEFT_STEER_CAN, RobotMap.FRONT_LEFT_DRIVE_CAN, RobotMap.FRONT_LEFT_ABSOLUTE_ENCODER_CAN, RobotConstants.FRONT_LEFT_ABSOLUTE_ENCODER_OFFSET, Units.inchesToMeters(RobotConstants.FRONT_LEFT_X_POS_INCHES), Units.inchesToMeters(RobotConstants.FRONT_LEFT_Y_POS_INCHES), RobotConstants.LEFT_SIDE_INVERT);

private static final SwerveModuleConstants FrontRight = ConstantCreator.createModuleConstants(
  RobotMap.FRONT_RIGHT_STEER_CAN, RobotMap.FRONT_RIGHT_DRIVE_CAN, RobotMap.FRONT_RIGHT_ABSOLUTE_ENCODER_CAN, RobotConstants.FRONT_RIGHT_ABSOLUTE_ENCODER_OFFSET, Units.inchesToMeters(RobotConstants.FRONT_RIGHT_X_POS_INCHES), Units.inchesToMeters(RobotConstants.FRONT_RIGHT_Y_POS_INCHES), RobotConstants.RIGHT_SIDE_INVERT);

private static final SwerveModuleConstants BackLeft = ConstantCreator.createModuleConstants(
  RobotMap.BACK_LEFT_STEER_CAN, RobotMap.BACK_LEFT_DRIVE_CAN, RobotMap.BACK_LEFT_ABSOLUTE_ENCODER_CAN, RobotConstants.BACK_LEFT_ABSOLUTE_ENCODER_OFFSET, Units.inchesToMeters(RobotConstants.BACK_LEFT_X_POS_INCHES), Units.inchesToMeters(RobotConstants.BACK_LEFT_Y_POS_INCHES), RobotConstants.LEFT_SIDE_INVERT);

private static final SwerveModuleConstants BackRight = ConstantCreator.createModuleConstants(
  RobotMap.BACK_RIGHT_STEER_CAN, RobotMap.BACK_RIGHT_DRIVE_CAN, RobotMap.BACK_RIGHT_ABSOLUTE_ENCODER_CAN, RobotConstants.BACK_RIGHT_ABSOLUTE_ENCODER_OFFSET, Units.inchesToMeters(RobotConstants.BACK_RIGHT_X_POS_INCHES), Units.inchesToMeters(RobotConstants.BACK_RIGHT_Y_POS_INCHES), RobotConstants.RIGHT_SIDE_INVERT);
  
public static final SwerveDrivetrain DriveTrain = new SwerveDrivetrain(DrivetrainConstants, FrontLeft,
  FrontRight, BackLeft, BackRight);


  public Drivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
