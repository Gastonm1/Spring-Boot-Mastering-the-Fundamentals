package com.github.gastonm1.store;

import com.github.gastonm1.store.entities.Address;
import com.github.gastonm1.store.entities.Profile;
import com.github.gastonm1.store.entities.Tag;
import com.github.gastonm1.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder().name("Gaston").password("password").email("gaston@example.com").build();

        var profile = Profile.builder().bio("bio").build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
	}
}
