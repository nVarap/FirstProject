package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drivetrain extends SubsystemBase {
    // create seperate motor controllers on left and right
    WPI_TalonFX m_frontLeft = new WPI_TalonFX(Constants.Drivetrain.frontLeft);
    WPI_TalonFX m_backLeft = new WPI_TalonFX(Constants.Drivetrain.backLeft);
    WPI_TalonFX m_frontRight = new WPI_TalonFX(Constants.Drivetrain.frontRight);
    WPI_TalonFX m_backRight = new WPI_TalonFX(Constants.Drivetrain.backRight);
    // create groups out of these motor controllers (init can)

    MotorControllerGroup m_right = new MotorControllerGroup(m_backRight, m_frontRight);
    MotorControllerGroup m_left = new MotorControllerGroup(m_backLeft, m_frontLeft);

    // create a method to set percentage
    public void drive(double right, double left){
        m_right.set(right); 
        m_left.set(left);
    }

}
