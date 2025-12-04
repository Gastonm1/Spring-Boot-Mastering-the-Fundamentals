package com.github.gastonm1.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// Normally, Spring creates all singleton beans at startup - this is called eager initialization.
// @Lazy tells Spring: "Don't create this bean until its actually needed"
// So instead of building the object during application startup, Spring waits until something tries to use it

@Lazy
public class HeavyResource {
    public HeavyResource() {
        System.out.println("Heavy Resource created");
    }
}
