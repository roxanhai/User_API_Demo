package com.example.finalspring.service;

import com.example.finalspring.entity.User;
import com.example.finalspring.model.dto.UserDTO;
import com.example.finalspring.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserServiceImpl implements UserService{
//    @Autowired
//    private UserRepository userRepository;

    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Nguyễn Thị Mộng Mơ", "mongmo@gmail.com","0987654321","avatar.img","123"));
        users.add(new User(2, "Bùi Như Lạc", "laclac@gmail.com","0123456789","avatar1.img","123"));
        users.add(new User(3, "Phan Thị Lỏng Lẻo", "longleo@gmail.com","0987564664","avatar3.img","123"));
        users.add(new User(4, "Bành Thị Tèo", "teo@gmail.com","0874845455","avatar9.img","123"));
    }
    @Override
    public ArrayList<UserDTO> getListUser() {
        ArrayList<UserDTO> result = new ArrayList<UserDTO>();
        for(User user : users){
            result.add(UserMapper.convertToUserDTO(user));
        }
        return result;
    }

    @Override
    public UserDTO getUserById(int Id) {
        UserDTO result = new UserDTO();
        for(User user: users){
            if(user.getId()==Id){
                result = UserMapper.convertToUserDTO(user);
                break;
            }
        }
        return result;
    }


    @Override
    public ArrayList<UserDTO> getListUserByName(String name) {
        ArrayList<UserDTO> result = new ArrayList<UserDTO>();
        for(User user : users){
            if(user.getName().contains(name)){
                result.add(UserMapper.convertToUserDTO(user));
            }
        }

        return result;
    }
}
