package frc.robot.subsystems;

import com.revrobotics.*;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Elevator extends SubsystemBase {
    public static final CANSparkMax m_elevator = new CANSparkMax(Constants.Elevator.elevator_id, MotorType.kBrushless);
    public Elevator(){
        m_elevator.setIdleMode(IdleMode.kBrake);
    }
    public void extend(){
        m_elevator.set(0.5);
        m_elevator.stopMotor();
    }
    public void retract(){
        m_elevator.set(-0.5);
        m_elevator.stopMotor();
    }

    public void stopElevator(){
        m_elevator.stopMotor();
    }

}
