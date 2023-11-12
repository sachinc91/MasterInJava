package com.javalearning.githubcopilot;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<UserDTO> getAllAdminUsers(List<UserDTO> userDTOS) {
        List<UserDTO> adminUsers = new ArrayList<>();
        for (UserDTO userDTO : userDTOS) {
            if (userDTO.getRole().equals("admin")) {
                adminUsers.add(userDTO);
            }
        }
        return adminUsers;
    }

    public List<String> getAdminUserNamesWithRules(List<UserDTO> userDTOS) {

        // parse admin users name with email domain is @yahoo, code is "CAB" and last_update is grater than 2021.return list of admin user name in upper case
        List<String> adminUserNames = new ArrayList<>();
        for (UserDTO userDTO : userDTOS) {
            if (userDTO.getRole().equals("admin") && userDTO.getEmail().contains("@yahoo") && userDTO.getCode().equals("CAB") && userDTO.getLast_update().getYear() > 2021) {
                adminUserNames.add(userDTO.getName().toUpperCase());
            }
        }
        return adminUserNames;
    }
}
