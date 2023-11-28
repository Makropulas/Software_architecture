package dz1;


import dz1.InMemoryModel.ModelStore;
import dz1.InMemoryModel.Observer1;
import dz1.InMemoryModel.Observer2;
import dz1.ModelElements.PoligonalModel;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        ModelStore modelStore = new ModelStore();
        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);


        modelStore.addModel(new PoligonalModel());
    }
}
