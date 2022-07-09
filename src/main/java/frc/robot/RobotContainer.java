package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer{
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final Forward m_forward = new Forward(m_drivetrain);

  private void configureButtonBindings() {
    XboxController Pilot = new XboxController(0);
   
    JoystickButton A = new JoystickButton(Pilot, Button.kA.value);
    TankDrive m_TankDrive = new TankDrive(m_drivetrain, Pilot::getRightY, Pilot::getLeftY);

    m_drivetrain.setDefaultCommand(m_TankDrive);

    A.whileHeld(m_forward);
  }
  public Command getAutonomousCommand() {
    return this.m_forward;
}
  public RobotContainer() {
    configureButtonBindings();
  }


}