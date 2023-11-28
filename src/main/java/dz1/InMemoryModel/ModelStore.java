package dz1.InMemoryModel;


import dz1.ModelElements.Camera;
import dz1.ModelElements.Flash;
import dz1.ModelElements.PoligonalModel;
import dz1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();

    private Collection<ModelChangedObserver> observers = new ArrayList<>();

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras, Collection<ModelChangedObserver> observers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.observers = observers;
    }

    public ModelStore() {
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public Collection<ModelChangedObserver> getObservers() {
        return observers;
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }

    /**
     * Нотификация изменений на уровне хранилища
     */
    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    public void addModel(PoligonalModel poligonalModel) {
        notifyChange();
    }

    public Scene getScena(int id) {
        for (Scene scene : scenes) {
            if (scene.getId() == id) {
                return scene;
            }
        }
        return null;
    }
}
