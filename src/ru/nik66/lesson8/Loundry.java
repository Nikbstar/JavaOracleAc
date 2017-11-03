package ru.nik66.lesson8;

public class Loundry {

    public void clean(Cleanable thing) {
        // Метода howToClean еще нету, а благодаря интерфейсу его уже можно использовать в написании кода.
        System.out.println(thing.getClass().getSimpleName() + "is cleaned with " + thing.howToClean());
    }

}
