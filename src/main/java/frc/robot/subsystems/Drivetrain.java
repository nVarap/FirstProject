package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drivetrain extends SubsystemBase {
    // create seperate motor controllers on left and right
    private final WPI_TalonFX m_frontLeft = new WPI_TalonFX(Constants.Drivetrain.frontLeft_id);
    private final WPI_TalonFX m_backLeft = new WPI_TalonFX(Constants.Drivetrain.backLeft_id);
    private final WPI_TalonFX m_frontRight = new WPI_TalonFX(Constants.Drivetrain.frontRight_id);
    private final WPI_TalonFX m_backRight = new WPI_TalonFX(Constants.Drivetrain.backRight_id);
    // create groups out of these motor controllers (init can)

    private MotorControllerGroup m_right = new MotorControllerGroup(m_backRight, m_frontRight);
    private MotorControllerGroup m_left = new MotorControllerGroup(m_backLeft, m_frontLeft);

    // create a method to set percentage
    public Drivetrain(){
        m_frontLeft.setNeutralMode(NeutralMode.Coast);
        m_backLeft.setNeutralMode(NeutralMode.Coast);
        m_frontRight.setNeutralMode(NeutralMode.Coast);
        m_backRight.setNeutralMode(NeutralMode.Coast);

    }
    public void tankDrive(double rightSpeed, double leftSpeed){
        m_right.set(rightSpeed); 
        m_left.set(leftSpeed);
    }

}
