package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Elevator;

public class Extend extends CommandBase{
    private Elevator m_elevator;

    public Extend(Elevator elevator) {
        this.m_elevator = elevator;
        addRequirements(elevator);
    }

    @Override
    public void initialize() {
        m_elevator.stopElevator();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_elevator.extend();
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    
}
