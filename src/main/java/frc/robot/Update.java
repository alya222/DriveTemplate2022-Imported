package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.drive.RevDrivetrain;

import static edu.wpi.first.wpilibj.XboxController.Axis.*;

public class Update {

    public Update () {

        SmartDashboard.putNumber("Right X Joystick Value", kRightX.value);
        SmartDashboard.putNumber("Left X Joystick Value", kLeftX.value);

        SmartDashboard.putNumber("Right Y Joystick Value", kRightY.value);
        SmartDashboard.putNumber("Left Y Joystick Value", kLeftY.value);

    }
}
