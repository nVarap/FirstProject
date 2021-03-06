
package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

import frc.robot.subsystems.Drivetrain;

public class TankDrive extends CommandBase {

    private Drivetrain m_drivetrain;
    private DoubleSupplier right;
    private DoubleSupplier left;

    public TankDrive(Drivetrain drivetrain, DoubleSupplier right, DoubleSupplier left) {

        this.m_drivetrain = drivetrain;
        this.right = right;
        this.left = left;

        addRequirements(drivetrain); // varalu know what this is 👍👍👍👍
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_drivetrain.tankDrive( right.getAsDouble(), left.getAsDouble());
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
