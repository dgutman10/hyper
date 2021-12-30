package com.dgutman.test;

import com.dgutman.hyper.container.Container;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    @Test
    @DisplayName("should be a singleton instance")
    public void caseOne()
    {
        Container container1 = Container.getInstance();
        Container container2 = Container.getInstance();

        assertSame(container1, container2);
    }
}