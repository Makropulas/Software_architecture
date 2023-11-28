package dz1.ModelElements;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Scene {
    private static int counter = 0;
    private int id;
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();

    private Collection<Camera> cameras = new ArrayList<>();

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        id = ++counter;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }


    public Camera getCamera(Point3D point) {
        for (Camera camera : cameras) {
            if (camera.getLocation().equals(point)) return camera;
        }
        return null;
    }

    public Flash getFlash(Color color, float power) {
        for (Flash flash : flashes) {
            if (flash.getColor().equals(color) && flash.getPower() == power) {
                return flash;
            }
        }
        return null;
    }
}
