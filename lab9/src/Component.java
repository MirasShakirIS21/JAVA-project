// Базовый класс
class Component {
    String model;

    Component(String model) {
        this.model = model;
    }

    void showInfo() {
        System.out.println("Component: " + model);
    }

    public static void main(String[] args) {
        Component cpu = new CPU("Intel i9");
        Component ram = new RAM("Corsair 16GB");
        Component gpu = new GPU("NVIDIA RTX 4090");

        cpu.showInfo();
        ram.showInfo();
        gpu.showInfo();
    }
}

// Производный класс CPU
class CPU extends Component {
    CPU(String model) {
        super(model);
    }

    @Override
    void showInfo() {
        System.out.println("CPU Model: " + model);
    }
}

// Производный класс RAM
class RAM extends Component {
    RAM(String model) {
        super(model);
    }

    @Override
    void showInfo() {
        System.out.println("RAM Module: " + model);
    }
}

// Производный класс GPU
class GPU extends Component {
    GPU(String model) {
        super(model);
    }

    @Override
    void showInfo() {
        System.out.println("GPU Model: " + model);
    }
}