package com.example.demo.lsp.bad;

public abstract class Fruit {
    private final String name;

    protected Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}


class Banana extends Fruit {
    public Banana() {
        super("banana");
    }
}


class Apple extends Fruit {
    public Apple() {
        super("apple");
    }
}

class Orange extends Fruit {
    public Orange() {
        super("orange");
    }
}


class Monkey {
    private final String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String eat(Fruit fruit){
        if (fruit instanceof Orange) {
            return "Break !!!";
        }else {
            return "je mange " + fruit.getName();
        }
    }


}
