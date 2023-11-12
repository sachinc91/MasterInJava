package com.javalearning.githubcopilot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserServiceTest {

    // add unit test for getAdminUserNamesWithRules method where set userDto email as 'sama@gmail.com'
    @Test
        public void testGetAdminUserNamesWithRules() {
        UserService userService = new UserService();
        List<UserDTO> userDTOS = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail("abc@gmail.com");
        userDTO.setRole("admin");
        userDTO.setCode("CAB");
        userDTO.setLast_update(new Date(2022, 1, 1));
        userDTOS.add(userDTO);
        assertEquals(1, userService.getAdminUserNamesWithRules(userDTOS).size());
    }

}
