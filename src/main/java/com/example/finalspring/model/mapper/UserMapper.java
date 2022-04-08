package com.example.finalspring.model.mapper;

import com.example.finalspring.entity.User;
import com.example.finalspring.model.dto.UserDTO;

public class UserMapper {

    //Hỗ trợ Convert Data từ User -> UserDTO
    public static UserDTO convertToUserDTO(User user){
        UserDTO tempUser = new UserDTO();

        tempUser.setId(user.getId());
        tempUser.setName(user.getName());
        tempUser.setEmail(user.getEmail());
        tempUser.setPhone(user.getPhone());
        tempUser.setAvatar(user.getAvatar());

        return tempUser;
    }
}
