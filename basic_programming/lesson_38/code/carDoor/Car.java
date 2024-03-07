package lesson_38.code.carDoor;

class Car {

    private int numberOfDoors;
    private Door[] doors;

        public Car(int numberOfDoors, int doorLength, int doorHeight) {
            this.numberOfDoors = numberOfDoors;
            doors = new Door[numberOfDoors];

            for (int i = 0; i < numberOfDoors; i++) {
                doors[i] = new Door(doorLength, doorHeight);
            }
        }

        public void openDoor(int index) {
            if (index >= 0 && index < numberOfDoors) {
                doors[index].open();
            } else {
                System.out.println("неправильный номер двери");
            }
        }

        public void closeDoor(int index) {
            if (index >= 0 && index < numberOfDoors) {
                doors[index].close();
            } else {
                System.out.println("неправильный номер двери");
            }
        }

    class Door {
        private int length;
        private int height;
        private boolean isOpen;

        public Door(int length, int height) {
            this.length = length;
            this.height = height;
            this.isOpen = false;
        }

        private void open() {
            if (!isOpen) {
                isOpen = true;
                System.out.println("Дверь открывается");
            } else {
                System.out.println("Дверь уже открыта");
            }
        }

        private void close() {
            if (isOpen) {
                isOpen = false;
                System.out.println("Дверь закрывается");
            } else {
                System.out.println("Дверь уже закрыта");
            }
        }
    }
}
