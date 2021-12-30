package com.dgutman.hyper.container;

public class Container {
    public static Container instance = null;

    private Container()
    {
        // ensuring that a new instance is a singleton
    }

    public static Container getInstance()
    {
        if (Container.instance != null)
        {
            return instance;
        }

        Container.instance =  new Container();

        return Container.instance;
    }
}
