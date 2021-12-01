// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

  private double motor_Sensitivity = 0.7f;
  WPI_TalonSRX frontLeftMotor = null;
  WPI_TalonSRX frontRightMotor = null;
  WPI_TalonSRX backLeftMotor = null;
  WPI_TalonSRX backRightMotor = null;

  /** Creates a new ExampleSubsystem. */
  public Drivetrain() 
  {
    frontLeftMotor = new WPI_TalonSRX(Constants.LEFT_FRONT_MOTOR);
    frontRightMotor = new WPI_TalonSRX(Constants.RIGHT_FRONT_MOTOR);
    backLeftMotor = new WPI_TalonSRX(Constants.LEFT_BACK_MOTOR);
    backRightMotor = new WPI_TalonSRX(Constants.RIGHT_BACK_MOTOR);
    //backLeftMotor = new Speed
  }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
    //similar to the updat function in unity
  }

  @Override
  public void simulationPeriodic() 
  {
    // This method will be called once per scheduler run during simulation
  }
}
