// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.mach.LightDrive.*; 
import java.awt.Color; 

public class Leds extends SubsystemBase {
  private final ld_object = new LightDriveCAN();
  /** Creates a new leds. */
  public Leds() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void led(Color color) {
    ld_object.SetColor(1, color);
    ld_object.Update();
  }
}
