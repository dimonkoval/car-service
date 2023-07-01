package org.example.carservice.security;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.example.carservice.model.Role;
import org.example.carservice.model.Role.RoleName;
import org.example.carservice.model.User;
import org.example.carservice.service.RoleService;
import org.example.carservice.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
//        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
//        roleService.add(userRole);
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user");
        user.setRoles(Set.of(roleService.getByName("USER")));
//        userService.add(user);
//        user.setEmail("admin@gmail.com");
//        user.setPassword("admin");
//        user.setRoles(Set.of(adminRole, userRole));
//        userService.add(user);
    }
}