package Question_05;

class Cell {
    Cell() {
        System.out.println("Cell constructor called");
    }
}

class TinyCell extends Cell {
    TinyCell() {
        System.out.println("TinyCell constructor called");
    }
}

class MicroscopicCell extends TinyCell {
    MicroscopicCell() {
        System.out.println("MicroscopicCell constructor called");
    }
}


