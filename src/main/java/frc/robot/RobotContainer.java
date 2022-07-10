package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;

public class RobotContainer{
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final Forward m_forward = new Forward(m_drivetrain);
  private final Elevator m_Elevator = new Elevator();

  private void configureButtonBindings() {
    XboxController Pilot = new XboxController(0);
   
    JoystickButton A = new JoystickButton(Pilot, Button.kA.value);
    JoystickButton B = new JoystickButton(Pilot, Button.kB.value);
    TankDrive m_TankDrive = new TankDrive(m_drivetrain, Pilot::getRightY, Pilot::getLeftY);
    Extend m_extend = new Extend(m_Elevator);

    m_drivetrain.setDefaultCommand(m_TankDrive);

    A.whileHeld(m_forward);
    B.whileHeld(m_extend);
  }
  public Command getAutonomousCommand() {
    return this.m_forward;
}
  public RobotContainer() {
    configureButtonBindings();
  }


}