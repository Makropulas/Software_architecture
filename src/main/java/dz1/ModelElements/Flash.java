package dz1.ModelElements;

import java.awt.*;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void rotate(Angle3D angle) {
    }

    public void move(Point3D location) {
    }
}
